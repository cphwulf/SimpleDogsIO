package simpledogsio;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class client {
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "Data/test.csv";
		DogHandler.readDogFromFile(filename);
		
	}
	
	static class DogHandler {
		public static void readDogFromFile(String filename) throws FileNotFoundException {
			File fh = new File(filename);
			String line = "";
			Scanner myScanner = new Scanner(fh);
			while (myScanner.hasNextLine()) {
				line = myScanner.nextLine();
				System.out.println(line);
			}
		}
		public static void DogToHml(String dogString, String dest) throws FileNotFoundException {

		}

	}
	
}
