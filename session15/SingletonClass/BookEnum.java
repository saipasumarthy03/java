package org.session15.SingletonClass;

public enum BookEnum {
	INSTANCE;
	private String name;
	private String id;
	private String authour;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	
	
	
	
	
	

}
