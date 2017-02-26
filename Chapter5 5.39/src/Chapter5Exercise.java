import java.util.Scanner;
public class Chapter5Exercise {

	public static void main(String[] args) {
		//Financial application
		//Finding the sales amount
		Scanner input = new Scanner(System.in);
		  System.out.print("Enter commission amount:");
		  double commission= input.nextDouble();// As a percentage
		  double salesAmount;
		 //goal is to make $30000 commission
		  if (commission <= 400) {
		   salesAmount = commission / 0.08;
		 
		  } else if (commission <= 900) {
		   salesAmount = (commission - 400) / 0.1 + 5000;
		   
		  } 
		  else {
		   salesAmount = (commission - 900) / 0.12 + 10000;
		  }
		 
		  System.out.println("The minimum sales generated is $" + salesAmount);
		 
		 }
		 
		

	}


