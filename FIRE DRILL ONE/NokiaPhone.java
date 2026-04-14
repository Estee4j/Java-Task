import java.util.Scanner;

 public class NokiaPhone {
  
  public static void main(String [] args) {

   Scanner input = new Scanner(System.in);

     
           
        System.out.print("""

                                List of Menu Options

                                    1. Phonebook
                                    2. Messages
                                    3. Chat
                                    4. Call register
                                    5. Tones
                                    6. Settings
                                    7. Call divert
                                    8. Games
                                    9. Calculator
                                    10. Reminders
                                    11. Clock
                                    12. Profiles
                                    13. SIM services
                            """);




      System.out.println("Enter option from 1-10: ");
       int option = input.nextInt();


        switch (option) {

              case 1 ->{

                             System.out.print("""

                                        Phonebook

                                        1. Search
                                        2. Service No
                                        3. Add name
                                        4. Erase
                                        5. Edit
                                        6. Assign tone
                                        7. Send b'card
                                        8. Options
                                        9. Speed dials
                                        10. Voice tags

                                   """);



     


              System.out.println("Enter option from 1-10: ");
               option = input.nextInt();

                  switch (option) {

                        case 1 -> System.out.println("Search");
                        case 2 -> System.out.println("Service No");
                        case 3 -> System.out.println("Add name");
                        case 4 -> System.out.println("Erase");
                        case 5 -> System.out.println("Edit");
                        case 6 -> System.out.println("Assign tone");
                        case 7 -> System.out.println("Send b'card'");
                        case 8 ->{ System.out.println("Options");

                       

                         
                           System.out.print("""
                                      1. Type of view 
                                      2. Memory status

                                    """);
 
                         System.out.println("Enter option from 1-2: ");
                             option = input.nextInt();

                         switch (option) {
                                    case 1 -> System.out.println("Type of view");
                                    case 2 -> System.out.println("Memory status");


}


}



                            
                        case 9 -> System.out.println("Speed dials");                                
                        case 10 -> System.out.println("Voice tags");


}
}


  
                     case 2 ->{

                      
                System.out.print("""

                                    Messages
                                    1. Write messages
                                    2. Inbox
                                    3. Outbox
                                    4. Picture messages
                                    5. Templates
                                    6. Smileys
                                    7. Message settings
                                    8. Inf0 service
                                    9. Voice mailbox number
                                    10. Service command editor 

                        """);
       


                 System.out.println("Enter option from 1-10: ");
                  option = input.nextInt();
               
                  switch (option) {
                                    case 1 ->  System.out.println("Write messages");
                                    case 2 ->  System.out.println("Inbox");
                                    case 3 ->  System.out.println("Outbox");
                                    case 4 ->  System.out.println("Picture messages");
                                    case 5 ->  System.out.println("Templates");
                                    case 6 ->  System.out.println("Smileys");
                                    case 7 ->{  System.out.println("Message settings");

                 System.out.print("""
        
                                1. Set
                                2. Common
                                
                    """);
                  

         
        System.out.println("Enter option from 1-2: ");
            option = input.nextInt();
           switch (option) {
                case 1 ->{ System.out.println("Set");
            
            System.out.print("""

                        1. Message centre number
                        2. Message sent as
                        3. Message validity

                """);


                System.out.println("Enter option from 1-3 ");
            option = input.nextInt();
           switch (option) {
            case 1 -> System.out.println("Message centre number");
            case 2 -> System.out.println("Message sent as");
            case 3 -> System.out.println("Message validity");
}
}

            case 2 ->{ System.out.println("Common");

            System.out.print("""

                    1. Delivery reports
                    2. Reply via same centre
                    3. Character support
 
                  
                    """);


       
   
             System.out.println("Enter number from 1-3: ");
            int number = input.nextInt();
           switch (number) {

               case 1 -> System.out.println("Delivery report");
               case 2 -> System.out.println("Reply via same centre");
               case 3 -> System.out.println("Character support");


}


}


}

}

        case 8 -> System.out.println("Info service");
        case 9 -> System.out.println("Voice mailbox number");
        case 10 -> System.out.println("Service command editor");

}

}


        case 3 -> System.out.println("Chat");

        case 4 ->{
                
                System.out.print("""
                  Call register
                    1. Missed calls
                    2. Received calls
                    3. Dialed numbers
                    4. Erase recent call lists
                    5. Show call duration
                    6. Show call cost 
                    7. call cost setting
                    8. Prepaid credit

                """);

        System.out.println("Enter option from 1-8: ");
            option = input.nextInt();
           switch (option) {

                case 1 -> System.out.println("Missed calls");
                case 2 -> System.out.println("Received calls"); 
                case 3 -> System.out.println("Dialed numbers");
                case 4 -> System.out.println("Erase recent call lists");
                case 5 ->{ System.out.println("Show call duration");
  
            System.out.print("""
                        
                    1. Last call duration
                    2. All calls' duration
                    3. Received calls' duration
                    4. Dialed calls' duration
                    5. Clear timers
                    
        """);

       System.out.println("Enter option from 1-6: ");
            option = input.nextInt();
           switch (option) {

            case 1 -> System.out.println("Last call duration");                     
            case 2 -> System.out.println("All calls' duration");
            case 3 -> System.out.println("Received calls' duration");
            case 4 -> System.out.println("Dialled calls' duration");
            case 5 -> System.out.println("Clear timers");
}


}

            case 6 ->{ System.out.println("Show call cost");

           System.out.print("""

                    1. Last call cost
                    2. All calls' cost 
                    3. Clear counters

              """);

              System.out.println("Enter option from 1-3: ");
            option = input.nextInt();
           switch (option) {
  
            case 1 -> System.out.println("Last call cost");
            case 2 -> System.out.println("All calls' cost");
            case 3 -> System.out.println("Clear counters");

}

}

            case 7 ->{  System.out.println("Call cost setting");

            System.out.print("""

                                1. Call cost limit
                                2. Show cost in

                            """);

                 System.out.println("Enter option from 1-2: ");
            option = input.nextInt();
           switch (option) {     

            case 1 -> System.out.println("Call cost limit"); 
            case 2 -> System.out.println("Show cost in");


}

}

            case 8 -> System.out.println("Prepaid credit");
              

}


}



            case 5 ->{

                    System.out.print("""
                         Tones
                           1. Ringing tone
                           2. Ringing volume
                           3. Incoming call alert
                           4. Composer
                           5. Message alert tone 
                           6. Keypad tones 
                           7. Warning and gaming tones
                           8. Vibrating alert
                           9. Screen saver

                                """);

                               
                  System.out.println("Enter option from 1-9: ");
                      option = input.nextInt();
           switch (option) {
                            case 1 -> System.out.println("Ringing tone");
                           case 2 -> System.out.println("Ringing volume");
                            case 3 -> System.out.println("Incoming call alert");
                            case 4 -> System.out.println("Composer");
                            case 5 -> System.out.println("Message alert tone");
                            case 6 -> System.out.println("Keyad tones");
                            case 7 -> System.out.println("Warning and game tone");
                            case 8 -> System.out.println("Vibrating alert");
                            case 9 -> System.out.println("Screen saver");

     }


}

                       
                 case 6 ->{

                  System.out.print("""
                                    Settings
                                1. Call settings
                                2. Phone settings
                                3. Security settings
                                4. Restore factory settings

                        """);

             System.out.println("Enter the option from 1-6: ");
            option = input.nextInt();
           switch (option) {

                case 1 ->{ System.out.println("Calling setting");
                        System.out.print("""        

                         1. Automatic redial
                         2. Speed dialing 
                         3. Call waiting options
                         4. Own number sending
                         5. Phone line in use 
                         6. Automatic answer

                            """);

                  System.out.println("Enter option from 1-6: ");
            option = input.nextInt();
           switch (option) {
            case 1 -> System.out.println("Automatic redial");
            case 2 -> System.out.println("Speed dialing");
            case 3 -> System.out.println("Call waiting options");
            case 4 -> System.out.println("Own number sending");
            case 5 -> System.out.println("Phone line in use");
            case 6 -> System.out.println("Automatic answer");

}

}


           case 2 ->{ System.out.println("Calling setting");
                        System.out.print("""        
                                
                            1. Language
                            2. Cell info display
                            3. Welcome note
                            4. Network selection
                            5. Light
                            6. Confirm SIM service actions

                                """);

            System.out.print("Enter option from 1-6: ");
                option = input.nextInt();
                switch (option) {
                    case 1 -> System.out.println("Language");
                    case 2 -> System.out.println("Cell info display");
                    case 3 -> System.out.println("Welcome selection");
                    case 4 -> System.out.println("Network selection");
                    case 5 -> System.out.println("Light");
                    case 6 -> System.out.println("Confirm SIM service actions");

}

}

             case 3 ->{ System.out.println("Security setting");
                        System.out.print("""

                           1. PIN code request
                           2. Call barring service
                           3. Fixed dialing 
                           4. Closed user group
                           5. Phone Security 
                           6. Change access codes
                     
                                """);

                 System.out.print("Enter the option from 1-6: ");
                option = input.nextInt();
                switch (option) {
                    case 1 -> System.out.println("PIN code request");
                    case 2 -> System.out.println("Call barring service");
                    case 3 -> System.out.println("Fixed dialing");      
                    case 4 -> System.out.println("Closed user group");
                    case 5 -> System.out.println("Phone Security");
                    case 6 -> System.out.println("Change access codes");

}


}

            case 4 -> System.out.println("Restore factory setting");

}


}


            
            case 7 -> System.out.println("Call divert");

            case 8 -> System.out.println("Games");

            case 9 -> System.out.println("Calculator");

            case 10 -> System.out.println("Reminder");

           
                case 11 ->{ 
                          System.out.println("""

 }                           1. Alarm clock
                             2. Clock settings
                             3. Date setting
                             4. Stopwatch
                             5. Countdown timer
                             6. Auto update of date and time

                                """);

            
            System.out.print("Enter the option from 1-6: ");
                option = input.nextInt();
                switch (option) {
                    case 1 -> System.out.println("Alarm clock");
                    case 2 -> System.out.println("Clock setting");
                    case 3 -> System.out.println("Date setting");
                    case 4 -> System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");




}

}
            
                    
            case 12 -> System.out.println("Profile");

            case 13 -> System.out.println("Prepaid credit");






}



}

}



















































































































































































































