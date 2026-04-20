import java.util.Scanner;

public class Evenorodd{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

 
 int  highest = 0;

for (int number = 1; number < 11; number ++){
    System.out.println("Enter a score");
    int scores = input.nextInt();

    if (scores > highest) {
        highest = scores;
}
} 
  System.out.printf("Highest score is %d \n", highest);
}

}
