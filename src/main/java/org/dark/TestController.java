package org.dark;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@Configuration
public class TestController {
	
	@Autowired
	private MemberClient memberClient;
	
	@RequestMapping(value = "/food-sale/{memberId}", method = RequestMethod.GET)
	public String foodSale(@PathVariable Integer memberId) {
		Member m = memberClient.getMember(memberId);
		System.out.println(m.getId() + "==" + m.getName());
		return "success";
	}
}
