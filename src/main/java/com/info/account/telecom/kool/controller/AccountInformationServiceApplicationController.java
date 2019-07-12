package com.info.account.telecom.kool.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.info.account.telecom.kool.model.AccountInfo;
import com.info.account.telecom.kool.model.BillInfo;
import com.info.account.telecom.kool.response.AccountInfoServiceResponse;
//import com.info.account.telecom.kool.response.AccountInfoServiceResponse.CustAccountInfo;
//import com.info.account.telecom.kool.response.AccountInfoServiceResponse.CustBillInfo;
import com.info.account.telecom.kool.service.AccountInfoService;

@RestController
public class AccountInformationServiceApplicationController {
	
	
	@Autowired
	AccountInfoService service;
	
	@Autowired
	AccountInfoServiceResponse response;
	
	@Autowired
	List<AccountInfo> accountInfo;
	
	@Autowired
	List<BillInfo> billInfo;
	
	
	
	private Logger logger = LoggerFactory.getLogger(AccountInformationServiceApplicationController.class);
    
    @GetMapping("/account-info-service/searchAccountsByCustomerId/{custId}")
    public List<AccountInfo> getAccountsByCustId(@PathVariable String custId) {
       return service.getAccountsByCustId(custId);
    }
    
    @GetMapping("/account-info-service/searchAccountsAndBillsByCustomerId/{custId}")
    public AccountInfoServiceResponse getCustAccountAndBillInfo(@PathVariable String custId) {
       accountInfo =  service.getAccountsByCustId(custId);
       
       if(null == accountInfo || accountInfo.size() == 0)
       {
    	   return null; 
       }
       else
       {
    	   response.setAccountInfo(accountInfo);
    	   billInfo = service.getBillByAccount(accountInfo.get(0).getAccountId());
    	   if (null != billInfo || billInfo.size() != 0)
        	   response.setBillInfo(billInfo);
       }
       
       return response;
    }
    
    


}
