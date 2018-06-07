package com.garciapacho.appservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RestController
	@RequestMapping(value = "appservice")
	@RefreshScope
	public class AppServiceController {


		@Value("${eureka.instance.metadataMap.zone}")
		private String zone;
		
		@Value("${server.port}")
		private String port;
		
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String getValue() {
			return "zone:"+zone + " - port:"+port;
		}

	}	
}
