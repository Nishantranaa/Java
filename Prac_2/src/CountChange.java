// This program will count my change and will produce an sum on my savings.
import java.util.*;
public class CountChange {

    public static void main(String[] args) {
        double FIVE_CENTS, TEN_CENTS, TWENTY_CENTS, FIFTY_CENTS, ONE_DOLLAR, TWO_DOLLARS, Total;
        // All capital variables are constant values.
        FIVE_CENTS = 0.5;
        TEN_CENTS = 0.10;
        TWENTY_CENTS = 0.20;
        FIFTY_CENTS = 0.50;
        ONE_DOLLAR = 1.00;
        TWO_DOLLARS = 2.00;


        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of 5c: ");
        double a = (FIVE_CENTS * s.nextInt());
        System.out.print("Enter the number of 10c: ");
        double b = (TEN_CENTS * s.nextInt());
        System.out.print("Enter the number of 20c: ");
        double c = (TWENTY_CENTS * s.nextInt());
        System.out.print("Enter the number of 50c: ");
        double d = (FIFTY_CENTS * s.nextInt());
        System.out.print("Enter the number of $1: ");
        double e =(ONE_DOLLAR * s.nextInt());
        System.out.print("Enter the number of $2: ");
        double f =(TWO_DOLLARS * s.nextInt());
        Total = a + b + c + d + e + f;
        System.out.println("Total in dollars is: $" + Total);


    }
}