import java.util.Scanner;
public class Chapter5Exercise {

	public static void main(String[] args) {
		// Financial application
		//Comparing loans with various interest rates
		
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter loan amount:");
		  double loanAmount = input.nextDouble();
		  // Enter number of years
		  System.out.print("Enter number of years: ");
		  int numberOfYears = input.nextInt();
		  double annualInterestRate = 5.0;//Annual interest rate as a percentage
		  
		  double monthlyInterestRate = annualInterestRate / 1200;
		  double monthlyPayment = loanAmount * monthlyInterestRate / (1- 
					1 / Math.pow(1 + monthlyInterestRate, numberOfYears)* 12);
			double totalPayments = monthlyPayment * numberOfYears * 12;
			
		  
		   
		 
			  System.out.println("The monthly Payment is $" + (int)(monthlyPayment * 100)/100.0);
				System.out.println("The total payment is $" + (int)(totalPayments*100)/100.0);

		  }
		 }
		

	


