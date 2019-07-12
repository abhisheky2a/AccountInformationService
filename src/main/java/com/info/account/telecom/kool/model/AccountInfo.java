package com.info.account.telecom.kool.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "accountInfo")
public class AccountInfo {
	
	
	@Id
	@Field("_id")
	private String accountId;
	@Field("cust_id")
	private String custId;
	@Field("account_type")
	private String accountType;
	@Field("account_tier")
	private String accountTier;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountTier() {
		return accountTier;
	}
	public void setAccountTier(String accountTier) {
		this.accountTier = accountTier;
	}
	
	
	
	
	

}
