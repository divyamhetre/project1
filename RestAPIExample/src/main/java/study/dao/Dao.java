package study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.entity.EntityClass;
import study.repository.MyRepository;

@Service
public class Dao {
	
	@Autowired
	MyRepository repo ;

	public List<EntityClass> getDetails() {
		 
		return repo.getAll();
	}

}
