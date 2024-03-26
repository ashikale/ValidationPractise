package com.weshopify.platform.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WSO2PhoneNumbers implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -698494664199828083L;
	private String type;
	private String value;

}
