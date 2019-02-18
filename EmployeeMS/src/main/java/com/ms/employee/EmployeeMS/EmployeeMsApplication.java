package com.ms.employee.EmployeeMS;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class EmployeeMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMsApplication.class, args);
	}

//	CommandLineRunner start(Employeerepository employeerepository) {
//		employeerepository.save(new Employee(null, "aa", "cc", "aa@esp.tn", 555));
//		List<Employee> employees = employeerepository.findAll();
//		return (CommandLineRunner) employees;
//	}
}
