package jb.payload;

import jb.model.User;
import lombok.*;


public class AddUserRequest {
	private User user;
	private Long roleId;
	
	
	
	
	public AddUserRequest() {
	
	}
	
	public AddUserRequest(User user, Long roleId) {
		super();
		this.user = user;
		this.roleId = roleId;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
