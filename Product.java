import java.util.Scanner;

public class Product {
	String name;
	float price;
	int quantity;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Product name =");
		name = sc.next();
		System.out.println("Price =");
		price = sc.nextFloat();
		System.out.println("Quantity");
		quantity = sc.nextInt();
	}

	void show() {
		System.out.println(name + " " + price + " " + quantity);
	}

	void calculate() {
		if (price > 2000)
			System.out.println("discount =10%");
		else
			System.out.println("discount =7%");
	}

	public static void main(String[] args) {
		Product aa = new Product();

		aa.input();
		aa.show();
		aa.calculate();

	}

}
