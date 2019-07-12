package com.info.account.telecom.kool.response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.info.account.telecom.kool.model.AccountInfo;
import com.info.account.telecom.kool.model.BillInfo;

@Component
public class AccountInfoServiceResponse {
	
	public AccountInfoServiceResponse() {}
	
	
	/*public CustAccountInfo accountInfo;
	public CustBillInfo billInfo;


	public CustAccountInfo getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(CustAccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

	public CustBillInfo getBillInfo() {
		return billInfo;
	}

	public void setBillInfo(CustBillInfo billInfo) {
		this.billInfo = billInfo;
	}

	public class CustAccountInfo
	{
		List<AccountInfo> accountInfo;
		
		public CustAccountInfo(){}

		public List<AccountInfo> getAccountInfo() {
			return accountInfo;
		}

		public void setAccountInfo(List<AccountInfo> accountInfo) {
			this.accountInfo = accountInfo;
		}
		
		
		
	}
	
	public class CustBillInfo
	{
		List<BillInfo> billInfo;

		public CustBillInfo(){}
		
		public List<BillInfo> getBillInfo() {
			return billInfo;
		}

		public void setBillInfo(List<BillInfo> billInfo) {
			this.billInfo = billInfo;
		}
		
		
	}*/
	
	List<AccountInfo> accountInfo;
	
	List<BillInfo> billInfo;

	public List<AccountInfo> getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(List<AccountInfo> accountInfo) {
		this.accountInfo = accountInfo;
	}

	public List<BillInfo> getBillInfo() {
		return billInfo;
	}

	public void setBillInfo(List<BillInfo> billInfo) {
		this.billInfo = billInfo;
	}
	
	

}
