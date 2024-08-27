import java.util.Scanner;

public class IT24101474Lab5Q3 {

    final static double roomChargePerDay = 48000;
    final static double discountPercent1 = 0.1;
    final static double discountPercent2 = 0.2;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input start and end date
        System.out.println("Enter the start date(1-31): ");
        int startDate = scanner.nextInt();

         System.out.println("Enter the end date(1-31): ");
         int endDate = scanner.nextInt();

        int numberOfDays = endDate - startDate; // calculate the number of days reserved
        double totalAmount;
        

        // // validation
         if (startDate < 1 || endDate < 1 || startDate > 31 || endDate > 31) {
           System.out.println("Error:Start date and end date cannot be less than 1 or greater than 31");
             return; // exit the programme
         }

        if(startDate >= endDate) 
        {
             System.out.println("Error:Days must be 1 and 31");
             return;
         }
        
            double discount;     

            switch (numberOfDays) {

            case 3:
            case 4:
                discount= discountPercent1;
                break;

           case 5:
           case 6:
               discount = discountPercent2;
             break;

          default:
          discount=discountPercent2;
             break;
         }


         totalAmount = roomChargePerDay * numberOfDays;
         double discountAmount = totalAmount * discount;
          double finalAmount=totalAmount-discountAmount;

         System.out.println("Number of days reserved:" + numberOfDays);
         System.out.println("Room charge per day:" + roomChargePerDay);
         System.out.println("Total amount to be paid:" + totalAmount);
         System.out.println("Discount applied: " +(discount*100)+ "%");
         System.out.println("Total amount to be paid after discount: " +finalAmount);
    }
    }
    