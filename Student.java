package com.hibernate.onetoone.Hibernate_OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int Sid;
	private String Sname;
	private String Smarks;
	
	@OneToOne
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSmarks() {
		return Smarks;
	}
	public void setSmarks(String smarks) {
		Smarks = smarks;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	@Override
	public String toString() {
		return "Student [Sname=" + Sname + ", Smarks=" + Smarks + ", Sid=" + Sid + "]";
	}

}
