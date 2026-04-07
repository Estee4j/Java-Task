import java.util.Scanner;

  public class MonthlySalary {

   public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

     System.out.println("Enter monthly salary: ");
     double monthlySalary = input.nextDouble();

     double annualSalary = monthlySalary * 12;

      double tax = 0;

      if (annualSalary <= 300000) {
         tax = 0;
       }

    else if (annualSalary <= 600000) {
    
       double taxableAmount = annualSalary - 300000;
         tax = taxableAmount = 0.15;
   
       }

        else {
        double firstTax = 45000;
         double remaining = annualSalary - 600000;
          double secondTax = remaining * 0.25;

          tax = firstTax + secondTax;

}

        System.out.println("Annual salary is: " + annualSalary);
       System.out.println("Tax to pay is: " + tax);

}


 
}   
