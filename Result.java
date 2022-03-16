import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		int marks;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		marks= sc.nextInt();
	
		result =  marks>=40 ? marks +  " = Result is a Pass"  : marks+ " = Result is a Fail";
		System.out.println(result);
	}


	}


