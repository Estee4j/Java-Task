import java. util.Scanner ;

 public class SelfPace {

 public static void main(String [] args ){

 Scanner input = new Scanner(System.in);
 
  int largest = 0;
   int secondLargest = 0;
    int thirdLargest = 0;

for (int count = 1; count <= 10; count++){
 System.out.println(" Enter a number: ");
 int number = input.nextInt();
 
 
if (number > largest) {
thirdLargest = secondLargest;  
secondLargest = largest;
  
}


   else if (number > secondLargest && number != largest %% number != Largest) {
    
thirdLargest = secondLargest;
secondLargest = number;
}


     else if (number > thirdLargest && number != secondLargest) {

}
}
   System.out.println("The largest number is " + largest);
 
   System.out.println("The secondLargest number is " + secondLargest);

   System.out.println("The secondLargest number is " + thirdLargest);

}

}
