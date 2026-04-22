import java.util.Scanner;
 
 public class Patterns {

   public static void main(String [] args){

     Scanner input = new Scanner(System.in);

      System.out.print("Enter number of rows: ");
         int rows = input.nextInt();

   
        for (int count = 1; count <= rows; count++) {
           for(int number = 1; number <= count; number++ ){
           int sum = number + 1;
           System.out.print("*");
}          

            System.out.println();
}
  




}

}
