package it.springbootlearnbydoing.jareview.enums;

public enum UserType {
	author("author"),
	reviewer("reviewer");
	
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
 	UserType(String type) {
		this.type = type;
	}
}
