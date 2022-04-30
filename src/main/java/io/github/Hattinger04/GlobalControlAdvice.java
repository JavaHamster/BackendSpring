package io.github.Hattinger04;


import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Component
public class GlobalControlAdvice {

	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception ex, Model model) {
		model.addAttribute("error", "Internal server error: GlobalControlAdvice"); 
		model.addAttribute("message", "Exception occured"); 
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR); 
		return "error"; 
	}
	
	@ExceptionHandler(AccessDeniedException.class) 
	public String exceptionDeniedHandler(AccessDeniedException ex, Model model) {
		model.addAttribute("error", "Access denied!"); 
		model.addAttribute("message", "You are not allowed opening this site!"); 
		model.addAttribute("status", HttpStatus.FORBIDDEN); 
		return "error"; 
	}
}
