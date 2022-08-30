package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Assignment;

public interface IAssignmentService {
	//CRUD methods
	public List<Assignment> listAssignments();//READ All 	
	public Assignment saveAssignment(Assignment assignment);//CREATE	
	public Assignment assignmentXID(int id);//READ	
	public Assignment updateAssignment(Assignment assignment);//UPDATE	
	public void eliminateAssignment(int id);//DELETE

}
