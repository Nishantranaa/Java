// ```
//Please enter your name: Fred
//Hello, FRED, nice to meet you!
import java.util.*;
public class Greeting {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // a constructor of the scanner class.
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Hello, " + name.toUpperCase() + ", nice to meet you!");



    }
}

