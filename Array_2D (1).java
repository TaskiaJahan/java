 import java.util.Scanner;
  public class Array_2D{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        
      int [][] A=new int[3][3];
      
      int [][] B =new int[3][3];
      // A er input
      System.out.println("Enter numbers for matrix A:");
      
      for(int row=0;row<3;row++ )
      {
          for(int col=0;col<3;col++)
          {
              System.out.printf("[%d][%d]=",row,col);
               A[row][col]=input.nextInt();
               
          }
    
          
      }
       // B er input
      System.out.println("Enter numbers for matrix B:");
      
      for(int row=0;row<3;row++ )
      {
          for(int col=0;col<3;col++)
          {   System.out.printf("[%d][%d]=",row,col);
              B[row][col]=input.nextInt();
            
          }
       
      }
      // A er output
      System.out.println("MAtrix A is:");
      
      for(int row=0;row<3;row++ )
      {
          for(int col=0;col<3;col++)
          {
            System.out.print(" "+A[row][col]);
          }
            System.out.println();
          
      }
       // B er output
      System.out.println(" Matrix B is :");
      
      for(int row=0;row<3;row++ )
      {
          for(int col=0;col<3;col++)
          {   
             System.out.print(" "+B[row][col]);
            
          }
       System.out.println();
      }
      
     //adding two Matrix
     
      System.out.println("The addition of the Matrixes:");
        //  Sum er output
      
      
      for(int row=0;row<3;row++ )
      {
          for(int col=0;col<3;col++)
          {   
             System.out.print("\t"+(A[row][col]+B[row][col]));
            
          }
       System.out.println();
      }
      
      
      
      
      
      
      
      
      
      
     
        
    }
}