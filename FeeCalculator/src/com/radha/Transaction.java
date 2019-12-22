package com.radha;

import java.io.Serializable;
import java.time.LocalDate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transaction implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String ExternalTransactionId;
	String ClientId;
	String SecurityId	;
	String Priority;
	public String getPriority() {
		return Priority;
	}


@XmlElement	
public void setPriority(String priority) {
		Priority = priority;
	}


	public String getExternalTransactionId() {
		return ExternalTransactionId;
	}

	@XmlElement
	public void setExternalTransactionId(String externalTransactionId) {
		ExternalTransactionId = externalTransactionId;
	}


	public String getClientId() {
		return ClientId;
	}

	@XmlElement
	public void setClientId(String clientId) {
		ClientId = clientId;
	}


	public String getSecurityId() {
		return SecurityId;
	}

	@XmlElement
	public void setSecurityId(String securityId) {
		SecurityId = securityId;
	}


	public String getTransactionType() {
		return TransactionType;
	}

	@XmlElement
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}


	public LocalDate getTransactionDate() {
		return TransactionDate;
	}

	@XmlElement
	public void setTransactionDate(LocalDate transactionDate) {
		TransactionDate = transactionDate;
	}


	public Double  getMarketValue() {
		return MarketValue;
	}

	@XmlElement
	public void setMarketValue(Double marketValue) {
		MarketValue = marketValue;
	}


	public boolean isPriorityFlag() {
		return PriorityFlag;
	}

	@XmlElement
	public void setPriorityFlag(boolean priorityFlag) {
		PriorityFlag = priorityFlag;
	}


	String TransactionType;
	LocalDate  TransactionDate;
	Double  MarketValue;
	boolean PriorityFlag;
public Transaction() {
		
	}

	
	public Transaction( String ExternalTransactionId,String ClientId,String SecurityId, String Priority,String TransactionType,LocalDate  TransactionDate,
	double MarketValue,
	boolean PriorityFlag   ){
		
		this.ExternalTransactionId=ExternalTransactionId;
		this.ClientId=ClientId;
		this.SecurityId=SecurityId;
		this.Priority=Priority;
		this.TransactionType=TransactionType;
		this.TransactionDate= TransactionDate;
		this.MarketValue=MarketValue;
		this.PriorityFlag=PriorityFlag;
		
	}
	
	

}
