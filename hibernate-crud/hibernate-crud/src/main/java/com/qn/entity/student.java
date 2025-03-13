package com.qn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="student")

public class student {
 @Id//represents primary key
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 @Column(name="id")//column name in the table
 private int id;
 
 @Column(name="first_name")//column name in table
 private String firstname;
 
 @Column(name="last_name")//column name in table
 private String lastName;
 
 @Column(name="email")//column name in table
 private String email;


public student(String firstname, String lastName, String email) {
	super();
	this.firstname = firstname;
	this.lastName = lastName;
	this.email = email;
}



@Override
public String toString() {
	return "Student [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", email=" + email + "]";
}



public String getFirstname() {
	return firstname;
}



public void setFirstname(String firstname) {
	this.firstname = firstname;
}



public String getLastName() {
	return lastName;
}



public void setLastName(String lastName) {
	this.lastName = lastName;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public student() {
	super();
}
 
 
}