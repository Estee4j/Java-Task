import java.util.Scanner;
             
   public class GratuityConverter {
                
       public static void main (String[] args) {
                
          Scanner input = new Scanner(System.in);

              System.out.println("what is subtotal: ");
                  double subtotal = input.Double(); 

                   System.out.println("What is gratuity rate: ");
                      double gratuityrate = input.Doublet(); 

                         double gratuity = subtotal * (gratuityrate / 100);
                           double total = subtotal +  gratuity;

                        System.out.printf("The gratuity is $ %f%n  and total is $ %f%n", subtotal, gratuityrate);



}






}
