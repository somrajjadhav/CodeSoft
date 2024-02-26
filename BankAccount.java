package java1;
import java.util.Scanner;

public class BankAccount {

	    private double balance;

	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. Current balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public boolean withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Remaining balance: " + balance);
	            return true;
	        } else {
	            System.out.println("Insufficient funds or invalid withdrawal amount.");
	            return false;
	        }
	    }
	}

	class ATM {
	    private BankAccount account;

	    public ATM(BankAccount account) {
	        this.account = account;
	    }

	    public void withdraw(double amount) {
	        if (account.withdraw(amount)) {
	            System.out.println("Please take your cash.");
	        } else {
	            System.out.println("Unable to process your request.");
	        }
	    }

	    public void deposit(double amount) {
	        account.deposit(amount);
	    }

	    public void checkBalance() {
	        System.out.println("Your current balance is: " + account.getBalance());
	    }
	}

	
	