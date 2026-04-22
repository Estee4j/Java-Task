import java.util.Scanner;

 public class RversePatterns{
 
   public static void main(String[] args){
      
     Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();

    for (int count = 1; count <= rows; count++){
     for (int spaceBar = 1; spaceBar <= rows - count; spaceBar++){
           System.out.print(" ");
}
        for (int number = 1; number <= count; number++){
             System.out.print("*");
      } 
         System.out.println();
}
}

}
