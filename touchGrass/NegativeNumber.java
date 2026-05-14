import java.util.Scanner;

public class NegativeNumber {
    
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

         
        int sumAverage = 0;
        double average = 1;
         int count = 0;

    while(true){
        System.out.println("Enter a negative number to stop: ");
        int number = input.nextInt();
             count++;
            
       sumAverage += number;
        average = sumAverage / count;  
            if(number < 0){
             
         System.out.println("The average of positive number: " + average);               
    
            break;
    }

 
             
    }


   
    

}
          }
