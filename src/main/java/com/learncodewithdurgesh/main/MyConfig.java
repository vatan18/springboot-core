package com.learncodewithdurgesh.main;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	
	private Father father;

	@Bean 
	public Student getStudent()
	{
		return new Student(father);
	}
}

