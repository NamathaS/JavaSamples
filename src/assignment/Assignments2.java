package assignment;

import java.util.Scanner;
import java.lang.Math;

public class Assignments2 {
	
	
	  static Scanner in = new Scanner(System.in);

	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;  
	    do {
	    	 System.out.println("\n\n\n Assignment 2 Program List     ");
	    	 System.out.println("************************");
	    	 System.out.println("1. Check Armstrong number");
	    	 System.out.println("2. Fibonacci series");
	    	 System.out.println("3. Palindrome Program");
	    	 System.out.println("4. Sum of natural numbers with for loop");
	    	 System.out.println("5. Sum of natural numbers with while");
	    	 System.out.println("6. Count number of Digits");
	    	 System.out.println("7. Simple Calculator");
	    	 System.out.println("8. Calculate Electricity bill");
	    	 System.out.println("9. Check vowels or Consonant");
	    	 System.out.println("10. Prime numbers");
	    	 System.out.println("11. Left Pattern");
	    	 System.out.println("12. Diamond Pattern");
	    	 System.out.println("13. Repeat");
	    	 System.out.println("Please enter your choice :");
	    	 choice = in.nextInt();
	     }while(choice>=13);
		     
	     switch(choice) {
	     case 1:
	    	 	checkIfArmStrongNumber();
	    	 	break;
	     case 2:
	    	 	getFinonacciNumbers();
	    	 	break;
	     case 3:
	    	 	getPalindromeNumber();
	    	 	break;
	     case 4:
	    	 	getSumOfNaturalNumberWithForLoop();
	    	 	break;
	     case 5:
	    	 	getSumOfNaturalNumberWithWhileLoop();
	    	 	break;
	     case 6:
	    	 	getNumberOfDigits();
	    	 	break;
	     case 7:
			    simpleCalculator();
			    break;
	     case 8:
			    calculateElectricityBill();
			    break;
	     case 9:
	    	 	checkVowelsAndConsonants();
	    	 	break;
	     case 10:
	    	 	getPrimeNumbers();
	    	 	break;
	     case 11:
	    	 	leftPatterns();
	    	 	break; 
	     case 12:
	    	 	diamondPattern();
	    	 	break;
	     default:
	    	 	outOfChoice();
	     }
	        in.close();
		
	}
	public static void checkIfArmStrongNumber() {
		 
		int number , original;
		 double remainder, result = 0;
	        
	        System.out.println("Enter a number to check :");
	           
	        number = in.nextInt();   

	        original = number;

	        while (original != 0)
	        {
	        	remainder = original % 10;
	            
	            result = result + Math.pow(remainder, 3);
	            
	            original /= 10;
	        }
	      
	        if(result == number){
	            System.out.println(result + " is an Armstrong number");
	        }
	        else{
	            System.out.println(result + " is not an Armstrong number");
	        }
					
	}
	public static void getFinonacciNumbers() {
		
		int limit, FirstNumber,SecondNumber,number;
		
		System.out.println("Please enter the limit");
		limit=in.nextInt();
		
		FirstNumber=0;
		SecondNumber=1;
		
		System.out.println(FirstNumber);
		System.out.println(SecondNumber);
		
		while(limit-2>0) {
			number=FirstNumber+SecondNumber;
			
			System.out.println(number);
			
			FirstNumber=SecondNumber;
			SecondNumber=number;
			
			limit--;
		}

	}
	public static void getPalindromeNumber() {
		int len,i;
		String original,reverse="";
		
		System.out.println("Please enter your input");
		original=in.next();
		
		len=original.length();
		
		for(i=len-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		
		if(original.equals(reverse))
			System.out.println(original+ " is a palindrome");
		else
			System.out.println(original+ " is not a palindrome");
		
	}
	public static void getSumOfNaturalNumberWithForLoop() {
		int limit,sum=0,i;
		
		System.out.println("Please enter your limit");
		limit=in.nextInt();
		
		for(i=0;i<=limit;i++) {
			sum+=i;
		}
		System.out.println("Sum of natural numbers till " +limit+" is "+sum );
		
	}
	public static void getSumOfNaturalNumberWithWhileLoop() {
		int limit,sum=0,i;
		
		System.out.println("Please enter your limit");
		limit=in.nextInt();
		
		i=limit;
		
		while(i>0) {
			sum+=i;
			i--;
		}
		System.out.println("Sum of natural numbers till " +limit+" is "+sum );
		
	}
	public static void simpleCalculator() {
		
		double number1,number2,result=0;
		char op;
		
		System.out.println("Enter first operant");
		number1=in.nextDouble();
		
		System.out.println("Enter second operant");
		number2=in.nextDouble();
		
		System.out.println("Enter operator");
		op=in.next().charAt(0);
		
		switch(op) {
		case '+':
			result=number1+number2;
			break;
		case '-':
			result=number1-number2;
			break;
		case '*':
			result=number1*number2;
			break;
		case '/':
			result=number1/number2;
			break;
		}
		
		System.out.println(number1+" " +op+" "+number2+" = "+result);
	}
	public static void calculateElectricityBill() {
		/*
		 * Till 50 units
		 * 			Unit charge - 2.60
		 * 			Sur_charge - 25
		 * 	50 to  100 units
		 * 			Unit charge - 3.25
		 * 			Sur_charge - 35
		 * 	100 to 200 units
		 * 			Unit charge - 5.26
		 * 			Sur_charge - 45
		 * 	Till 50 units
		 * 			Unit charge - 7.75
		 * 			Sur_charge - 55
		 */
		
		int unit,sur_charge;
		double amount,total_bill;
		
		System.out.println("Please enter units");
		unit = in.nextInt();
		
		if (unit<=50)
		{
			amount= unit*2.60;
			sur_charge=25;
		}
		else if(unit>50 && unit<=100)
		{
			amount=(50*2.60)+((unit-50)*3.25);
			sur_charge=35;
		}
		else if(unit>100 && unit<=200)
		{
			amount=(50*2.60)+(50*3.25)+((unit-100)*5.26);
			sur_charge=45;
		}
		else
		{
			amount=(50*2.60)+(50*3.25)+(100*5.26)+((unit-200)*7.75);
			sur_charge=55;
		}
		
		total_bill = amount+sur_charge;
		
		System.out.println("Total bill is "+total_bill);
	}
	public static void getNumberOfDigits() {
		
		 int count =0, number;	
        
        System.out.println("Enter a number to check :");
           
        number = in.nextInt();   

        while (number != 0)
        {
        	number /= 10;         
            count++;         
        }
	    System.out.println("Number of digits is "+count);
		
	}
	public static void checkVowelsAndConsonants() {
		char ch=0;
		System.out.println("Please enter input");
		ch=in.next().charAt(0);
		
		switch(ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
				System.out.println(ch +" is a vowel");
				break;
		default:
				System.out.println(ch +" is a consonant");
		}
	}
	public static void getPrimeNumbers() {
		
		int number,count=0,i;
		
		System.out.println("Please enter number");
		number=in.nextInt();
		
		for(i=2;i<=number/2;i++)
		{
			if(number%i==0)
				count++;
		}
		if(count==0)
			System.out.println(number + " is a prime number");
		else
			System.out.println(number + " is not a prime number");
	}
	public static void leftPatterns() {
		
		int number,i,j;
		
		System.out.println("Please enter number");
		number=in.nextInt();  
		
		for(i=0; i<number; i++)   
		{   	 
			for(j=0; j<=i; j++)   
			{   	 
				System.out.print("* ");   
			}   
		
		System.out.println();   
		}   
		
	}
	public static void diamondPattern() {
		
		int limit,i,j,space;
		
		System.out.println("Please enter limit");
		limit=in.nextInt();
		
		space= limit-1;
		
		for(i=1;i<=limit;i++) {
			
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			space--;
			
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		space=1;
		
		for(i=1;i<=limit-1;i++) {
			
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			space++;
			
			for(j=1;j<=2*(limit-i);j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
	public static void outOfChoice() {  
	    System.out.print("Please enter choice from list");  
	    System.out.flush();  
	}  

}
