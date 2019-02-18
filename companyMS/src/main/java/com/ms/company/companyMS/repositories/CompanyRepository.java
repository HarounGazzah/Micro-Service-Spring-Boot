package com.ms.company.companyMS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ms.company.companyMS.entities.Company;

@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
