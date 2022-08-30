package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Project;

public interface IProjectDAO extends JpaRepository<Project, String>{

}
