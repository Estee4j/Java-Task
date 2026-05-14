import java.util.Scanner;

 public class ReversedDigit {

  public static void main(String [] args){

   Scanner input = new Scanner(System.in);

     int reversed = 0;      

     System.out.println("Enter a positive integer: ");
        int number = input.nextInt();


  while (number > 0) {
    int digit = number % 10;
    reversed = reversed * 10 + digit;
    number = number / 10;
}

       System.out.println("reversed number of your positive integer is " + reversed);    


  



}
}
