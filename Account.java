package com.kodewala.serializablityorignal;

import java.io.Serializable;


public class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	String accountNo;
	String name;
	public Account(String accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
