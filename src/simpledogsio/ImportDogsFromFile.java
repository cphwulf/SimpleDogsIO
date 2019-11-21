/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package simpledogsio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class ImportDogsFromFile {
	//Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER
	// Dog(String name, String gender, String color, String race, String cityOrigin)
	public ArrayList<Dog> importDogsFromCSV(String filename) {
		ArrayList<Dog> dogs = new ArrayList<>();
		
		String line = "";
		File fh = new File(filename);
		try {
			Scanner myScanner = new Scanner(fh);
			while (myScanner.hasNextLine()) {
				line = myScanner.nextLine();
				String[] myArr = line.split(",");
				Dog tmpDog = new Dog(Integer.parseInt(myArr[0]), myArr[3], myArr[4], myArr[1], myArr[2], myArr[5]);
				dogs.add(tmpDog);
			}
			
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
		return  dogs;
	}
	
}
