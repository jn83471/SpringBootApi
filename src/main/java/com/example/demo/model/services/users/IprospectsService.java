package com.example.demo.model.services.users;

import java.util.List;

import com.example.demo.models.entity.Prospect;
import com.example.demo.models.entity.User;

public interface IprospectsService {
	public List<Prospect> findAll();
	
	public Prospect save(Prospect clientes);
	
	public Prospect findById(Long id);
	
	public void delete(Long id);
	
	public List<Prospect> withvalue();
	
	public Prospect withvalue(Long id);
}
