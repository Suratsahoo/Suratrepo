package ho.per.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import ho.per.controller.StudentController;

public class Clienttest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sno,name,m1,m2,m3;
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/ho/per/cfgs/applicationContext.xml"));
		StudentController controller=factory.getBean("stController",StudentController.class);
		
		System.out.print("Enter Serial Number-->");
		sno=sc.next();
		System.out.print("Enter Student Name-->");
		name=sc.next();
		System.out.print("Enter the marks1-->");
		m1=sc.next();
		System.out.print("Enter the marks2-->");
		m2=sc.next();
		System.out.print("Enter the marks3-->");
		m3=sc.next();
		System.out.println(controller.process(sno,name,m1,m2,m3));
		

	}

}
