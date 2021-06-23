// To read a txt file located at C:\Users\nisha\OneDrive - James Cook University\SP22-2021\Programming 3\WK 2\chapter-2-exercises-jc138691-master\resources\testdata.txt
// Must use \ escape character in every forward slash on the absolute path.
// Next to assign the text into a unique string variable and numbers to integer variable.
// To calculate the average and print the result.
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import the class to handle errors.
import java.util.Scanner; // Import the scanner class to read text file.
public class FindAverage {

    public static void main(String[] args){
        try{
            File myObject = new File("C:\\Users\\nisha\\OneDrive - James Cook University\\SP22-2021\\Programming 3\\WK 2\\chapter-2-exercises-jc138691-master\\resources\\testdata.txt");
            Scanner myReader = new Scanner(myObject);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            if (myObject.exists()) {
                System.out.println("File name: " + myObject.getName());
                System.out.println("Absolute path: " + myObject.getAbsolutePath());
                System.out.println("Writeable: " + myObject.canWrite());
                System.out.println("Readable " + myObject.canRead());
                System.out.println("File size in bytes " + myObject.length());
            } else {
                System.out.println("The file does not exist.");
            }
            myReader.close();

        } catch (FileNotFoundException e)
        {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }


    }


}
