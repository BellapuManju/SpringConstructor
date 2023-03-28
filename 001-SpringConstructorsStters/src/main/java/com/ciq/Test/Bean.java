package com.ciq.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.Address;
import com.ciq.bean.Employe;
import com.ciq.bean.Helloworld;
import com.ciq.bean.Student;

public class Bean {
	public static void main(String[] args) {

ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
    
//	Helloworld hel=(Helloworld) ap.getBean("hello");
//         System.out.println(hel);

	Employe emp=(Employe) ap.getBean("eml");
	System.out.println(emp);

		Student stu = (Student) ap.getBean("ss");
		System.out.println(stu);
         

	}
}
