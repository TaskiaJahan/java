public class while_loop{
    public static void main(String[]args){
      
      // print 1->10;
      int i=1;
      
       System.out.print("The numbers from 1 to 10 are :");
       
      while(i<=10)
      {
          System.out.print(" "+i);
          i++;
      }
      
      System.out.println(" ");
        // print even numbers from 1->10 
        int j=0;// even numbers start from 0
      
       System.out.print("The even numbers from 1 to 20 are :");
       
      while(j<=20)
      {
          System.out.print(" "+j);
          j +=2;// because even numbers are 2 digits away from each
      }
       System.out.println(" ");
      // print odd numbers 1->20
       int k=10;
      
       System.out.print("The odd numbers from 10 to 20 are :");
       
      while(k<=50)
      {   if(k%2!=0){
          System.out.print(" "+k);
          k +=2;
      }
      else{
          k=k+1;
          System.out.print(" "+k);
          k +=2;
      }
          
      }
        
        
        
    }
}