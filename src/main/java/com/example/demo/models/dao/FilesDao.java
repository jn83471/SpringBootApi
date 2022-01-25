package com.example.demo.models.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import com.example.demo.models.entity.FilesOfProspects;
import com.example.demo.models.entity.User;
@Service
public interface FilesDao  extends CrudRepository<FilesOfProspects, Long>{
	
}
