package com.learncodewithdurgesh.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public abstract class SpringBootCoreApplication implements CommandLineRunner {

@Autowired
	private Father father;
	
	@Autowired
	private Student student;
	
	@Autowired
	private Certificate certificate;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCoreApplication.class, args);
		//ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
		//Student student =context.getBean(Student.class);
		//System.out.println(student);
		//student.StudentName();
	}


@Override
	public void run(String... args) throws Exception{
		father.working();
		student.StudentName();
		certificate.CertificateName();
	}
}