import java.util.Scanner;
             
    public class VolumeOfAPrism {
                
       public static void main (String[] args) {
                
          Scanner input = new Scanner(System.in);

              System.out.println("What is the length of the prism: ");
                  int length = input.nextInt(); 

                   System.out.println("What is the base of the prism: ");
                      int base = input.nextInt(); 

                         float area = 0.5f * length * base;
                           float Volume = area * length;

                        System.out.printf("The volume of prism is %f %n%n",Volume);  
                

 

}






}
