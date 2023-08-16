package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class Customer {
	
	@Id
	private String CustomerID;
	
	@Column(name="FirstName", nullable=false)
	private String FirstName;
	
	@Column(name="LastName", nullable=false)
	private String LastName;
	
	@Column(name="Password", nullable=false)
	private String Password;
	
	@Column(name="Address", nullable=false)
	private String Address;
	
	@Column(name="DOB" , nullable=false)
	private Date DOB;
	
	@Column(name="ContactNo", nullable=false)
	private String ContactNo;
	
	@Column(name="Email", nullable=false)
	private String Email;
	
	//Default constructor
	public Customer() {
		
	}
	
	//Parameterised
	

	public String getCustomerID() {
		return CustomerID;
	}

	public Customer(String firstName, String lastName, String password, String address, Date dOB, String contactNo,
			String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Password = password;
		Address = address;
		DOB = dOB;
		ContactNo = contactNo;
		Email = email;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	//getter-setter
}
