package Models;

import Services.BankAccount;

public class NationalBankAccount implements BankAccount {
    public String fullName;
    public Integer balance;
    public String accountNumber;
    public String pinCode;

    public NationalBankAccount() {
    }

    public NationalBankAccount(String fullName, Integer balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        if (balance < credit + 200) {
            System.out.println("Sorry but you bomj");
        } else {
            System.out.println("Operation success");
            balance -= credit + 200;
        }
    }

    @Override
    public void debetBalance(int debet) {
        balance += debet;
    }

    @Override
    public String accountData() {
        return "NationalBankAccount{" +
                "fullName='" + fullName + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
