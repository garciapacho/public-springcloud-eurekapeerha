package com.garciapacho.appclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RestController
	@RequestMapping(value = "appclient")
	@RefreshScope
	public class AppClientController {
		
		@Autowired
		AppServiceFeignClient appServiceFeignClient;
		
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String getValue() {
			return "Message from server: " + appServiceFeignClient.getValue();
		}

	}	
	
}
