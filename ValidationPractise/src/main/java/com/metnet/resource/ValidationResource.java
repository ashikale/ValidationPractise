package com.metnet.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metnet.bean.Employee;

import jakarta.validation.Valid;

@RestController
public class ValidationResource {
	
	
	@PostMapping("/create")
	public ResponseEntity<List<Employee>> createEmployee(@Valid @RequestBody Employee emp){
		 List<Employee> empList= new ArrayList<Employee>();
		 //empList.add(emp);
		 ResponseEntity<List<Employee>> response=null;
		 if(empList.size()>0 && null!=empList) {
			 response= ResponseEntity.ok(empList);
		 }else {
			 throw new RuntimeException("no content found");
		 }
		
		return response;
		
		
	}

}
