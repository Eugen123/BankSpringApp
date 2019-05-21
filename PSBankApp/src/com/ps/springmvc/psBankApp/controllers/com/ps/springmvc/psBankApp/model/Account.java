package com.ps.springmvc.psBankApp.controllers.com.ps.springmvc.psBankApp.model;

public class Account {
    private Integer accountNo;
    private String accountHolder;
    private Integer balance;

    public Account(){
        accountNo = 0;
        accountHolder = "";
        balance = 0;
    }

    public Account(Integer accountNo, String accountHolder, Integer balance){
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
