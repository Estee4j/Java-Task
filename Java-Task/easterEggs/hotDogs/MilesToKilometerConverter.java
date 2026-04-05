import java.util.Scanner;

  public class MilesToKilometerConverter {

   public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in miles: ");   
          double miles = input.nextDouble();
        

           double kilometers = miles * 1.6;

            System.out.printf("Miles to kilometer is %f%n", kilometers);





}




}
