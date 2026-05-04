import java.util.Scanner;

public class TaskTwo {

public static void main(String [] args ){
  
  Scanner input = new Scanner(System.in);
  int [] scores = new int [10];
  
  for (int index = 0; index < scores.length; index++){
    System.out.println("Enter a score: ");
    scores [index] = input.nextInt();
  } 
    
   for (int index = 0; index <= scores.length -1; index++)
     System.out.println(scores[index]);
    
    }

    }      



