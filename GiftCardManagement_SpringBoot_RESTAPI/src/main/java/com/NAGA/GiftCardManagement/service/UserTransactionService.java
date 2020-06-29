package com.NAGA.GiftCardManagement.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.NAGA.GiftCardManagement.model.UserTransactions;

public class UserTransactionService {
	
	
	Stream<UserTransactions> stream=Stream.of(new UserTransactions("Standard Charted","10/07/2020 05:05 AM","700.00","EUR"),
			new UserTransactions("WalMart PVT ltd","17/07/2020 09:05 AM","100.00","EUR"));
	List<UserTransactions> list=stream.collect(Collectors.toList());
	

	public List<UserTransactions> TransactionsList(){
		
		return list;
	}

}
