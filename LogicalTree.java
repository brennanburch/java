import java.util.Scanner;

public class LogicalTree {

    public static void main (String[] args ){

            int pump; //declares pump choice//
            String grade; //declares fuel grade//
            double howmany; //declares how many gallons
            int gradeNumber; //declares naming and price variables for fuel grade//

        double price;//sets price for each type
        double tax;//tax rate//
        double total;//price * gallons / tax//

        Scanner keyboard = new Scanner(System.in);

                //Ask user to select a pump//
        System.out.print("Welcome to Buc-ees. Choose your pump. Please enter 1, 2, 3, or 4.");
            pump = keyboard.nextInt();

        //user input for grade, which also assigns price//
        System.out.print("Please choose fuel grade. Type 1 for Regular Unleaded, 2 for Plus Unleaded, or 3 for Premium Unleaded.");
            gradeNumber = keyboard.nextInt();

            switch (gradeNumber){
                case 1:
                grade = ("Regular Unleaded");
                price = 1.00;
                break;

                case 2:
                    grade = ("Plus Unleaded");
                    price = 1.50;
                    break;
                case 3:
                    grade = ("Premium Unleaded");
                    price = 2.00;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + gradeNumber);
            }


        System.out.print("How many gallons?");
        //user input for gallons//
        howmany = keyboard.nextDouble();
        //calculate total//
        tax= (howmany * price * .09);
        total = ( price * howmany ) + (tax);




        //end of transaction statement that calculates price for variables user assigned through their inputs//
        System.out.print("You have chosen " + howmany + " gallons of " + grade + " on pump " + pump + ". Your total is $" + total + ".");


    }
}
