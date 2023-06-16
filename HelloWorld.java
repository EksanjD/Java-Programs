import java.util.Scanner;
class HelloWorld{
	public static void main(String args[]){
		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = scanner.nextInt();
		System.out.println("Value of a = " +a);
		System.out.println("Enter b =");
		int b = scanner.nextInt();
		System.out.println("Value of b = "+ (a+b));
	}
}