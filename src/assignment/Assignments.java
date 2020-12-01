package assignment;

import java.util.Scanner;

public class Assignments {
	  static Scanner in = new Scanner(System.in);
	  static int number1;
	  static int number2;
	  static int number3;
	  static double length;
	  static double breadth;
	  static double result;
	public static void main(String[] args) {
		
		int choice;  
	    do {
	    	 System.out.println("\n\n\n Program List     ");
	    	 System.out.println("************************");
	    	 System.out.println("1. Add two numbers");
	    	 System.out.println("2. Multiply two numbers");
	    	 System.out.println("3. Find quotient and remainder");
	    	 System.out.println("4. Check Even or odd number");
	    	 System.out.println("5. Calculate simple interest");
	    	 System.out.println("6. Area of square");
	    	 System.out.println("7. Area of rectangle");
	    	 System.out.println("8. Swap two numbers");
	    	 System.out.println("9. Find largest number");
	    	 System.out.println("10. Check negative or positive number");
	    	 System.out.println("11. Print ASCII value");
	    	 System.out.println("12. Exit");
	    	 System.out.println("Please enter your choice");
	    	 choice = in.nextInt();
	     }while(choice>=12);
		     
	     switch(choice) {
	     case 1:
	    	AddTwoNumbers();
	    	 break;
	     case 2:
	    	 MultiplyTwoNumbers();
	    	 break;
	     case 3:
	    	 FindQuotientAndRemainder();
	    	 break;
	     case 4:
	    	 CheckEvenOrOdd();
	    	 break;
	     case 5:
	    	 CalculateSimpleInterest();
	    	 break;
	     case 6:
		    CalculateSquareArea();
	    	 break;
	     case 7:
	    	 CalculateRectangleArea();
	    	 break;
	     case 8:
	    	 SwapTwoNumbers();
	    	 break;
	     case 9:
	    	 FindLargestNumber();
	    	 break;
	     case 10:
	    	 CheckNegativeOrPositive();
	    	 break;
	     case 11:
	    	 FindASCIIValue();
	    	 break;
	     default:
	    	ClearScreen();
	     }
		
	}
	public static void AddTwoNumbers() {
					
		System.out.println("Please enter your Number One");
		number1 = in.nextInt();
		
		System.out.println("Please enter your Number Two");
		number2 = in.nextInt();
		
		result = number1+number2;
		
		System.out.println("Result of "+ number1 + " + "+ number2+" is "+ result);
		}
	
	public static void MultiplyTwoNumbers() {
		
		System.out.println("Please enter your Number One");
		number1 = in.nextInt();
		
		System.out.println("Please enter your Number Two");
		number2 = in.nextInt();
		
		result=number1*number2;
		
		System.out.println("Result of "+ number1 + " x "+ number2+" is "+ result);
	
	}
	public static void FindQuotientAndRemainder() {
				
		System.out.println("Please enter your Number One");
		number1 = in.nextInt();
		
		System.out.println("Please enter your Number Two");
		number2 = in.nextInt();
		
		System.out.println("Quotient of  "+ number1 + " / "+ number2+" is "+ (number1/number2));
		System.out.println("And remainder is "+ (number1%number2));
	}
	public static void CheckEvenOrOdd() {
		
		System.out.println("Please enter number");
		number1 = in.nextInt();
		
		if(number1%2 == 0)
			System.out.println(number1+" is even number");
		else
			System.out.println(number1+" is odd number");
	}
	public static void CalculateSimpleInterest() {
		
		double principleamount,rate,time;
		
		System.out.println("Please enter pricipal amount");
		principleamount=in.nextDouble();
		
		System.out.println("Please enter rate");
		rate=in.nextDouble();
		
		System.out.println("Please enter time period");
		time=in.nextDouble();
		
		result = (principleamount*rate*time)/100;
		
		System.out.println("Simple interest is "+ result);
	}
	
	public static void CalculateSquareArea() {
		
		System.out.println("Please enter side");
		length=in.nextDouble();
		
		result = length*length;
		
		System.out.println("Area of square is  "+result);
	}
	public static void CalculateRectangleArea() {
		
		System.out.println("Please enter length");
		length=in.nextDouble();
		
		System.out.println("Please enter breadth");
		breadth=in.nextDouble();
		
		result = length*breadth;
		
		System.out.println("Area of reactangle is  "+result);
	}
	public static void SwapTwoNumbers() {
		
		System.out.println("Please enter your first number ");
		number1 = in.nextInt();
		
		System.out.println("Please enter your second number");
		number2 = in.nextInt();
		
		number3 = number1;
		number1=number2;
		number2=number3;
		
		System.out.println("After swaping: first number is "+number1+ " and second number is " + number2);
	}

	public static void FindLargestNumber() {
		
		int[] numbers = new int[5];
		
		System.out.println("Please enter numbers");
		
		for(int i=0;i<=numbers.length-1;i++) {
			numbers[i]=in.nextInt();
		}
		
		number1=numbers[0];
		
		for(int i = 1;i<=numbers.length-1;i++) {
			
			if(numbers[i-1] > numbers[i])
				number1=numbers[i-1];
			else
				number1=numbers[i];
		}
		
		System.out.println("Largest number is "+ number1);		
		
	}
	public static void CheckNegativeOrPositive() {
		
		System.out.println("Please enter your number ");
		number1 = in.nextInt();
		
		if(number1>0)
			System.out.println("Entered number is positive");
		else
			System.out.println("Entered number is negative");
	}
	public static void FindASCIIValue() {
		
		char ch;
		
		System.out.println("Enter character");
		ch= in.next().charAt(0);
		
		int res= ch;
		
		System.out.println(res);
	}
	public static void ClearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  

}
