import java. util.Scanner ;

 public class SumOfInteger {

 public static void main(String [] args ){

 Scanner input = new Scanner(System.in);
int sum = 0;

  System.out.print("Enter an integer: ");
   int number = input.nextInt();

    

  // for (int count = 1; count <= 10; count++) {

 // System.out.println("The sum of the digit is:" + sum);


 while (number > 0 ){
  int flow = number % 10;
sum += flow;
number/=10;
}
 System.out.println("The sum of the digit is:" + sum);


}





      
}




