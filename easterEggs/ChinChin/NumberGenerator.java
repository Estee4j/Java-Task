import java.util.Scanner ;

   public class NumberGenerator {

     public static void main(String [] args){
 
       Scanner input = new Scanner(System.in);

         System.out.println("Pick a number between 0 and 1 to play coin fliping game: ");
                   int playernum = input.nextInt();
                  
                
                  int randomNum = (int)(Math.random() * 1);

                 String on = "Tail";
                 String off = "Head";
             

                      if (randomNum == 1) {

           System.out.printf("Your number = %d : System number = %d: %s %n%n' You just won!!!! %n", playernum, randomNum, on);
        } 
            else if (randomNum == 0) {

                    System.out.printf("Your number = %d : System number = %d: %s %n%n' You just lost!!!! %n", playernum, randomNum, off);
          
         }
        



 
//Expressions

// int randomNum = (int)(Math.randon()*




} 




}
