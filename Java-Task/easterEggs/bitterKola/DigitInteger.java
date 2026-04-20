import java.util.Scanner;

  public class DigitInteger {

   public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

      System.out.println("Ask the user to enter 5-digit integer");
       int value = input.nextInt();

       int firstDigit = value / 10000;
        int secondDigit= value % 10;

       int sum = firstDigit + secondDigit;

       System.out.println("First digit is: " + firstDigit);
        
        System.out.println("second digit is: " + secondDigit);

          System.out.println("The sum is: " + sum);





}

}
