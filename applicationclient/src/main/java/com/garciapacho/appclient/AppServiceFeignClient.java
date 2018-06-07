package com.garciapacho.appclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("appservice")
public interface AppServiceFeignClient {
	@RequestMapping(method = RequestMethod.GET, 
			        value = "/appservice/", 
			        consumes = "application/text")
	String getValue();

}