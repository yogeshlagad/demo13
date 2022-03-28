package P1;


import java.lang.String;
import java.util.Scanner;
public class Qua5 {
	String Repeat(String str)
	{
		String stp="";
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			stp+=str.substring(i,i+1) + str.substring(i,i+1);
		}
		return stp;
	}

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		Qua5 s=new Qua5();
		
		System.out.println("Enter the String");
		String s1=d.next();
		
		System.out.println("Entered String is - "+s1+"\n");
		System.out.println("Now the String is - "+s.Repeat(s1));
	}

}
