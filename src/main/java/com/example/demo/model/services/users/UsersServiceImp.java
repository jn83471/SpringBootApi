package com.example.demo.model.services.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.UserDao;
import com.example.demo.models.entity.User;

@Service
public class UsersServiceImp implements IclienteService{

	@Autowired
	private UserDao users;
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>)users.findAll();
	}

	@Override
	public User save(User clientes) {
		// TODO Auto-generated method stub
		return users.save(clientes);
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return users.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		users.deleteById(id);
	}

	@Override
	public User findByNameData(String name, String password) {
		// TODO Auto-generated method stub
		List<User> u= users.findAllUsers(name, password);
		if(u.size()>0) {
			return u.get(0);
		}
		else {
			return null;
		}
	}


}
