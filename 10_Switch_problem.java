// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english
// get the OPTION from user
    // use switch, case, break and default
    // Selected language is Bengali
    // Selected language is Hindi
    // Selected language is Urdu
    // Selected language is English
import java.util.Scanner;
public class Switch_problem {
  public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
     System.out.println("enter 1 to select bengali");
     System.out.println("enter 2 to select hindi");
     System.out.println("enter 3 to select urdu");
     int op;
     op=input.nextInt();
     switch(op){
     
           case 1:
          System.out.println("Bengali is selected"); 
          break;
          case 2:
          System.out.println("Hindi is selected"); 
          break;
          case 3:
          System.out.println("Urdu is selected"); 
          break;
          default:
          System.out.println("English is selected"); 
          break;
    
  }
  }
}