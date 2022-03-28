

public class Gretter {

	public static void main(String[] args) {
		int num1, num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1");
		num1 = sc.nextInt();
		System.out.println("Enter Num2");
		num2 = sc.nextInt();
      
         if(num1>num2)
         {
        	 System.out.println("Num1 is gretter"); 
         }
         else
         {
        	 System.out.println("Num2 is gretter"); 
         }
	}

}
