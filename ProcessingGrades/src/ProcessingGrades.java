import java.io.*;
import java.util.*;

public class ProcessingGrades {
	//create the IO for data
    static void fileIO(String fileName) throws IOException {
      Scanner reader = new Scanner(new File(fileName));
        PrintWriter writer = new PrintWriter("out_" + fileName);

        while (reader.hasNextLine()) {
            String line = reader.next();
            System.out.println(line);
            for (int i = 0; i < line.length(); i++){
                writer.print(line.charAt(i));
                
            }
            writer.print("\n");//creates output file//
        }
        //Calculate each student's average grade

        //assign letter grade for each student's average grade

        //calculate average grade for all students

        //print the result to display on screen and out to a file
        reader.close();
        writer.close();
    }

    public static void main(String[]args) throws IOException {
        ProcessingGrades.fileIO("students.txt");     

    }



}




