package com.learncodewithdurgesh.main;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	
	public Father father;
	
	public Certificate certificate;
	
	@Autowired
	public Student(Father father) 
	{
		  this.father=father;
				System.out.println("student is created and ");
	}
	public void StudentName()
	{
		System.out.println("name is Jati");
	}
}
