package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Doner {
	
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private int id;
	private String name;
	private String state;
	private String city;
	private String bloodgroup;
	@Id
	private String phone;
	
	public Doner()
	{
		
	}
	public Doner(String name, String state, String city, String bloodgroup, String phone) {
		super();
		
		this.name = name;
		this.state = state;
		this.city = city;
		this.bloodgroup = bloodgroup;
		this.phone = phone;
	}
//	public int getId() {
//		return id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
