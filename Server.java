package com.kodewala.serlizability1;

public class Server implements Cloneable {
	
	String Google;
	String OpenAI;
	String Amazon;
	String Anthropic;
	public Server(String google, String openAI, String amazon, String anthropic) {
		super();
		Google = google;
		OpenAI = openAI;
		Amazon = amazon;
		Anthropic = anthropic;
	}
	public String getGoogle() {
		return Google;
	}
	public void setGoogle(String google) {
		Google = google;
	}
	public String getOpenAI() {
		return OpenAI;
	}
	public void setOpenAI(String openAI) {
		OpenAI = openAI;
	}
	public String getAmazon() {
		return Amazon;
	}
	public void setAmazon(String amazon) {
		Amazon = amazon;
	}
	public String getAnthropic() {
		return Anthropic;
	}
	public void setAnthropic(String anthropic) {
		Anthropic = anthropic;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
