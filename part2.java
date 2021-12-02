import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/*************************************************************
 *  Name:           Samarjeet Randawa 
 *  Class:          CS30S
 * 
 *  Assignment:     A1.5 part 2 
 *
 *  Description:    counting the frequncy of each numbers 
 * 
 *************************************************************/

public class part2 {

    public static void main(String[] args) throws IOException{
        // ***** constants *******

            final int MAX = 1000; 
            final int ARRAYFREQUENCY = 51; 

        // ***** variables *****

            String banner = "";             // output banner
            String prompt = "";             // prompt for user input

            String strin = "";              // string fro keyboard input
            String strout = "";             // string for formatted output

            String delim = "[ ]+";          // delimiter for splitting input records
            String[] tokens = null;         // used to split input records
            BufferedReader fin = null; 

        // a new line character that works on every computer system
            String nl = System.lineSeparator();

            int[] list = new int[MAX];        // array of 1000 digits between 1-5
            int[] freq = new int[ARRAYFREQUENCY];       // array of the frequncy of each number 
            //int randomInt = 0;

        // ***** objects *****

            //Scanner scanner = new Scanner(System.in);
            //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        try{
            fin = new BufferedReader(new FileReader("outfle.txt"));
        }
        catch(FileNotFoundException e){

            System.out.println("file not found");
            fin = null;
            //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
        }
            PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("2ndfile.txt")));
            
        // ***** print banners *****

            // banner = "*****************************" + nl;
            // banner += "Name:        Samarjeet Randhawa " + nl;
            // banner += "Class:       CS30S" + nl;
            // banner += "Assignment:  A1.5 part 2 " + nl;
            // banner += "*****************************" + nl + nl;

            System.out.println(banner);
            //fout.print(banner);

        // ***** Get Input *****

            // prompt for input
            // read input from keyboard
            // echo input back to console window

        // ***** Main Processing *****

            int s = 0; 

        for(int i = 0; i <1000; i++){
            strin = fin.readLine();
            list[i] = Integer.parseInt(strin);

            //System.out.println(list[i]);

        }// end of for loop  
        
        // finding the frequency
        for(int i = 0; i < 1000; i++){

           freq[i -1] ++;
           
           System.out.println(freq);
            
        }// end for loop 

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

            System.out.println();
            System.out.println("end of processing");
            //fout.println("End of Processing");

        // **** close io buffers *****

            fin.close();
            //fout.close();
    } // end main 

} // end FormatTemplate
