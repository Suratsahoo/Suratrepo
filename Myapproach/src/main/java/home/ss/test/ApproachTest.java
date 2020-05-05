package home.ss.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import home.ss.bo.Profile;
import home.ss.controller.ProfileController;

public class ApproachTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sno,phone;
		String name;
		ProfileController pro = null;
		ApplicationContext ac=new ClassPathXmlApplicationContext("home/ss/cfgs/applicationContext.xml");
		pro=ac.getBean("stdto",ProfileController.class);
		System.out.println("Enter the Serial Number-->");
		sno=sc.nextInt();
		System.out.println("Enter the Name-->");
		name=sc.next();
		System.out.println("Enter the Phone-->");
		phone=sc.nextInt();
		pro.process(sno,name,phone);
		
		

	}

}
