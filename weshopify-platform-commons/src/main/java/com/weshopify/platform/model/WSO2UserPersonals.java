package com.weshopify.platform.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WSO2UserPersonals implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1372705619434103269L;
	
	//first name
	private String givenName;
	
	//last name
	private String familyName;

}
