package com.NAGA.GiftCardManagement.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NAGA.GiftCardManagement.model.AuthenticationBean;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/GiftCardManagement/api/v1")
public class BasicAuthController {
	
	@GetMapping(path = "/basicauth")
    public AuthenticationBean basicauth() {
		System.out.println("You are authenticated");
        return new AuthenticationBean("You are authenticated");
    }

}
