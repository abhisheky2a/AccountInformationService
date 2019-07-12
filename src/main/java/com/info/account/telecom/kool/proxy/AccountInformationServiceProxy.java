package com.info.account.telecom.kool.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.info.account.telecom.kool.model.BillInfo;


@Component
//@FeignClient(name="bill-info-service", url="localhost:8031")
//@FeignClient(name="bill-info-service")
@FeignClient(name="kool-telecom-api-gateway")
@RibbonClient(name="bill-info-service")
public interface AccountInformationServiceProxy {
	
	//@GetMapping("/bill-info-service/searchByAccount/{accountId}")
    @GetMapping("/bill-info-service/bill-info-service/searchByAccount/{accountId}")
    public List<BillInfo> getBillByAccount(@PathVariable("accountId") String accountId);

}
