// write a program that simulates the catching of a thief
// the program ends when i shout thief ooo 
//
//import java.util.Scanner;
//
//   public class ThiefSimulator { 
//   
//   public static void main(String [] args ){
//   
//   
//   while (true){
//    Scanner input = new Scanner(System.in);
//    System.out.println("Shout thief to stop the application:");
//    String catchThief = input.nextLine().toLowerCase().trim();
//    System.out.println("Help me catch the oleee!!!");
//    
//   
//    if(catchThief.toLowerCase().equals("thief")) break;
//    
//    }
//    
//    }
//    }
//   
//    
//  


 public class ThiefCatcher {
 
  public static void main(String [] args){
  
    while (true){
          System.out.println("You will have to scream thief to stop the application: ");
          java.util.Scanner input = new java.util.Scanner(System.in);
          String stopThief = input.nextLine().toLowerCase().replaceAll(" ", "");
          
          if(stopThief.equals("thief")) break;
          
          }







}
}




