import java.util.Scanner;

 public class PizzaWahala {

  public static void main(String [] args){

   Scanner input = new Scanner(System.in);

   
     // input.nextLine();

     // System.out.println("Enter the pizza type: ");
       // int type = input.nextLine();

        
         int pizzaPrice = 0;
         int slice = 0;  
         int leftOver = 0;
    

       System.out.print("""
          
                YOU ARE WELCOME TO IYA ARAMIDE PIZZA JOINT
                        
                          MENU:
                       1. Sapa Size
                       2. Small Money
                       3. Big Boys
                       4. Odogwu


                     """);


           System.out.print("Enter options: ");
           int options = input.nextInt();

                 
  
        System.out.print("Enter the number of guest: ");
        int guest = input.nextInt();       

             switch(options){
                     case 1 ->{ 
                        System.out.println("Sapa Size: ");
                        pizzaPrice = 2500;
                        slice = 4;

                    }

                      case 2 ->{ 
                        System.out.println("Small Money: ");
                        pizzaPrice = 2900;
                         slice = 6;
                    }

                     case 3 ->{ 
                        System.out.println("Big Boys: ");
                        pizzaPrice = 4000;
                        slice = 8;  
                    }

                     case 4 ->{    
                        System.out.println("Odogwu: ");
                        pizzaPrice = 5200;
                        slice = 12;

                    }
                    
                    default -> {
                    
                           System.out.println("Invalid Option");
                            return;
                        }
                    }
                        int box = guest / slice;
                // System.out.println("Number of box before condition: " + box);

                     if (guest % slice != 0){
                         box = box + 1;
                      }

                        System.out.println("The number of box is: " + box);


                        int price = box * pizzaPrice;
                        System.out.println("Price: " + price);
                
                        leftOver = (slice * box) - guest;
                        System.out.println("Leftover: " + leftOver);

               
}
}
