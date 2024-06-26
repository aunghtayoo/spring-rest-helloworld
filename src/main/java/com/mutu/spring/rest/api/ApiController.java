package com.mutu.spring.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zaw Than Oo
 * @since 01-DEC-2018
 */

@RestController
public class ApiController {

	@RequestMapping(method = RequestMethod.GET)
	public String hello() {
		return "Demo API is started....";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "Demo API is started hello...";
	}
}
