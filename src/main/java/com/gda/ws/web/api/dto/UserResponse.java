package com.gda.ws.web.api.dto;

public class UserResponse {
	
	private int error;
	private UserDto userEntity;
	
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public UserDto getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserDto userEntity) {
		this.userEntity = userEntity;
	}
}
