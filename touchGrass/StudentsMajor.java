import java.util.Scanner;
   
    public class StudentId{
       
       public static void main(String[] args){

         Scanner userinput = new Scanner(System.in);

           System.out.print("enter an alphabets\n");
             
              String uservalue = userinput.nextLine();

             System.out.print("enter a number\n");
             int uservalueone = userinput.nextInt();


String courseone = "information management";
String coursetwo = "computer science";
String coursethree = "accounting";
String coursefour = "engineering";
String coursefive = "law";


String yearone = "Freshman";
String yeartwo = "Sophomore";
String yearthree = "Junior";
String yearfour = "Senior";



if(uservalue.equals("i") || uservalue.equals("I")){
System.out.print("your major is:" + courseone + " and  ");
} else if(uservalue.equals("c") || uservalue.equals("C")){
System.out.print("your major is:" + coursetwo + " and  ");
} else if(uservalue.equals("a") || uservalue.equals("A")){
System.out.print("your major is:" + coursethree + " and  ");
} else if(uservalue.equals("e") || uservalue.equals("E")){
System.out.print("your major is:" + coursefour + " and  ");
} else if(uservalue.equals("l") || uservalue.equals("L")){
System.out.print("your major is:" + coursefive + " and  ");
}


if(uservalueone == 1){
System.out.println("your a:" + yearone);
} else if(uservalueone == 2){
System.out.println("your a:" + yeartwo);
} else if(uservalueone == 3){
System.out.println("your a:" + yearthree);
} else if(uservalueone == 4){
System.out.println("your a:" + yearfour);
} 



}

}
