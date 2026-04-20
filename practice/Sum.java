import java.util.Scanner ;

 public class Sum {

 public static void main(String [] args ){

 Scanner input = new Scanner(System.in);

     int sum = 0;
 for (int count = 1; count <= 10; count++) {
    System.out.print("Enter a number: ");
     int number = input.nextInt();
  
   sum += number;


}

  System.out.println("The total sum is " + sum);


}


}

 
