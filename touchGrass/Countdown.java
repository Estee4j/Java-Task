import java.util.Scanner;

    public class Countdown{

      public static void main(String[]args){

       Scanner input = new Scanner(System.in);

          System.out.println("Enter a number to begin your countdown");
           int number = input.nextInt();

       while(number > 0){
          number -= 1;

        System.out.println(number);
}

         System.out.println("Blast off !");


}
}
