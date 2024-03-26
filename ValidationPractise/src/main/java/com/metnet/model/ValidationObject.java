package com.metnet.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ValidationObject implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 6114953293851238501L;
	
	
	private String messgase;
	
	private int statusCode;
	
	private Date time;

}
