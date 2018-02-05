import java.io.*;
import java.util.*;

public class Program2 {
    public static void main (String[] args) throws IOException {
        //variable declaration
        int i, count = 0, sum = 0;
        boolean ok = true;
        String word = null;                     //single parsed word
        String inBuffer = null;                 //string to hold buffered data
        String inputFileName = null;            //to store input filename
        String outputFileName = null;           //to store output filename
        Word[] words = new Word[100];           //array of "words"
        BufferedReader inFile;                  //to read in from the file
        PrintWriter outFile;                    //to print to the file
        StringTokenizer newLine;                //string tokenizer object

        //for keyboard input
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        //check to see if any command line arguments were entered
        if (args.length > 1) {

        }

        try {
            //more than one command line arg was entered. store them
            if (args[0].length() > 0 && args[1].length() > 0) {
                outputFileName = args[1];           //store output filename
                inputFileName = args[0];            //store input filename
                System.out.println(inputFileName + "     " + outputFileName);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            try { //only one command line arg was entered
                if (args[0].length() > 1) {
                    inputFileName = args[0];             //store input filename
                    //prompt user for a output file name
                    System.out.print("A output file name was not entered. Please enter a filename: ");
                    inBuffer = stdin.readLine();
                    if (inBuffer == null) {
                        ok = false;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e1) {

            }
        }

        //at this point we should have either two filenames or, the user decided to give up
        //try to open the input/output files
    } //end of main
} //end of class Program2

class Word {
    private String word;
    private int quant;
    public Word(String word) {
        this.word = word;
        quant = 1;
    }
    public void addOne() {
        quant++;
    }
    public int getCount() {
        return quant;
    }
    public boolean isWord(String word) {
        return this.word.equals(word);
    }
}
