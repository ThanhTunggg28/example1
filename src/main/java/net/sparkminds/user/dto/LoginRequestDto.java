package net.sparkminds.user.dto;

public class LoginRequestDto {
	private String email;
	private String password;
	private String jwts;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJwts() {
		return jwts;
	}
	public void setJwts(String jwts) {
		this.jwts = jwts;
	}
	

}
