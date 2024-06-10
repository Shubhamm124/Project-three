package com.example.demo.repository;

import com.example.demo.model.Policy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // signals that this interface object is database related crud operations object
public interface PolicyRepository extends JpaRepository<Policy, Integer> {

//	List<Student> findByName(String name);
//
//	List<Student> findByPosition(String position);
}
