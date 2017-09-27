package com.company;

/** Represent a simple bank
 * @author mschep
 *
 */
import java.util.*;


public class Bank
{
    private HashMap<String,BankAccount> database;
    private int nextNumber;

    /** Creates a new Bank
     */
    public Bank(){
        database = new HashMap<String,BankAccount> ();
        nextNumber = 100;
    }

    /** Creates a new account and add it to the database
     * @param name the customer' s name
     */
    public void addAccount(String name){
        String acctNum = nextNumber + "";
        BankAccount account = new BankAccount(name, acctNum);
        database.put(acctNum, account);
        nextNumber++;
    }

    /** Get account with given number
     * @param acctNum  the number of the account
     * @return the bank account with given number
     */
    public BankAccount getAccount(String acctNum){
        return database.get(acctNum);
    }

    /** Make a deposit in an account
     * @param acctNum the number of the account
     * @param amount amount to deposit
     */
    public void deposit(String acctNum, double amount){
        BankAccount account = getAccount(acctNum);
        account.deposit(amount);
    }

    /** Make a withdrawal from an account
     * @param acctNum the number of the account
     * @param amount amount to withdraw
     */
    public void withdraw(String acctNum, double amount){
        BankAccount account = getAccount(acctNum);
        account.withdraw(amount);
    }

    /** Print all accounts information
     *
     */
    public void printAccounts(){
        Collection<BankAccount> accounts = database.values();
        for(BankAccount account : accounts){
            System.out.println(account);
        }
    }

    /** Print all accounts information to a file
     * @param filename name of file to which data must be wrtten
     */
    public void printAccountsToFile(String filename){

    }
}
