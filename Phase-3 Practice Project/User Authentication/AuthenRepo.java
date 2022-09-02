package com.example.Mapping.Repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Mapping.bean.Authentication;

public interface AuthenRepo extends CrudRepository<Authentication,String> {
	
	List<Authentication> findByUsername(String username);

}
