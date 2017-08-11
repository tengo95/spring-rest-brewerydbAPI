package com.springrest.security;

/**
 * Created by tanerali on 11/08/2017.
 */

import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import static com.springrest.security.SecurityConstants.*;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

	public JWTAuthorizationFilter(AuthenticationManager authManager) {
		super(authManager);
	}

	//AOP that inspects every incoming request except for sign-up
	@Override
	protected void doFilterInternal(HttpServletRequest req,
									HttpServletResponse res,
									FilterChain chain) throws IOException, ServletException {

		//get the header from the incoming request
		String header = req.getHeader(HEADER_STRING);

		//if header null or does not contain the token, the request will not be authenticated
		if (header == null || !header.startsWith(TOKEN_PREFIX)) {
			chain.doFilter(req, res);
			return;
		}

		//the getauthentication method parses or decrypts the token; if token valid, the
		//user and request will be authenticated;
		//otherwise, will return null
		UsernamePasswordAuthenticationToken authentication = getAuthentication(req);

		//set that authentication in the context
		//if null, user not authenticated
		SecurityContextHolder.getContext().setAuthentication(authentication);
		chain.doFilter(req, res);
	}

	//parses user tokens to verify their validity
	private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {

		//get token from header
		String token = request.getHeader(HEADER_STRING);

		//if not null, parse token
		if (token != null) {
			// parse the token.
			String user = Jwts.parser()
					.setSigningKey(SECRET)
					.parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
					.getBody()
					.getSubject();

			if (user != null) {
				//if token is authenticated, return authenticated; else non-authenticated
				return new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
			}
			return null;
		}
		return null;
	}
}
