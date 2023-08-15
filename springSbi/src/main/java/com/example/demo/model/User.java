package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accountHolders")
public class User {
    @Id
    private String CustomerID;

    @Column(name = "FirstName")
    private String FirstName;

    @Column(name = "AccountNo")
    private String AccountNo;

    @Column(name = "LastName")
    private String LastName;

    @Column(name = "MiddleName")
    private String MiddleName;

    @Column(name = "CurrentAddress")
    private String CurrentAddress;

    @Column(name = "PermanentAddress")
    private String PermanentAddress;

    @Column(name = "DOB")
    private Date DOB;

    @Column(name = "ContactNo")
    private String ContactNo;

    @Column(name = "Email")
    private String Email;

    @Column(name = "AadharNo")
    private String AadharNo;

    @Column(name = "PanNo")
    private String PanNo;

    @Column(name = "Occupation")
    private String Occupation;

    @Column(name = "MinAccountBalance")
    private double MinAccountBalance;

    public User() {
    }

    public User(String CustomerID, String FirstName, String LastName, String AccountNo , String MiddleName, String CurrentAddress,
            String PermanentAddress, Date DOB, String ContactNo, String Email, String AadharNo, String PanNo,
            String Occupation, double MinAccountBalance) {
        super();
        this.CustomerID = CustomerID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.AccountNo = AccountNo;
        this.MiddleName = MiddleName;
        this.CurrentAddress = CurrentAddress;
        this.PermanentAddress = PermanentAddress;
        this.DOB = DOB;
        this.ContactNo = ContactNo;
        this.Email = Email;
        this.AadharNo = AadharNo;
        this.PanNo = PanNo;
        this.Occupation = Occupation;
        this.MinAccountBalance = MinAccountBalance;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public String getCurrentAddress() {
        return CurrentAddress;
    }

    public void setCurrentAddress(String CurrentAddress) {
        this.CurrentAddress = CurrentAddress;
    }

    public String getPermanentAddress() {
        return PermanentAddress;
    }

    public void setPermanentAddress(String PermanentAddress) {
        this.PermanentAddress = PermanentAddress;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAadharNo() {
        return AadharNo;
    }

    public void setAadharNo(String AadharNo) {
        this.AadharNo = AadharNo;
    }

    public String getPanNo() {
        return PanNo;
    }

    public void setPanNo(String PanNo) {
        this.PanNo = PanNo;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    public double getMinAccountBalance() {
        return MinAccountBalance;
    }

    public void setMinAccountBalance(double MinAccountBalance) {
        this.MinAccountBalance = MinAccountBalance;
    }

    @Override
    public String toString() {
        return "User [CustomerID=" + CustomerID + ", FirstName=" + FirstName + ", LastName=" + LastName
                + ", MiddleName=" + MiddleName + ", CurrentAddress=" + CurrentAddress + ", PermanentAddress="
                + PermanentAddress + ", DOB=" + DOB + ", ContactNo=" + ContactNo + ", Email=" + Email + ", AadharNo="
                + AadharNo + ", PanNo=" + PanNo + ", Occupation=" + Occupation + ", MinAccountBalance="
                + MinAccountBalance + "]";
    }

}
