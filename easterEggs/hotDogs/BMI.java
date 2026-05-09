import java.util.Scanner;
             
    public class BMI {
                
       public static void main (String[] args) {
                
          Scanner input = new Scanner(System.in);

              System.out.println("Enter weight in pounds: ");
                  int number1 = input.nextInt(); 

                   System.out.println("Enter height in inches: ");
                      int number2 = input.nextInt(); 

                         double display = (number1 * 0.45359237) / (number2 * 0.0254);
                       
                 
                     System.out.printf("The BMI display is %f%n", display);  

                

 

}






}
