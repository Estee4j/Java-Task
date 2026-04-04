import java.util.Scanner;

public class TaskTwentyFour {

 public static void main(String [] args) {

   Scanner input = new Scanner(System.in);

    System.out.println("Enter first number: ");
      int number1 = input.nextInt();

         
          System.out.println("Enter second number: ");
              int number2 = input.nextInt();


       
                int swap = number1;
                  number1 = number2 ;

                    number2 = swap;
  


          System.out.println(number1+ " " +number2);



}



}
