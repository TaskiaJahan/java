// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover
import java.util.Scanner;
public class operator_problem {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    
   System.out.println("Do you love java?");
   System.out.println("ENter y/Y or n/N");
    
    char  ch ;
    ch = input.next().charAt(0);
    
    if (ch=='y' || ch=='Y')
    {
        System.out.println(" you are a java lover"); 
    }
    
     else if(ch=='n'|| ch=='N')
     {
         System.out.println(" you are not  a java lover"); 
     }
    else{
        System.out.println(" invalid answer.Choose y/Y or n/N"); 
    }
    
  }
}