package com.metnet.bean;

import java.io.Serializable;



import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	
	@jakarta.validation.constraints.NotEmpty(message = " employee name cannot be empty")
	private String ename;
	
	@jakarta.validation.constraints.NotEmpty(message = " password cannot be empty")
	private String password;
	
	@jakarta.validation.constraints.NotEmpty(message = " mobile cannot be empty")
	private String mobile;
	

}
