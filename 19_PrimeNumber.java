import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter the number:");
        int num=input.nextInt();
        int count=0;
        for( int i=2;i<num;i++)
        {
             
        if(num%i==0)
        
        {
            count++;
            break;
        }
        }
        if(count==0)
        
        {
         System.out.println("its a prime number");
 
        }
        else{
        System.out.println("this is not a prime numner");

        }
        
        
        
        
       
    }
}