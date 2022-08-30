package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IAssignmentDAO;
import com.crud.sql.dto.Assignment;

@Service
public class AssignmentServiceImpl implements IAssignmentService{
	
	@Autowired
	IAssignmentDAO iAssignmentDAO;

	@Override
	public List<Assignment> listAssignments() {
		// TODO Auto-generated method stub
		return iAssignmentDAO.findAll();
	}

	@Override
	public Assignment saveAssignment(Assignment assignment) {
		// TODO Auto-generated method stub
		return iAssignmentDAO.save(assignment);
	}

	@Override
	public Assignment assignmentXID(int id) {
		// TODO Auto-generated method stub
		return iAssignmentDAO.findById(id).get();
	}

	@Override
	public Assignment updateAssignment(Assignment assignment) {
		// TODO Auto-generated method stub
		return iAssignmentDAO.save(assignment);
	}

	@Override
	public void eliminateAssignment(int id) {
		// TODO Auto-generated method stub
		iAssignmentDAO.deleteById(id);
	}

}
