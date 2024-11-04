
import java.util.Scanner;
public class ArraySumAvrg{
    public static void main(String[]args)
    {
        System.out.println("how many numbers you want to take?");
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
        int [] array=new int [n];
        int sum=0;
         
        System.out.println("please enter the numbers");
        
        for( int i=0;i<n;i++)
        {
              array[i]=input.nextInt();
             
        }
        System.out.print("Your array is:");
       for(int i=0;i<n;i++)
       {
           System.out.print(" "+array[i]);
           
       }
       System.out.println();
       
       //calculating sum and printing sum
    for(int i=0;i<n;i++)
    {
        sum+=array[i];
    }
       System.out.println("The sum of the array is :"+sum); 
        
        // calculating average and printing the average
        
        double average=( sum/n);
        System.out.println("The average is:"+average);
        
        
    }
}
        
       
    
        
    