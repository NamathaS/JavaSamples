package sample;

public class ConditionalStmts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=100;
	char grade;
	if(marks>=90)
	grade='a';
	else if(marks<=70 && marks>=90)
		grade='b';
	else
		grade='c';
	System.out.println(grade);
		
   	}

}
