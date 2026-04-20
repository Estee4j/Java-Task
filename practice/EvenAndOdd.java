import java.util.Scanner;

 public class EvenAndOdd {
 
  public static void main(String [] args) {
  
   Scanner input = new Scanner(System.in);

 for (int counter = 1; counter <= 100; counter ++){
    System.out.print("Enter a number: ");
    int number = input.nextInt();

        if (number % 2 == 0) {
         System.out.println("number is Even");

        }
  
        else {

         System.out.println("number is Odd");
    }

}

}



}
