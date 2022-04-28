package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.dao.Dao;
import study.entity.EntityClass;

@RestController
@RequestMapping("/Request")
public class Controller {
	
	@Autowired
	Dao dao ;
	
	EntityClass e = new EntityClass();
	
	@PostMapping("/bfhl")
	public List<EntityClass> getAllDetails()
	{
		 
		boolean status ;
		dao.getDetails().contains(e.getNum());
			status = true ;
		
		
		return dao.getDetails();
	}

}
