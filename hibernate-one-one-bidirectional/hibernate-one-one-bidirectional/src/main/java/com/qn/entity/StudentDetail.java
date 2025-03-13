package com.qn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_detail")
public class StudentDetail {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 @Column(name="id")
 private int id;
 @Column(name="branch")
 private String branch;
 @Column(name="hobby")
 private String hobby;
 
 @OneToOne(mappedBy="sd", cascade=CascadeType.ALL)
 private student s;//mapped by is used for foreign key of student 
 //same coloumn use join differnt map
 
 
public String getBranch() {
	return branch;
}
public StudentDetail(student s) {
	super();
	this.s = s;
}
public student getS() {
	return s;
}
public void setS(student s) {
	this.s = s;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getHobby() {
	return hobby;
}
public void setHobby(String hobby) {
	this.hobby = hobby;
}
@Override
public String toString() {
	return "StudentDetail [id=" + id + ", branch=" + branch + ", hobby=" + hobby + "]";
}
public StudentDetail(String branch, String hobby) {
	super();
	this.branch = branch;
	this.hobby = hobby;
}
public StudentDetail() {
	super();
}

}
