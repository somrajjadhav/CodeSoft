package java1;

import java.util.Scanner;

public class Currencyconv {
public static void main(String[] args) {
		
		{
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the base currency ");
		        String baseCurrency = scanner.nextLine().toUpperCase();
 
		        System.out.print("Enter the target currency ");
		        String targetCurrency = scanner.nextLine().toUpperCase();
		        
		        System.out.print("Enter the amount to convert");
		        double amount = scanner.nextDouble();

		        double exchangeRate = fetchExchangeRate("basecurrencyconv, targetcurrencyconv");

		        double convertedAmount = amount * exchangeRate;

		        {
		        System.out.printf("%.2f %s is equal to %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
		    }
		}

		    private static double fetchExchangeRate("String basecurrencyconv, String targetCurrencyconv"){
		       
		        return 0.85;
		    }
		


	

}


}
