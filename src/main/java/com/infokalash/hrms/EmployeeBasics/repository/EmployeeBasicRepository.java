package com.infokalash.hrms.EmployeeBasics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infokalash.hrms.EmployeeBasics.model.EmployeeBasic;

@Repository
public interface EmployeeBasicRepository extends JpaRepository<EmployeeBasic, Long> {

}
