package com.info.account.telecom.kool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.account.telecom.kool.model.AccountInfo;
import com.info.account.telecom.kool.model.BillInfo;
import com.info.account.telecom.kool.proxy.AccountInformationServiceProxy;
import com.info.account.telecom.kool.repository.AccountInformationRepository;

@Service
public class AccountInfoService {
	
	@Autowired
	AccountInformationRepository repo;
	
	@Autowired
	AccountInformationServiceProxy feignProxy;

	public List<AccountInfo> getAccountsByCustId(String custId) {
		
		List<AccountInfo> accountInfo = repo.findByCustId(custId);
		if (null != accountInfo && accountInfo.size() > 0)
			return accountInfo;
		else
			return null;
	}
	
	public List<BillInfo> getBillByAccount(String accountId) {
		List<BillInfo> billInfo = feignProxy.getBillByAccount(accountId);
		if (null != billInfo && billInfo.size() > 0)
			return billInfo;
		else
			return null;
	}
	
}
