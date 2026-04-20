import java.util.Scanner;

 public class SumDigit {

   public static void main(String [] args) {

      Scanner input = new Scanner(System.in);

       System.out.print("Enter a three-digit number: ");
         int number = input.nextInt();




        int Digit1 = number / 100;
     
         int Digit2 = (number / 10) % 10;

          int Digit3 = number % 10;

           int sum = Digit1 + Digit2 + Digit3;

      
              System.out.printf("The sum of the Digits is %d%n", sum);







}










}
