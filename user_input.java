import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);

        int id,price;
        String title,description,category;

        

        System.out.print("Enter your id: ");
        id = input.nextInt();

        System.out.print("Title: ");
        title = input1.nextLine();



        

        System.out.print("Price: ");
        price = input2.nextInt();

        System.out.print("Description: ");
        description = input3.nextLine();

        System.out.print("Category: ");
        category = input4.nextLine();


        System.out.println("Id : "+id);
   
        System.out.println("Price : "+price);
        System.out.println("Description : "+description);
        System.out.println("Category : "+category);
        

        
        
    }
}