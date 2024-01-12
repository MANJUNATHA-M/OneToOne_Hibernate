package com.hibernate.onetoone.Hibernate_OneToOne;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		System.out.println("project started!");
		
		Student stu=new Student();
		stu.setSid(1);
		stu.setSname("MANU");
		stu.setSmarks("78");
		
		Student stu1=new Student();
		stu1.setSid(2);
		stu1.setSname("THANU");
		stu1.setSmarks("49");
		
		Student stu2=new Student();
		stu2.setSid(3);
		stu2.setSname("DHANU");
		stu2.setSmarks("80");
		
		
		Teacher teac=new Teacher();
		teac.setTid(101);
		teac.setTname("GM");
		teac.setTsal("200000");
		
		Teacher teac1=new Teacher();
		teac1.setTid(102);
		teac1.setTname("JP");
		teac1.setTsal("289000");
		
		Teacher teac2=new Teacher();
		teac2.setTid(103);
		teac2.setTname("TLC");
		teac2.setTsal("987656");
		
		stu.setTeacher(teac);
		stu1.setTeacher(teac1);
		stu2.setTeacher(teac2);
		

		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Teacher.class);
		SessionFactory factory=con.buildSessionFactory();
		Session sess=factory.openSession();
		Transaction tran=sess.beginTransaction();
		
		List<Object>lists=new ArrayList<Object>();
		
		lists.add(stu);
		lists.add(stu1);
		lists.add(stu2);
		
		lists.add(teac);
		lists.add(teac1);
		lists.add(teac2);
		
		for(Object list : lists)
		{
			sess.save(list);
			System.out.println(list);
		}
		
		tran.commit();
		sess.close();

	}
}
