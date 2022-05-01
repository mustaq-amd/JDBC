package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.masai"})
@PropertySource("city.properties")
public class AppConfig {

	@Bean("slist")
	public List<Student> getStudentList(){
			
			List<Student> studentList=new ArrayList<>();
			
			studentList.add(new Student(1, "ram", 15));
			studentList.add(new Student(2, "bheem", 14));
			studentList.add(new Student(3, "ssr", 18));
			studentList.add(new Student(4, "alia", 13));
			studentList.add(new Student(5, "olivia", 12));
			
			return studentList;
	}


}
