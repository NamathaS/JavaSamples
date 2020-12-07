package Neha;
import java.util.Scanner;

public class simple {
		Scanner keyboard = new Scanner(System.in); 
		double length;
	    double breadth;
	    double a;
	    
	    simple(){
	    	length=getLength();
	    	breadth=getBreadth();
	    }
	    public  double getLength()
	    {
	      // declare on top . no need to repeat 
	      System.out.println("Enter length of the reactangle ");
	       length = keyboard.nextDouble(); // no need to redeclare . already done on top 
	      return length;
	    }
	    public  double getBreadth()
	    {
	     
	      System.out.println("Enter breadth of the rectangle ");
	      breadth = keyboard.nextDouble();
	      return breadth;
	    }
	    public double calculateArea()
	    {
	      a = length * breadth;
	     System.out.println("The area of the rectangle is: " + a);
	     return a;
	    }
	    public static void main(String[] args) {
	    	simple sim = new simple();
	    	sim.calculateArea();
	    }


}
