package com.HibernateExample.EmployeeManagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner Command(EmployeeDAo dAo){
		
		return runner->{

			createEmployee(dAo);


		};
	}
	


	public void createEmployee(EmployeeDAo dAo){


		System.out.println("Hii");

		Employee e1= new Employee(1,"Abc",195132);
		dAo.save(e1);
		
		
		
	}

}
