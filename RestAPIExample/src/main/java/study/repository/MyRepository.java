package study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.EntityClass;

@Repository
public interface MyRepository extends JpaRepository<EntityClass, Integer>{
	
	List<EntityClass> getAll();
}

