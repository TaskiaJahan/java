import java.util.Scanner;
public class math_class{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter the numbers:");
        
        
       double a=input.nextDouble();
       double b=input.nextDouble();
       
       double max=Math.max(a,b);
       System.out.println("MAx is:"+max);
       
       double min=Math.min(a,b);
       System.out.println("Min is:"+min);
       
       double abs=Math.abs(a);   // prints the positive num
       System.out.println("absoluate is:"+abs);
       
       long round=Math.round(a);
       System.out.println("round is:"+round);
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
}