package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") //By default Spring follows Singleton scope
public class Home {
	
	public Home() {
		System.out.println("Home Constructor");
	}
	private int doorNumber;
	private String ownerName;
	
	@Autowired
	private InternetConnection ic;
	
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void connect() {
		ic.switchOn();
		System.out.println("Connecting to internet");
	}
	
}
