import java.util.Scanner;


public class Area_of_circle{
    public static void main(String[]args)
    {
        Scanner input =new Scanner(System.in);
       
        double a;
        System.out.println("enter the numbers");
        a=input.nextFloat();
        double area;
        area=3.1416*a*a;
        System.out.println("the area is "+area);


    }
}