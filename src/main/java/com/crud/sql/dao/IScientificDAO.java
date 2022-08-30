package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Scientific;

public interface IScientificDAO extends JpaRepository<Scientific, String>{

}
