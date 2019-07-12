package com.info.account.telecom.kool.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "billInfo")
public class BillInfo {
	
	@Id
	@Field("bill_id")
	private String billId;
	@Field("account_id")
	private String accountId;
	@Field("bill_amount")
	private String billAmount;
	@Field("bill_type")
	private String billType;
	@Field("deal")
	private String deal;
	@Field("deal_id")
	private String dealId;
	
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getDeal() {
		return deal;
	}
	public void setDeal(String deal) {
		this.deal = deal;
	}
	public String getDealId() {
		return dealId;
	}
	public void setDealId(String dealId) {
		this.dealId = dealId;
	}
	
	
	

}
