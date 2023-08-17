package com.example.demo.model;

// import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Credentials")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="CustomerID", nullable=false)
	private String CustomerID;
	
	@Column(name="Password", nullable=false)
	private String Password;

	@Column(name="TransactionPassword", nullable=false)
	private String TransactionPassword;
	
	//Default constructor
	public Customer() {
		
	}
	
	//Parameterised
	

	public String getCustomerID() {
		return CustomerID;
	}

	public Long getID() {
		return id;
	}

	public Customer(long id, String password, String CustomerID, String TransactionPassword) {
		super();		
		Password = password;
		this.TransactionPassword = TransactionPassword;
		this.id = id;
		this.CustomerID = CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public void setID(Long ID) {
		id = ID;
	}

	

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getTransactionPassword() {
		return TransactionPassword;
	}

	public void setTransactionPassword(String Transactionpassword) {
		TransactionPassword = Transactionpassword;
	}
	
	//getter-setter
}
