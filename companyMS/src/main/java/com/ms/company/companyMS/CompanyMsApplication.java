package com.ms.company.companyMS;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.ms.company.companyMS.entities.Company;
import com.ms.company.companyMS.repositories.CompanyRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class CompanyMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyMsApplication.class, args);
	}

	
	@Bean
	CommandLineRunner start(CompanyRepository companyRepository) {
		return args ->{
			Stream.of("A","B","C").forEach(cn-> {
			companyRepository.save(new Company(null,cn,100+Math.random()*900));	
			});
			
			
			companyRepository.findAll().forEach(System.out::println);
		};
	}
}

