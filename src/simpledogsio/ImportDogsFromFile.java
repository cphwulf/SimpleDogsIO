package simpledogsio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class ImportDogsFromFile {
		List ourDogs; 
		LinkedList<Dog> ourDogsLL; 
	// Dog(String name, String color, String breed, String name, String gender, String cityOrigin, int Mother, int Father)
	/*
	25703,Grey/Tan,Dobermann,E T,Desexed Male,WATERLOO CORNER,NULL,NULL
	26898,Blenheim,Spaniel,SAMO,Male,HILLIER,26901,26899
	26899,Blenheim,Spaniel,ANDY,Male,HILLIER,NULL,NULL
	26901,Blenheim,Spaniel,CORKY,Female,HILLIER,NULL,NULL
	*/
	public  void importDogsFromCSVToLinkedList(String filename) throws FileNotFoundException {
		ourDogsLL = new LinkedList<>();
		//String filenameOut = "Data/output.sql";
		File fh = new File(filename);
		Scanner myScanner = new Scanner(fh);
		myScanner.nextLine();
		long startTime = System.currentTimeMillis();
		while (myScanner.hasNextLine()) {
			String line = myScanner.nextLine();
			//String dogLine = String.format(dogFormat, args);
			String[] myArr = line.split(",");
			Dog tmpDog = new Dog(Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5]);
			ourDogsLL.add(tmpDog);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println("import to LL took " + (stopTime-startTime));

	}

	public void  lookupDogByNameInLL(String name) {
		long startTime = System.currentTimeMillis();
		for (Dog d:  ourDogsLL) {
			if (d.getName().equals(name)) {
				System.out.println("Got dog named " + d);
			}
		}
		long stopTime = System.currentTimeMillis();
		System.out.println("lookup for  name in  LL took " + (stopTime-startTime));
	}


	public  void importDogsFromCSV(String filename) throws FileNotFoundException {
		ourDogs = new ArrayList<>();
		String line = "";
		File fh = new File(filename);
		Scanner myScanner = new Scanner(fh);
		myScanner.nextLine();
		long startTime = System.currentTimeMillis();
		while (myScanner.hasNextLine()) {
			line = myScanner.nextLine();
			String[] myArr = line.split(",");
			Dog tmpDog = new Dog(Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5]);
			ourDogs.add(tmpDog);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println("import to arrayL took " + (stopTime-startTime));
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
		System.out.println("Lookup in arraylist took "+ millis+" milliseconds to run.");
		
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
