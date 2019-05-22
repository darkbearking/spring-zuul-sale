 package org.dark;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author liwei
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ServletComponentScan
public class SaleApp {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(SaleApp.class).web(true).run(args);
	}

}
