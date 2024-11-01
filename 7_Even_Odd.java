
 import java.util.Scanner;
public class Even_Odd {
  public static void main(String[] args) {
    
    Scanner input=new Scanner(System.in);
    
    int num;
    System.out.println("enter the number:");
    num=input.nextInt();
    
    if(num%2==0)
    {
         System.out.println("this is an even number");
    }
    else {
         System.out.println("this is an odd number");
    }
    

  }
}