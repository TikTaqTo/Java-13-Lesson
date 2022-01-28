package Models;

import Services.BankAccount;

import java.util.ArrayList;

public class Database {
    public ArrayList<BankAccount> AllBankAccounts = new ArrayList<>();

    public Database() {
    }

    public Database(ArrayList<BankAccount> allBankAccounts) {
        AllBankAccounts = allBankAccounts;
    }

    public ArrayList<BankAccount> getAllBankAccounts() {
        return AllBankAccounts;
    }

    public void setAllBankAccounts(ArrayList<BankAccount> allBankAccounts) {
        AllBankAccounts = allBankAccounts;
    }

    public void AddBankAccount(BankAccount userAccount){
        AllBankAccounts.add(userAccount);
    }
}
