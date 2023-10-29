package at.ac.htlinn.user.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import at.ac.htlinn.role.Role;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    @Transactional
	public UserDetails loadUserByUsername(String username) {
        User user = userService.findUserByUsername(username);
        List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
        return buildUserForAuthentication(user, authorities);
    }
    
    private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : userRoles) {
            authorities.add(new SimpleGrantedAuthority(role.getRole()));
        }
        return authorities; 
    }

    private UserDetails buildUserForAuthentication(User user, List<GrantedAuthority> authorities) {
    	return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                user.getActive(), true, true, true, authorities);
    }
    
}
