package Neha;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner keyboard = new Scanner(System.in);
		 
		Areaoftherectanglewithclass Rec1= new Areaoftherectanglewithclass();
		Rec1.setLength(4.5);
		Rec1.setBreadth(3.5);
		System.out.println("Area is "+Rec1.calculateArea());
		
		Areaoftherectanglewithclass Rec2= new Areaoftherectanglewithclass();
		System.out.println("Enter length");
		Rec2.setLength(keyboard.nextDouble());
		System.out.println("Enter breadth");
		Rec2.setBreadth(keyboard.nextDouble());
		
		System.out.println("Area is "+Rec2.calculateArea());
		keyboard.close();
		

	}

}
