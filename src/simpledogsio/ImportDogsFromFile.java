package simpledogsio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class ImportDogsFromFile {
		List ourDogs; 
	// Dog(String name, String color, String breed, String name, String gender, String cityOrigin, int Mother, int Father)
	/*
	25703,Grey/Tan,Dobermann,E T,Desexed Male,WATERLOO CORNER,NULL,NULL
	26898,Blenheim,Spaniel,SAMO,Male,HILLIER,26901,26899
	26899,Blenheim,Spaniel,ANDY,Male,HILLIER,NULL,NULL
	26901,Blenheim,Spaniel,CORKY,Female,HILLIER,NULL,NULL
	*/
	public  void importDogsFromCSV(String filename) throws FileNotFoundException {
		ourDogs = new ArrayList<>();
		//String filenameOut = "Data/output.sql";
		String filenameOut = "Data/dogs.csv";
		String sqlLine = "INSERT INTO DOGS (DogID,Color,Breed,DogName,Gender,CityOrigin) ";
		sqlLine += " VALUES(%d,\"%s\",\"%s\",\"%s\",\"%s\",\"%s\")";
		String line = "";
		File fh = new File(filename);
		File fhout = new File(filenameOut);
		Scanner myScanner = new Scanner(fh);
		myScanner.nextLine();
		while (myScanner.hasNextLine()) {
			line = myScanner.nextLine();
			//String dogLine = String.format(dogFormat, args);
			String[] myArr = line.split(",");
			String args = "Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5])";
			Dog tmpDog = new Dog(Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5]);
			ourDogs.add(tmpDog);
			String tmpString = String.format(sqlLine,Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5] );
			//System.out.println(tmpString);
		}
		/*
		for (Dog d:ourDogs) {
			System.out.println(d);
		}
*/
		}
	public void  lookupDogByName2(String name) {

		// lookup particular dog
		long before=System.currentTimeMillis();

		for (int i=0;i < ourDogs.size();i++) {
			Dog tmpDog = (Dog) ourDogs.get(i);
			if (tmpDog.getName().equals(name)) {
				System.out.println("Got a dog named " + name);
			}
		}
		long after=System.currentTimeMillis();
		long millis=after-before;
		System.out.println("It took "+ millis+" milliseconds to run.");
		
	}

	/*
	public void  lookupDogByName(String name) {

		// lookup particular dog
		long before=System.currentTimeMillis();

		for (Dog d:ourDogs) {
			if (d.getName().equals(name)) {
				System.out.println("Got a dog named " + name);
			}
		}
		long after=System.currentTimeMillis();
		long millis=after-before;
		System.out.println("It took "+ millis+" milliseconds to run.");
		
	}
*/
	
}
