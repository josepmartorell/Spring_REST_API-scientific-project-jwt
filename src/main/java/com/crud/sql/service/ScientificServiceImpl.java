package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IScientificDAO;
import com.crud.sql.dto.Scientific;

@Service
public class ScientificServiceImpl implements IScientificService{
	
	@Autowired
	IScientificDAO iScientificDAO;

	@Override
	public List<Scientific> listScientifics() {
		// TODO Auto-generated method stub
		return iScientificDAO.findAll();
	}

	@Override
	public Scientific saveScientific(Scientific scientific) {
		// TODO Auto-generated method stub
		return iScientificDAO.save(scientific);
	}

	@Override
	public Scientific scientificXID(String dni) {
		// TODO Auto-generated method stub
		return iScientificDAO.findById(dni).get();
	}

	@Override
	public Scientific updateScientific(Scientific scientific) {
		// TODO Auto-generated method stub
		return iScientificDAO.save(scientific);
	}

	@Override
	public void eliminateScientific(String dni) {
		// TODO Auto-generated method stub
		iScientificDAO.deleteById(dni);
	}

}
