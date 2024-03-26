package com.weshopify.platform.model;

import java.io.Serializable;
import java.util.List;



import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WSO2User implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -1985517908870849157L;
	
	private String[] schemas;
	private String userName;
	private String password;
	private String[] emails;
	private String id;
	
	private WSO2UserPersonals name;
	private List<RoleModel> roles;
	private List<WSO2PhoneNumbers> phoneNumbers;

}
