// To read a txt file located at C:\Users\nisha\OneDrive - James Cook University\SP22-2021\Programming 3\WK 2\chapter-2-exercises-jc138691-master\resources\testdata.txt
// Must use \ escape character in every forward slash on the absolute path.
// Next to assign the text into a unique string variable and numbers to integer variable.
// To calculate the average and print the result.
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import the class to handle errors.
import java.lang.IndexOutOfBoundsException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Import the scanner class to read text file.
public class FindAverage {

    static int ConvertString2Int(String str) {


        int number = 0;
        try {
            number = Integer.parseInt(str);
            // System.out.println(number); // output = 25
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }


        return number;
    }

    public static void main(String[] args){
        try {
            File myObject = new File("C:\\Users\\nisha\\OneDrive - James Cook University\\SP22-2021\\Programming 3\\WK 2\\chapter-2-exercises-jc138691-master\\resources\\testdata.txt");
            Scanner myReader = new Scanner(myObject);
            List<String> list = new ArrayList<String>();
            int listSize = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                list.add(data);

            }


                System.out.println(list.get(0));
                int results = 0;

                // add a while loop so each time it call the method the results are added to the
               // results variable.

               //System.out.println(list.size()-1);

               for (int i = 1; list.size()-1 >= i; i++){

                   results = results + ConvertString2Int(list.get(i));

               }

                System.out.println("The average exam result is: "+ results/3);






//            if (myObject.exists()) {
//                System.out.println("File name: " + myObject.getName());
//                System.out.println("Absolute path: " + myObject.getAbsolutePath());
//                System.out.println("Writeable: " + myObject.canWrite());
//                System.out.println("Readable " + myObject.canRead());
//                System.out.println("File size in bytes " + myObject.length());
//            } else {
//                System.out.println("The file does not exist.");
//            }

            myReader.close();

        } catch (FileNotFoundException e)
        {
            System.out.println("An error has occurred.");
            e.printStackTrace();// good for developer testing.
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Your have entered an index that does not exist.");
            e.printStackTrace(); // good for developer testing.
        }



    }


}
