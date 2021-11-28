package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * public class Address { private String city; private String zipcode; //getters
 * and setters public String getCity() { return city; } public void
 * setCity(String city) { this.city = city; } public String getZipcode() {
 * return zipcode; } public void setZipcode(String zipcode) { this.zipcode =
 * zipcode; } }
 */

public class Employee {
	   private int empno;
	   private String ename;
	   @Autowired
	   private Address office;
	   //getter and setter methods for all properties
	}