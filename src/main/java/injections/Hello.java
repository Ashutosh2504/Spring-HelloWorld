package injections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import injections.Student;

public class Hello {

	public static void main(String[] args) {
		 System.out.println( "Hello World!" );
	        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	        
	        Student student1 = (Student)context.getBean("student1");
	        System.out.println(student1 );

	}

}
