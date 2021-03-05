package com.coursedemo.courses.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = true, unique = true)
	private int id;
	
	@Column(name = "course_name", nullable = true)
	private String courseName;
	
	@Column(name = "price", nullable = true)
	private double price;
	
	@Column(name = "taxes", nullable = true)
	private double taxes;
	
	@Column(name = "others_cost", nullable = true)
	private double othersCost;
	
	@Column(name = "country", nullable = true)
	private String country;
	
	@Column(name = "duration", nullable = true)
	private String duration;
	
	@Column(name = "description", nullable = true)
	private String description;

	public Course() {
		
	}

	public Course(int id, String courseName, double price, double taxes, double othersCost, String country,
			String duration, String description) {
		this.id = id;
		this.courseName = courseName;
		this.price = price;
		this.taxes = taxes;
		this.othersCost = othersCost;
		this.country = country;
		this.duration = duration;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public double getOthersCost() {
		return othersCost;
	}

	public void setOthersCost(double othersCost) {
		this.othersCost = othersCost;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	


}
