import java.util.Scanner;
             
    public class AirplaneAcceleration {
                
       public static void main (String[] args) {
                
          Scanner input = new Scanner(System.in);

              System.out.println("Enter the velocity: ");
                  int number1 = input.nextInt(); 

                   System.out.println("Enter the area: ");
                      int number2 = input.nextInt(); 

                         double length = (number1 * number1) / (2 * number2);
                       
                 
                     System.out.printf("The length is %f%n", length);  

                

 

}






}
