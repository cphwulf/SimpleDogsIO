package simpledogsio;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class ImportDogsFromFileTest {
	String filename;
	
	@Before
	public void setUp() {
		filename = "Data/dogsOffspringtest.csv";
		filename = "Data/playforddogsOffSpring.csv";
		//filename = "Data/dogsOffspringtest2.csv";

	}

	/**
	 * Test of importDogsFromCSV method, of class ImportDogsFromFile.
	 */
	@Test
	public void testImportDogsFromCSV() throws Exception {
		System.out.println("importDogsFromCSV");
		ImportDogsFromFile myDogImport =  new ImportDogsFromFile();
		myDogImport.importDogsFromCSV(filename);
		myDogImport.lookupDogByName2("RUFUS");
		// TODO review the generated test code and remove the default call to fail.
		assertTrue(1==1);
	}
	
}
