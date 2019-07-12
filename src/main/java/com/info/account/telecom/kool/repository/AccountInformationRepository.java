package com.info.account.telecom.kool.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.info.account.telecom.kool.model.AccountInfo;

@Repository
public interface AccountInformationRepository extends MongoRepository<AccountInfo, String>{
	
	public List<AccountInfo> findByCustId(String custId);

}
