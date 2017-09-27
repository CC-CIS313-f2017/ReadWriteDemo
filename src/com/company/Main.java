package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        // Add three account to bank
        bank.addAccount("John Doe");
        bank.addAccount("Jane Doe");
        bank.addAccount("Patricia Smith");
        bank.addAccount("Dave Miller");

        // Deposit money in each of the three accounts
        bank.deposit("100", 100);
        bank.deposit("101", 1000);
        bank.deposit("102", 500);

        // Withdraw money from one of the account
        bank.withdraw("100", 50);

        // Print information on all accounts to screen
        bank.printAccounts();
        // Print information on all accounts to file
//        bank.printAccountsToFile("bankData.txt");
//
//        // Saving bank to file
//        FileOutputStream outputStream = null;
//        printBankToFile("bankData.ser", bank);
//
//        // Creating a new bank from file
//        Bank bankCopy = readBankFromFile("data.ser");
//        //Printing new bank to screen
//        System.out.println("\nBank copy");
//        bank.printAccounts();
    }

    public static void printBankToFile(String filename, Bank aBank) {

    }

    public static Bank readBankFromFile(String filename) {
        return null;
    }

}
