package com.example.demo.model.services.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.ProspectDao;
import com.example.demo.models.entity.Prospect;
import com.example.demo.models.entity.User;

@Service
public class ProspectServiceImp implements IprospectsService{

	@Autowired
	private ProspectDao users;
	@Override
	public List<Prospect> findAll() {
		// TODO Auto-generated method stub
		return (List<Prospect>)users.findAll();
	}

	@Override
	public List<Prospect> withvalue() {
		// TODO Auto-generated method stub
		return (List<Prospect>)users.findAllWithPuest();
	}



	@Override
	public Prospect save(Prospect clientes) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Prospect findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Prospect withvalue(Long id) {
		// TODO Auto-generated method stub
		return users.findAllWithPuest(id);
	}

}
