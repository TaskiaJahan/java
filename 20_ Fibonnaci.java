import java.util.Scanner;
public class Fibonnaci {
    public static void main(String[] args) {
         System.out.println("enter the number ");
        Scanner input=new Scanner(System.in);
       
        int num=input.nextInt();
        int fib;
        int first=0;
        int second=1;
         System.out.print(first+" "+second);
        for (int i=3;i<=num;i++)// first 2ta number to fix korei disi so 3 thke start hobe
        {
            
            fib=first+second;
            System.out.print(" "+fib);
            first=second;
            second=fib;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}