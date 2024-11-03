import java.util.Scanner;
public class  TimesTable{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
          int tab;      
        System.out.println("for which number you want the table?");
        int num1=input.nextInt();
     System.out.println(+num1+"'s table :");
        for( int i=1;i<=10;i++)
        {
            tab=num1*i;
            System.out.println(+num1+"*"+i+"="+tab);
        }
     
    }
}