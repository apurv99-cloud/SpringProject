package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Service.StudentService;
import com.example.demo.models.Students;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Students s = context.getBean(Students.class);
		s.setRollNo(104);
		s.setName("Apurv");
		s.setMarks(50);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Students> students = service.getStudents();
		System.out.println(students);



	}

}
