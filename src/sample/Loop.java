package sample;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print 1 to 10 - while");
		int i =0,j=10;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		System.out.println("Print dec to 10 - do while ");
		do {
			System.out.println(j);
			j--;
		}while(j>0);
		
		System.out.println("Print 10 to 20 for loop");
		for(int x=10;x<=20;x++)
		{
			System.out.println(x);
		}
				
	}

}
