import java.io.*;
import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args) throws FileNotFoundException {
        
        //write to file
        PrintWriter outFile = new PrintWriter("greeting.txt");
        outFile.println("Hello, world!");
        outFile.close();

        //read from file
        File inFile = new File("greeting.txt");
        Scanner in = new Scanner(inFile);
        String message = in.nextLine();
        System.out.println(message);
        in.close();
    }
}