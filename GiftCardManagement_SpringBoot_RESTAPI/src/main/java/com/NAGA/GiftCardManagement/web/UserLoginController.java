package com.NAGA.GiftCardManagement.web;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.NAGA.GiftCardManagement.model.CardUser;
import com.NAGA.GiftCardManagement.model.UserTransactions;
import com.NAGA.GiftCardManagement.service.UserTransactionService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/GiftCardManagement/api/v1")
public class UserLoginController {
	  
	   UserTransactionService userService=new UserTransactionService();
	   
	    @GetMapping("/Transactions")		   
	    public List<UserTransactions> getTransactions() {
	    	
	    	
	    	return   userService.TransactionsList();
	    }
	    
	    


}
