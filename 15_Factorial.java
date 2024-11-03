import java.util.Scanner;
public class factorialPrint{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter the  number:");
        int num=input.nextInt();
        int factorial=1;
       for( int i=num;i>=1;i--)
       { 
           System.out.print(i+"*");
           factorial=factorial*i;
          
       }
        System.out.println("\n");
        System.out.println(factorial);
    }
}
