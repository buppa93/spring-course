package it.springbootlearnbydoing.jareview.enums;

public enum ArticleType {
	
	actuality("actuality"),
	news("news"),
	politics("politics");
	
	private String type;
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	ArticleType(String type) {
		this.type = type;
	}
}
