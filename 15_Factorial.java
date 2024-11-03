import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, n, fact =1;
		System.out.println("Enter a number : ");
		n =input.nextInt();
		for(i=1; i<=n; i++) {
		fact = fact*i;
		}
		System.out.println("The factorial of n is : "+ fact);		
	}
}