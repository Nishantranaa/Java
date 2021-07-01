/** This class will contain a routine which is a standard boolean-valued function
 * Character.isLetter(char) that will check if the parameter is a letter. If a letter
 * it will proceed to transforming it into an uppercase.
 */

// The main method will get user input using the Textio package. This will then
// call the printCapitalized subroutine and send in a parameter.
import textio.TextIO;

import java.util.Locale;

public class Check_then_Capitalize {

    public static void main(String[] args) {

        TextIO.put("Please enter a word to capitalize: ");
        String word = TextIO.getln();
        String out = printCapitalized(word);
        TextIO.putln(out);

        // or

        TextIO.put(printCapitalized(word)); // the return has to be stored somewhere you
        // can't expect it to print automatically.




    }

    static String printCapitalized(String word) {

        int word_count = word.length();
        boolean b1;
        String concat_string = null;

        for (int counter = 0; counter < word_count; counter++) {

            char letter = word.charAt(counter);
            b1 = Character.isLetter(letter);
            // TextIO.put(b1);
            if (b1 = true) {
                concat_string = Character.toString(letter).toUpperCase(Locale.ROOT);


            } else {
                TextIO.put("There was a non-character." + word_count);
            }


        }
    return concat_string;
    }
}

