package com.example.demo.model.services.prospect;

import java.util.List;

import com.example.demo.models.entity.Prospect;
import com.example.demo.models.entity.User;

public interface IprospectService {
	public List<Prospect> findAll();
	
	public Prospect save(User clientes);
	
	public Prospect findById(Long id);
	
	public void delete(Long id);
}
