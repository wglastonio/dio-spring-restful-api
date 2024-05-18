package com.dio.restfulApi.domain.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String accountNumber;

    private String branch;
    
    @Column(scale = 2, precision = 10)
    private BigDecimal accountBalance;

    @Column(scale = 2, precision = 10)
    private BigDecimal accountLimit;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public BigDecimal getBalance() {
        return accountBalance;
    }
    public void setBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }
    public BigDecimal getLimit() {
        return accountLimit;
    }
    public void setLimit(BigDecimal accountLimit) {
        this.accountLimit = accountLimit;
    }

}
