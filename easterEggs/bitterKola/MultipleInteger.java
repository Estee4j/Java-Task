import java.util.Scanner;

  public class MultipleInteger {

   public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

     System.out.print("Enter first digit \n");
      int num1 = input.nextInt();
  
        System.out.print("Enter second digit \n");
         int num2 = input.nextInt();

  if (num1 % num2 == 0){
   System.out.printf("%d is a multiple of %d %n \n", num1, num2);
}

  else {
   System.out.printf("is not a multiple of second \n");
}


 }


}
