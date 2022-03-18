package io.github.Hattinger04.aop;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	private static Logger logger;
	private static FileHandler fileHandler; 
	static {
		logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.setLevel(Level.ALL);
		try {
			fileHandler = new FileHandler("src/main/resources/allLogs.log");
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter(); 
			fileHandler.setFormatter(formatter); 
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		} 
	}

	
	@Around(("execution(* io.github.Hattinger04.user.UserController.logoutPage(..))"))
	public Object logoutLog(ProceedingJoinPoint jp) throws Throwable {
		Object o; 
		HttpServletRequest request = (HttpServletRequest) jp.getArgs()[0]; 
		String ip = request.getRemoteAddr();
		int port = request.getRemotePort(); 
		String username = request.getRemoteUser(); 
		o = jp.proceed(); 
		logger.fine(String.format("%s - %s - %d 	[logged out]", username, ip, port)); 
		return o; 
	}
}