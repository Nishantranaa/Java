// TODO: Tests some of the built-in subroutines for working with **Strings**.
//  The program should ask the user to enter their first name and their last name,
//  separated by a space. Read the user's response using.
//  Break the input string up into two strings, one containing the first name
//  and one containing the last name. You can do that by using the while (sc.hasNext())
//  subroutine to find the position of the space, and then using `substring()`
//  to extract each of the two names. Also output the number of characters in each name,
//  and output the user's initials. The initials are the first letter of the first name
//  together with the first letter of the last name.
// Know Tokens and Delimiters
// Tokens are meaningful words, and delimiters are characters that separate tokens.
import java.util.*;

public class FirstNameLastName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name and last name, separated by a space.");
        String full_name = sc.nextLine();// reads the input text and stores it into the variable full_name.
        sc = new Scanner(full_name);
        List<String> list = new ArrayList<String>();
        sc.useDelimiter("[ .]"); // The useDelimiter() method is used to inform the hasNext() method what to use as delimiters.
        while (sc.hasNext()) { // Next, I used a while loop to traverse all the tokens in the string. In the while loop’s condition, the hasNext() method was invoked to check if there was any more next token:
            String token = sc.next();//we can use to split a string into tokens is the next() method in the Scanner class, which uses whitespace as the default delimiter.
            list.add(token);


            System.out.println("Your first name is " + token + " and has " + token.length()+ " characters.");
        }


            //The hasNext() method returns true if there is more token, otherwise false is return, which also indicates that the end of the string has been reached.
            //By default, the hasNext() method uses whitespaces as delimiter to separate and navigate among tokens.
            //The hasNext() method reads a token, and stops if it reaches a delimiter. If the method is being kept invoking, it reads the next token and stops if it reaches another delimiter. The whole process repeats until there is no more token.
            //Actually, the hasNext() method does not read the tokens, rather it just checks to see if there are any more tokens left.
            //The one that actually reads and returns the tokens is the next() method.


            // The carat in Java means ^ except.
            // Notes from this site: https://www.codementor.io/@seranguyen/java-regular-expression-part-7-
            // extracting-text-with-java-util-scanner-rg1q2wpv2

    }
}
