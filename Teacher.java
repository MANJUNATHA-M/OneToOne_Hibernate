package com.hibernate.onetoone.Hibernate_OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int Tid;
	private String Tname;
	private String Tsal;
	
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTsal() {
		return Tsal;
	}
	public void setTsal(String tsal) {
		Tsal = tsal;
	}
	@Override
	public String toString() {
		return "Teacher [Tid=" + Tid + ", Tname=" + Tname + ", Tsal=" + Tsal + "]";
	}
		
}
