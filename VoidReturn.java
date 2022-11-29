import java.util.Scanner;

public class VoidReturn {

   public static void main(String args[]){
        int total = addNums();
        System.out.println("Your total is " + total);
   }

   public static int addNums(){

       System.out.println("We are going to add two numbers");
       System.out.print("Please enter first number: ");

       Scanner scan  = new Scanner(System.in);
       int num1 = scan.nextInt();
       System.out.print("Please enter second number: ");
       int num2 = scan.nextInt();

       return (num1 + num2);
   }
}
