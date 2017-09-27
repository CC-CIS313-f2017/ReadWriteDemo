package com.company;

/** The BankAccount simulates a simple bank account
 */


public class BankAccount
{
    // Instance variables
    private String custName;
    private String acctNum;
    private double acctBal;

    /** Constructor
     @param custName the name of the owner of the account
     @param acctNum the account number
     */
    public BankAccount( String custName, String acctNum){
        this.custName = custName;
        this.acctNum = acctNum;
        acctBal = 0;
    }

    /*returns the name of the account owner
    @return the name of the account owner
     */
    public String  getCustName(){
        return custName;
    }

    /**returns the account number
     @return the account number
     */
    public String getAcctNum(){
        return acctNum;
    }

    /** returns the balance of the account
     @return the balance of the account
     */
    public double getAcctBal(){
        return acctBal;

    }

    /** deposit money in the account; Display an error message
     if the amount to deposit is negative
     @param amount the amount of money to deposit
     */
    public void deposit(double amount){
        if (amount < 0){
            System.out.println("Please enter a positive value.");
        }
        else {
            acctBal = acctBal + amount;
        }
    }

    /** withdraw money from the account; Display an error message
     if there is insufficient funds in the account
     @param amount the amount of money to withdraw
     */
    public void withdraw(double amount){
        if (amount > acctBal){
            System.out.println("Insufficient found");
        }
        else {
            acctBal = acctBal - amount;
        }

    }


    /**
     * Returns a String representation of the account
     * @return the string representing the account
     */
    public String toString(){
        return String.format("%-5s%-20s$%12.2f", acctNum,custName,acctBal);
    }
}

