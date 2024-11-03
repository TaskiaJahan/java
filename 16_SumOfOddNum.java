import java.util.Scanner;

public class SumOfOddNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the first number:");
		int num1=input.nextInt();
		
		System.out.println("enter the second number:");
		int num2=input.nextInt();
		int sum=0;
		while(num1<=num2){
		    if(num1%2 !=0){
		    sum=sum+num1;
		    }
		    num1+=1;
		}
		System.out.println("sum is "+sum);
		
		
		
	 
	

	   
	}
    
}