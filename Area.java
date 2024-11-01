import java.util.Scanner;


public class Area{
    public static void main(String[]args)
    {
        Scanner input =new Scanner(System.in);
        
        float a,b;
        System.out.println("enter the numbers");
        a=input.nextFloat();
         b=input.nextFloat();
        float area;
        area=(a*b)/2;
        System.out.println("the area is "+area);


    }
}