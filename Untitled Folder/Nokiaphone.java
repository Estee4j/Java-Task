import java.util.Scanner;

 public class Nokiaphone {

  public static void main(String [] args ) {

   Scanner input = new Scanner(System.in);

         System.out.print("NokiaPhoneMenu: \n");
         System.out.print("Enter your PhoneMenu choice from 1 - 13: \n");
         int number1 = input.nextInt();



     String NokiaPhoneMenu = """ 
                                   
                                     1-> Phonebook
                                     2-> Mesages
                                     3-> Chat
                                     4-> Call Register
                                     5-> Tone
                                     6-> Settings
                                     7-> Call divert
                                     8-> Games
                                     9-> Calculator
                                     10-> Reminder
                                     11-> Clock
                                     12-> Profiles
                                     13-> Sim services
                             """;

         
                System.out.print("Enter Phonebook option from 1-10: ");
                  int number2 = input.nextInt();


              String Phonebook = ("""
                                      1. Search;
                                      2. Service No;
                                      3. Add name;
                                      4. Erase;
                                      5. Edit;
                                      6. Assign tone;
                                      7. Send b'card;
                                      8. Options;
                                      9. Speed dials;
                                      10. Voice tags;

                              """);

                
                 switch (number2) {
                       case 1 ->{ System.out.print("search\n");
                       }
                       case 2 ->{ System.out.print("Service No");
                       }
                       case 3 ->{ System.out.print("Add name");
                       }
                       case 4 ->{ System.out.print("Erase");
                       }
                       case 5 ->{ System.out.print("Edit");
                       }
                       case 6 ->{ System.out.print("Assign tone");
                       } 
                       case 7 ->{ System.out.print("Send b'card");
                       }
                       case 8 ->{ System.out.print("Options\n");
                     
                     System.out.print("Option menu from 1-2: ");                       

                       int number3 = input.nextInt();

                     switch (number3){
                           case 1 -> System.out.print("Type of view");
                           case 2 -> System.out.print("Memory status\n");
}
}

                       case 9 ->{ System.out.print("Speed dials");
                       }
                       case 10 ->{ System.out.print("Voice tags");
                       }
}

                          String Message = ("""

                      case 2 -> System.out.print("Enter Message option from 1-10: ");
                                System.out.print("Message");

                                    """);


                     int number4 = input.nextInt();
                     switch (number4) {
                    
                       case 1 ->{ System.out.print("Write a messages");
                       }
                       case 2 ->{ System.out.print("Inbox");
                       }
                       case 3 ->{ System.out.print("Outbox");
                       }
                       case 4 ->{ System.out.print("Picture messages");
                       }
                       case 5 ->{ System.out.print("Templates");
                       }
                       case 6 ->{ System.out.print("Smileys");
                       }
                       case 7 ->{ System.out.print("Messsage settings: ");

                        number4 = input.nextInt();
                        switch (number4) {

                          case 1 ->{ System.out.print("Set 1");
                          System.out.print("Message centre option (1) from 1-3: ");

                       int number5 = input.nextInt();
                       switch (number5) {
                        case 1 -> System.out.print("Message center number");
                        case 2 -> System.out.print("Message sent as");
                        case 3 -> System.out.print("Message validity");

                }
                }

                         case 11 -> { 
                            System.out.print("Common: ");
                            System.out.print(" Message centre option(2) from 1-3: ");
                             int number6 = input.nextInt();

                        switch (number6){
                          case 1 -> System.out.print("Delivery reports");
                          case 2 -> System.out.print("Reply via same centre");
                          case 3 -> System.out.print("Character support \n");
                          
                    }

                    }

                             case 8 ->{ System.out.print("Info Service");
                             }
                             case 9 ->{ System.out.print("Voice mailbox number");
                             }
                             case 10 ->{ System.out.print("Service command editor");
}

}

}
}
                           

                                 String Chat = ("""
                          
                             case 3 -> System.out.print("Chat");
                           
                                            """);
               
                  String Callregister = ("""
                  case 4 -> System.out.print("Call register\n");
                  System.out.print("Enter call register option from 1 -8: ");

                      case 1 -> System.out.print("Missed call\n");
                      case 2 -> System.out.print("Received calls\n");
                      case 3 -> System.out.print("Dialled calls\n");
                      case 4 -> System.out.print("Erase recent call lists\n");         
                      case 5 -> System.out.print("Show call duration\n");
                   
      
                   System.out.print("Show call duration option from 1-6: ");
                   int number7 = input.nextInt(); 
                     switch (number7) {

                      case 1-> System.out.print("Last call duration");
                      case 2-> System.out.print("All calls' duration");
                      case 3-> System.out.print("Received calls' duration");
                      case 4-> System.out.print("Dialled calls' duration");
                      case 5-> System.out.print("Clear timer");
                      case 6-> System.out.print("Show call costs");
                     
                        
                          case 12 ->  
                        System.out.print("Show call cost: ")
                        System.out.print("Enter show call costs from 1-3: ");
                        int number8 = input.nextInt();
                        
                         switch (number8) {
                           case 1 -> System.out.print("Last call cost");
                           case 2 -> System.out.print("All calls' cost");
                           case 3 -> System.out.print("cleat counters"); 
                           case 7 -> System.out.print("Call cost settings");

                             System.out.print("Call cost settings");
                             System.out.print("Enter call cost settings from 1-2: ");

                             int number9 = input.nextInt();
                              switch number9 {
                               case 1 -> System.out.print("Call cost limit");
                               case 2 -> System.out.print("show costs in");
                               case 8-> System.out.print("Prepaid credit");
                       
                               """);
                             
                            }
                }      



