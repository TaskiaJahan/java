 
  public class Array_2D{
    public static void main(String []args)
    {
        
       int [][] number=new int[3][3];
       number[0][0]=5;
       number[0][1]=9;
       number[0][2]=7;
       number[1][0]=0;
       number[1][1]=6;
       number[1][2]=7;
       number[2][0]=0;
       number[2][1]=1;
       number[2][2]=3;
       
       for(int row=0;row<3;row++)
       {
           for(int col=0;col<3;col++)
           {
               System.out.print(" "+number[row][col]);
               
           }
           System.out.println();
       }
        
        
        
        
        
        
        
    }
}
