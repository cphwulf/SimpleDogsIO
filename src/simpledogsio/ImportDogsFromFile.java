package simpledogsio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class ImportDogsFromFile {
	// Dog(String name, String color, String breed, String name, String gender, String cityOrigin, int Mother, int Father)
	/*
	25703,Grey/Tan,Dobermann,E T,Desexed Male,WATERLOO CORNER,NULL,NULL
	26898,Blenheim,Spaniel,SAMO,Male,HILLIER,26901,26899
	26899,Blenheim,Spaniel,ANDY,Male,HILLIER,NULL,NULL
	26901,Blenheim,Spaniel,CORKY,Female,HILLIER,NULL,NULL
	*/
	public static void importDogsFromCSV(String filename) throws FileNotFoundException {
		String filenameOut = "Data/output.sql";
		//String sqlLine = "INSERT INTO DOG (DogID, Name,Gender,Color,Race,CityOrigin,Mother,Father) ";
		String sqlLine = "INSERT INTO DOGS (DogID,Color,Breed,DogName,Gender,CityOrigin) ";
		sqlLine += " VALUES(%d,\"%s\",\"%s\",\"%s\",\"%s\",\"%s\")";
		String line = "";
		File fh = new File(filename);
		File fhout = new File(filenameOut);

		Scanner myScanner = new Scanner(fh);
		while (myScanner.hasNextLine()) {
			line = myScanner.nextLine();
			String[] myArr = line.split(",");
			String tmpString = String.format(sqlLine, Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5]);
			tmpString += ";";
			System.out.println(tmpString);
		}
		
	}
	
}
