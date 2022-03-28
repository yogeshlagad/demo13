

public class Employee {
	public static void main(String[] args) {
		String name;
		int age;
		float salary;

		Scanner sc = new Scanner(System.in);
		System.out.println("Name = ");
		name = sc.nextLine();
		System.out.println("Age = ");
		age = sc.nextInt();
		System.out.println("Salary = ");
		salary = sc.nextFloat();
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);

	}

}
