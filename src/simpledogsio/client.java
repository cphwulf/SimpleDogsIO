package simpledogsio;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class client {
	public static void main(String[] args) {
		String filename = "Data/test2.csv";
		ImportDogsFromFile impDog = new ImportDogsFromFile();
		ArrayList<Dog> dogs = impDog.importDogsFromCSV(filename);
		for (Dog dog: dogs) {
			System.out.println(dog);
		}

		System.out.println(" --- SORTED -----");
		Collections.sort(dogs);
		for (Dog dog: dogs) {
			System.out.println(dog);
		}
		
	}
	
}

