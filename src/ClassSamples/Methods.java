package ClassSamples;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findMimumOfNumber(10,56);
		findMimumOfNumber(70,34,12);
		
		Area(6);
		Area(3,7);
		
		System.out.println("Here power "+Math.pow(2,3));
		System.out.println("Here min  "+ Math.min(3, 3.2));
		
		int result = sum(4,7);
		double res = sum(34.4f,76.3f);
		
		System.out.println("assidion"+Math.addExact(3, 5));
		System.out.println("Sum of interegres "+result);
		System.out.println("Sum of double "+res);
		
		double res_double = sequence(23,44.12f);
		System.out.println(res_double);
		
		double Res_int = sequence(45.23,66);
		System.out.println(Res_int);
		
	}
	public static void findMimumOfNumber(int a,int b) {
		if(a<b)
			System.out.println("Smallest is "+a);
		else
			System.out.println("Smallest is "+b);
	}
	
	public static void findMimumOfNumber(int a,int b,int c) {
		int temp;
		
		if(a<b)
			temp=a;
		else
			temp=b;
		
		if(temp<c)
			
			System.out.println("Smallest is "+temp);
		else
			System.out.println("Smallest is "+c);
	}
	public static void Area(int side) {
		System.out.println("Area of sqaure  "+side*side);
	}
	public static void Area(int height, int breadth) {
		int area= (height*breadth)/2;
		System.out.println("Area of sqaure  "+area);
	}
	public static int sum(int a, int b) {
		System.out.println("integer sum");
		return a+b;
	}
	public static double sum(double a, double b) {
		System.out.println("double sum");
		return a+b;
	}
	public static double sequence(int a, double b){
		double sum = a+b;
		System.out.println("Inside first method - int,double");
		return sum;
	}
	
	public static double sequence(double a,int b){
		double sum = a+b;
		System.out.println("Inside second method - double,int");
		return sum;
	}
	
}
