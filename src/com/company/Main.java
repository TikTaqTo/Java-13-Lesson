package com.company;

import Models.CityBankAccount;
import Models.Database;
import Models.NationalBankAccount;
import Services.BankAccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Database allAccount = new Database();

        BankAccount acc0 = new CityBankAccount("Mayor", "Kior", 1300, "12345", "3245");
        BankAccount acc1 = new NationalBankAccount("Boruto", 1200, "1358", "54321");

        allAccount.AddBankAccount(acc0);
        allAccount.AddBankAccount(acc1);

        while (true) {
            System.out.println("Pleas enter your card data");
            System.out.println("Account number: ");
            String accountNumber = in.next();

            System.out.println("Account pin code: ");
            String accountPinCode = in.next();

            for (var bankAccount : allAccount.AllBankAccounts) {
                if (accountNumber.compareTo(bankAccount.getAccountNumber()) == 0 && accountPinCode.compareTo(bankAccount.getPinCode()) == 0) {
                    if (bankAccount.getClass() == CityBankAccount.class) {
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                        System.out.println("PRESS [2] TO VIEW BALANCE");
                        System.out.println("PRESS [3] TO CHANGE PIN CODE");
                        System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                        System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                        System.out.println("PRESS [6] TO EXIT ");

                        int userChoise = in.nextInt();

                        switch (1) {
                            case 1:
                                System.out.println("Enter withdraw sum: ");
                                int withdrawSum = in.nextInt();
                                bankAccount.creditBalance(withdrawSum);
                                break;
                            case 2:
                                System.out.println("Balance: ");
                                System.out.println(((CityBankAccount) bankAccount).balance);
                                break;
                            case 3:
                                System.out.println("Enter new pin code: ");
                                String newPinCode = in.nextLine();
                                bankAccount.setPinCode(newPinCode);
                                break;
                            case 4:
                                System.out.println("Enter add cash sum: ");
                                int cashSum = in.nextInt();
                                bankAccount.debetBalance(cashSum);
                                break;
                            case 5:
                                System.out.println("Account data: ");
                                bankAccount.accountData();
                                break;
                        }
                        if (userChoise == 6) {
                            break;
                        }
                    } else {
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                        System.out.println("PRESS [2] TO VIEW BALANCE");
                        System.out.println("PRESS [3] TO EXIT");
                        int userChoise = in.nextInt();

                        switch (userChoise) {
                            case 1:
                                System.out.println("Enter withdraw sum: ");
                                int withdrawSum = in.nextInt();
                                bankAccount.creditBalance(withdrawSum);
                                break;
                            case 2:
                                System.out.println("Balance: ");
                                System.out.println(((NationalBankAccount) bankAccount).balance);
                                break;
                        }
                        if (userChoise == 3) {
                            System.out.println("Exit");
                            break;
                        }
                    }
                }
            }
        }
    }
}
