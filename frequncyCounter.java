import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;
/** ***************************************************
 *  Name:           Samarjeet Randhawa 
 *  Class:          CS30S
 * 
 *  Assignment:     A1.5
 * 
 *  Description:    write 1000 random digits between 1-50 to a file 
 * 
 *************************************************************/

public class frequncyCounter {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
         
        int randomInt = 0; 
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
        Random rnd = new Random(); 
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Samarjeet Randhawa" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1.5" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
    
for(int i = 0; i <1000; i++){
    
    randomInt = (rnd.nextInt(50) +1); 
    
    System.out.println(randomInt);  // prints numbers to terminal window 
    
    fout.println(randomInt); // prints to a file     
}// end of for loop 
    
    // ***** Print Formatted Output *****
    
    //for(int i = 0; i < 1000; i ++)
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        fout.println("End of Processing");
               
    // **** close io buffers *****
    
        //fin.close();
        fout.close();
    } // end main 
    
} // end FormatTemplate
