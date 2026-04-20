import java.util.Scanner;

  public class LargestNumber {

   public static void main(String [] args){

   Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
         int value = input.nextInt();

   int count = 1;
    int number = 0;
     int largest = 0;

 while (number == 0 ) {
    System.out.println("No numbers entered: ");


     if (number > largest)
          largest = number;
        count = 1;
     number = largest;
      count++;
 // break;
  
   // break;
       
}

    System.out.println("The largest number is: " + largest);
       System.out.println("The number of occurence is: " + co);
  


    









}
}
