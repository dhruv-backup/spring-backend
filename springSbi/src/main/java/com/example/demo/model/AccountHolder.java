package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "accountHolders")
public class AccountHolder {
    @Id
    private String customerID;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "accountNo", nullable = false, unique = true)
    @Size(min = 12, max = 12, message = "Account number Invalid")
    private String accountNo;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "middleName")
    private String middleName;

    @Column(name = "currentAddress", nullable = false)
    private String currentAddress;

    @Column(name = "permanentAddress", nullable = false)
    private String permanentAddress;

    @Column(name = "dob", nullable = false)
    private Date dob;

    @Column(name = "contactNo", nullable = false)
    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Contact number Invalid")
    private String contactNo;

    @Column(name = "email", nullable = false)
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Email Invalid")
    private String email;

    @Column(name = "aadharNo", nullable = false, unique = true)
    @Pattern(regexp = "^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$", message = "Aadhar number Invalid")
    private String aadharNo;

    @Column(name = "panNo", nullable = false, unique = true)
    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}", message = "PAN number Invalid")
    private String panNo;

    @Column(name = "occupation", nullable = false)
    private String occupation;

    @Column(name = "minAccountBalance", nullable = false)
    private double minAccountBalance;

    private boolean isActive;

    public AccountHolder() {
    }

    public AccountHolder(String CustomerID, String FirstName, String LastName, String AccountNo , String MiddleName, String CurrentAddress,
            String PermanentAddress, Date DOB, String ContactNo, String Email, String AadharNo, String PanNo,
            String Occupation, double MinAccountBalance, Boolean isActive) {
        super();
        this.customerID = CustomerID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.accountNo = AccountNo;
        this.middleName = MiddleName;
        this.currentAddress = CurrentAddress;
        this.permanentAddress = PermanentAddress;
        this.dob = DOB;
        this.contactNo = ContactNo;
        this.email = Email;
        this.aadharNo = AadharNo;
        this.panNo = PanNo;
        this.occupation = Occupation;
        this.minAccountBalance = MinAccountBalance;
        this.isActive = isActive;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String CustomerID) {
        this.customerID = CustomerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String AccountNo) {
        this.accountNo = AccountNo;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String MiddleName) {
        this.middleName = MiddleName;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String CurrentAddress) {
        this.currentAddress = CurrentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String PermanentAddress) {
        this.permanentAddress = PermanentAddress;
    }

    public Date getDOB() {
        return dob;
    }

    public void setDOB(Date DOB) {
        this.dob = DOB;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String ContactNo) {
        this.contactNo = ContactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String AadharNo) {
        this.aadharNo = AadharNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String PanNo) {
        this.panNo = PanNo;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String Occupation) {
        this.occupation = Occupation;
    }

    public double getMinAccountBalance() {
        return minAccountBalance;
    }

    public void setMinAccountBalance(double MinAccountBalance) {
        this.minAccountBalance = MinAccountBalance;
    }

    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }

    public boolean getIsActive()
    {
        return this.isActive;
    }

}
