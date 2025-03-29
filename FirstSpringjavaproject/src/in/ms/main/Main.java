package in.ms.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ms.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_loc="/in/ms/resourse/applicationContext.xml"; 
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		Student std=(Student)context.getBean("stdId");
		std.display();
		
		System.out.println("==========================");
		
		Student std1=(Student)context.getBean("stdId2");
		std1.display();
	}
}

// spring-bean-xxx.jar
// cz-xxx.jar
// spring-context-xxx.jar
// common-logging-xxx.jar
// spring-expression-xxx.jar