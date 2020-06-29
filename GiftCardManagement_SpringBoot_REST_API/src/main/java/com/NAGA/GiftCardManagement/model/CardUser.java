package com.NAGA.GiftCardManagement.model;

public class CardUser {
	private long id;
    private String Password;
    
	public CardUser(long id, String password) {
		super();
		this.id = id;
		Password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}
