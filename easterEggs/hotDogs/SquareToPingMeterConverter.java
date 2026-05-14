import java.util.Scanner;

       public class SquareToPingMeterConverter {
                
           public static void main (String[] args) {
           
               Scanner input = new Scanner(System.in);


                   System.out.println("Convert squaremeter to pings: ");
                        int number = input.nextInt(); 

                        float squaremeter = 0.3025f;
                        double squaremetertoping = number * squaremeter;

                        System.out.printf("Squaremeter to pings is %d%n, %f%n pings", number,squaremetertoping);  
                



}







}


