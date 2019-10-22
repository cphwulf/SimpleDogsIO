package simpledogsio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class ImportDogsFromFile {
	//Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER
	// Dog(String name, String gender, String color, String race, String cityOrigin)
	public static void importDogsFromCSV(String filename) {
		DogCompound myCompound = new DogCompound("C10", "Kurt");
		String line = "";
		File fh = new File(filename);
		try {
			Scanner myScanner = new Scanner(fh);
			while (myScanner.hasNextLine()) {
				line = myScanner.nextLine();
				line = "keraerr";
				String[] myArr = line.split(",");
				Dog tmpDog = new Dog(myArr[3], myArr[4], myArr[1], myArr[2], myArr[5]);
				myCompound.addDog(tmpDog);
			}
			myCompound.showDogs();
			
		} catch (Exception e) {
			System.out.println("error: " + e);

		}
	}
	
}
