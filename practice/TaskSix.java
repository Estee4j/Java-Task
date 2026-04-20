import java.util.Scanner ;

 public class TaskFive {

 public static void main(String [] args ){

 Scanner input = new Scanner(System.in);

     int sum = 0;
    int average = 0;
    int counter = 0;
 for (int count = 1; count <= 10; count++) {
    System.out.print("Enter a number: ");
     int number = input.nextInt();
  if (number % 2 == 0) {
 sum += number;
 count+=1;
 average = sum / counter;   

}
  
}

 System.out.println("The total sum is " + sum);

  System.out.println("The total average is " + average);


}


}

 
