package com.example.demo.model;

// import java.sql.Date;

// import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "beneficiaries")

public class Beneficiary {
    @Id
    private String AccountNo;
    @Column(name = "ReceiverAccNo")
    private long ReceiverAccNo;
    @Column(name = "Nickname")
    private double Nickname;
    @Column(name = "Name")
    private String Name;

    public Beneficiary() {

    }

    public Beneficiary(String accountNo, long receiverAccNo, double nickname, String name) {
        super();
        AccountNo = accountNo;
        ReceiverAccNo = receiverAccNo;
        Nickname = nickname;
        Name = name;

    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        this.AccountNo = accountNo;
    }

    public long getReceiverAccNo() {
        return ReceiverAccNo;
    }

    public void setReceiverAccNo(long receiverAccNo) {
        this.ReceiverAccNo = receiverAccNo;
    }

    public double getNickname() {
        return Nickname;
    }

    public void setNickname(double nickname) {
        this.Nickname = nickname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}