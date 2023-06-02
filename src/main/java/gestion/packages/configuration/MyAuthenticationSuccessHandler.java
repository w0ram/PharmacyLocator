package gestion.packages.configuration;

import java.io.IOException;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {


	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			org.springframework.security.core.Authentication authentication) throws IOException, ServletException {
		if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("ADMIN"))) {
            response.sendRedirect("/AddVilles");
        } else {
            response.sendRedirect("/home");
        }
		
	}
}
