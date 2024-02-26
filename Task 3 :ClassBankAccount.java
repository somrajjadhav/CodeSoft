package java1;

import java.util.Scanner;

public class ClassBankAccount {
	    public static void main(String[] args) {
	        BankAccount userAccount = new BankAccount(1000); 
	        ATM atm = new ATM(userAccount);
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nChoose an option:");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");

	            int choice = scanner.nextInt();
	            double amount;

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter amount to withdraw:");
	                    amount = scanner.nextDouble();
	                    atm.withdraw(amount);
	                    break;
	                case 2:
	                    System.out.println("Enter amount to deposit:");
	                    amount = scanner.nextDouble();
	                    atm.deposit(amount);
	                    break;
	                case 3:
	                    atm.checkBalance();
	                    break;
	                case 4:
	                    System.out.println("Exiting ATM. Thank you for using our service!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please choose again.");
	            }
	        }
	    }
	}



