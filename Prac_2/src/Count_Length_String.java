import java.util.Scanner;

public class Count_Length_String {

        static void count(String str)
        {
            // Create an char array of given String
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {

                // Declare an String with empty initialization.
                String s = ""; // This is were it resets for the second word characters to
                // be stored.

                // When the character is not space
                while (i < ch.length && ch[i] != ' ') {

                    // concat with the declared String
                    s = s + ch[i];
                    i++;
                }

                if (s.length() > 0)
                    System.out.println("Your first name is " + s + " has "  + s.length() + " characters." );
            }
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your first name and last name, separated by a space.");
            String full_name = sc.nextLine();
            count(full_name);
        }
    }

