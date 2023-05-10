package com.entity;

public class Specalist {
	private int id;
	private String speacalistName;
	
	public Specalist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Specalist(int id, String speacalistName) {
		super();
		this.id = id;
		this.speacalistName = speacalistName;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpeacalistName() {
		return speacalistName;
	}
	public void setSpeacalistName(String speacalistName) {
		this.speacalistName = speacalistName;
	}
	
	
}
