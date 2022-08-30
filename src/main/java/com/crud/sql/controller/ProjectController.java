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

import com.crud.sql.dto.Project;
import com.crud.sql.service.ProjectServiceImpl;

@RestController
@RequestMapping(name="/api")
public class ProjectController {
	
	@Autowired
	ProjectServiceImpl projectServiceImpl;
	
	@GetMapping("/projects")
	public List<Project> listProjects(){
		return projectServiceImpl.listProjects();		
	}
	
	@PostMapping("/projects")
	public Project saveProject(@RequestBody Project project) {
		return projectServiceImpl.saveProject(project);
	}
	
	@GetMapping("/projects/{id}")
	public Project projectXID(@PathVariable(name="id") 	String id) {
		Project project_xid = new Project();
		project_xid = projectServiceImpl.projectXID(id);
		return project_xid;
	}
	
	@PutMapping("/projects/{id}")
	public Project updateProject(@PathVariable(name="id")String id,@RequestBody Project project) {
		Project project_selected = new Project();
		Project project_updated = new Project();
		
		project_selected = projectServiceImpl.projectXID(id);		
		project_selected.setName(project.getName());
		project_selected.setHours(project.getHours());
		project_selected.setAssignment(project.getAssignment());
		
		project_updated = projectServiceImpl.updateProject(project_selected);
		return project_updated;
	}
	
	@DeleteMapping("/projects/{id}")
	public void eliminateProject(@PathVariable(name="id") String id) {
		projectServiceImpl.eliminateProject(id);
	}

}
