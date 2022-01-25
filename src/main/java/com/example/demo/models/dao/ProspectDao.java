package com.example.demo.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.entity.Prospect;
import com.example.demo.models.entity.User;

public interface ProspectDao extends CrudRepository<Prospect, Long>{
	@Query(value = "SELECT u FROM Prospect u INNER JOIN u.has_puesto t INNER JOIN u.hasfiles f")
	List<Prospect> findAllWithPuest();
	@Query(value = "SELECT u FROM Prospect u INNER JOIN u.has_puesto t INNER JOIN u.hasfiles f where u.id=:id")
	Prospect findAllWithPuest(@Param("id") Long name);
}
