package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Assignment;

public interface IAssignmentDAO extends JpaRepository<Assignment, Integer>{

}
