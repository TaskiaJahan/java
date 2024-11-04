 import java.util.Scanner;
 public class FibonnaciFind {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Which fibonacci number you want to see : ");
        int n =input.nextInt();
        
        int first=0;
        int second=1;
        int fibo=0;
        
        if(n==1){
            System.out.println("Your "+n+"th fibonacci number is : "+first);
        }
        else if(n==2){
            System.out.println("Your "+n+"th fibonacci number is : "+second);
        }
        else{
            for(int i=3; i<=n; i=i+1){
                fibo=first+second;
                first=second;
                second=fibo;
            }
            System.out.println("Your "+n+"th fibonacci number is : "+fibo);
        }
     
    }
}