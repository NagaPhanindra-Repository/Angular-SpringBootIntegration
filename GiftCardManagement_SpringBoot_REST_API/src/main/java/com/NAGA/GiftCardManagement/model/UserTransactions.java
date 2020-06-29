package com.NAGA.GiftCardManagement.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UserTransactions implements Serializable {
	
	public UserTransactions(String CreditedTo, String date, String Amount, String currency) {
		this.CreditedTo=CreditedTo;
		this.TransactionTime=date;
		this.Amount=Amount;
		this.Currency=currency;
	}

	private String CreditedTo;
	//@DateTimeFormat(pattern = "dd/MM/yyyy h:mm a")
	private String TransactionTime;
	
	private String Amount;
	
	private String Currency;
    

}
