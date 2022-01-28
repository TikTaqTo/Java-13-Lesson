package Models;

import Services.BankAccount;

public class CityBankAccount implements BankAccount {
    public String name;
    public String surname;
    public Integer balance;
    public String accountNumber;
    public String pinCode;

    public CityBankAccount() {
    }

    public CityBankAccount(String name, String surname, Integer balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        if (balance < credit) {
            System.out.println("Sorry but you bomj");
        } else {
            System.out.println("Operation success");
            balance -= credit;
        }
    }

    @Override
    public void debetBalance(int debet) {
        balance += debet;
    }

    @Override
    public String accountData() {
        return "CityBankAccount{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
