package at.ac.htlinn.service;

import at.ac.htlinn.model.entities.Role;
import at.ac.htlinn.model.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface MyUserDetailsService {
    UserDetails loadUserByUsername(String username);
}
