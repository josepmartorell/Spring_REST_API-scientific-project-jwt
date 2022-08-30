package com.crud.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.sql.dto.Assignment;
import com.crud.sql.service.AssignmentServiceImpl;

@RestController
@RequestMapping("/api")
public class AssignmentController {
	
	@Autowired
	AssignmentServiceImpl assignmentServiceImpl;
	
	@GetMapping("/assignments")
	public List<Assignment> listAssignments(){
		return assignmentServiceImpl.listAssignments();
	}
	
	
	@PostMapping("/assignments")
	public Assignment saveAssignment(@RequestBody Assignment assignment) {
		
		return assignmentServiceImpl.saveAssignment(assignment);
	}
	
	
	@GetMapping("/assignments/{id}")
	public Assignment assignmentXID(@PathVariable(name="id") int id) {
		
		Assignment assignment_xid= new Assignment();
		
		assignment_xid = assignmentServiceImpl.assignmentXID(id);
		
		return assignment_xid;
	}
	
	@PutMapping("/assignments/{id}")
	public Assignment updateAssignment(@PathVariable(name="id")int id,@RequestBody Assignment assignment) {
		
		Assignment assignment_selected= new Assignment();
		Assignment assignment_updated= new Assignment();
		
		assignment_selected= assignmentServiceImpl.assignmentXID(id);
		
		
		assignment_selected.setScientific(assignment.getScientific());
		assignment_selected.setProject(assignment.getProject());
		assignment_selected.setRegisteredAt(assignment.getRegisteredAt());
		
		assignment_updated = assignmentServiceImpl.updateAssignment(assignment_selected);
		
		return assignment_updated;
	}
	
	@DeleteMapping("/registroCursos/{id}")
	public void eliminateAssignment(@PathVariable(name="id")int id) {
		assignmentServiceImpl.eliminateAssignment(id);
	}


}
