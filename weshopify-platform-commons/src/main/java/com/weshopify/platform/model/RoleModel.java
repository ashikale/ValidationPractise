package com.weshopify.platform.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class RoleModel implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 2017612110322874299L;

	private String id;

	private String displayName;

	private List<String> permissions;

	private String[] schemas;

	private String value;

	private String type;

}
