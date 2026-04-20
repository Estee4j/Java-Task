import java.util.Scanner ;

  public class SumOfN {

 public static void main(String [] args) { 
  Scanner input = new Scanner(System.in);


     System.out.print("Enter the sum of N: ");
      int userInput = input.nextInt();
       int N = userInput;

   int sum  = 0; 
      int i = 1;


    while (i <= N) {
         sum +=i;
          i++;

      
      System.out.println(sum);

}






}


}
