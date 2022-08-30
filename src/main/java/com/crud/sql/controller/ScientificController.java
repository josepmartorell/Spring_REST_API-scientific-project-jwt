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
import com.crud.sql.dto.Scientific;
import com.crud.sql.service.ScientificServiceImpl;

@RestController
@RequestMapping(name="/api")
public class ScientificController {
	
	@Autowired
	ScientificServiceImpl iScientificServiceImpl;
	
	@GetMapping("/scientifics")
	public List<Scientific> listScientifics(){
		return iScientificServiceImpl.listScientifics();		
	}
	
	@PostMapping("/scientifics")
	public Scientific saveScientific(@RequestBody Scientific scientific) {
		return iScientificServiceImpl.saveScientific(scientific);
	}
	
	@GetMapping("/scientifics/{dni}")
	public Scientific scientificXID(@PathVariable(name="dni") String dni) {
		Scientific scientific_xid = new Scientific();
		scientific_xid = iScientificServiceImpl.scientificXID(dni);
		return scientific_xid;
	}
	
	@PutMapping("/scientifics/{dni}")
	public Scientific updateScientific(@PathVariable(name="dni")String dni,@RequestBody Scientific scientific) {
		Scientific scientific_selected = new Scientific();
		Scientific scientific_updated = new Scientific();
		
		scientific_selected = iScientificServiceImpl.scientificXID(dni);		
		scientific_selected.setSurnameName(scientific.getSurnameName());
		scientific_selected.setAssignment(scientific.getAssignment());		
		scientific_updated = iScientificServiceImpl.updateScientific(scientific_selected);
		return scientific_updated;
	}
	
	@DeleteMapping("/scientifics/{dni}")
	public void eliminateScientific(@PathVariable(name="dni") String dni) {
		iScientificServiceImpl.eliminateScientific(dni);
	}

}
