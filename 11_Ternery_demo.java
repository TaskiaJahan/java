import java.util.Scanner;
public class Ternery_demo{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the numbers");
        int num1,num2,large;
        
        num1=input.nextInt();
        num2=input.nextInt();
        
        large=(num1>num2)?num1:num2;
        
        System.out.println("Large number is:"+large);
        
        
        
        
    }
}