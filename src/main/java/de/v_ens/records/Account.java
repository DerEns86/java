package de.v_ens.records;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {

    private String accountNumber;
    private BigDecimal balance;
    private Client customer;

    public Account(String accountNumber, BigDecimal balance, Client customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Client getCustomer() {
        return customer;
    }

    public void setCustomer(Client customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(balance, account.balance) && Objects.equals(customer, account.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance, customer);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}
