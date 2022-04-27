package net.sparkminds.user.utils;



import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;

import io.jsonwebtoken.Jwts;

import net.sparkminds.user.entity.User;

@Component
public class JwtUtils {
	
	private static String secrect = "Secrect";
	public String generateJwt (User user) {
		 
		Date issuedAt = new Date();
		
		Claims claims = Jwts.claims().setIssuer(Long.toString(user.getId())).setIssuedAt(issuedAt);
		return Jwts.builder().setClaims(claims).compact();
		
		
	}

}
