package simpledogsio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class ImportDogsFromFile {

	public final String[] breeds = {"Affenpinscher","Airedale Terrier","Akita","Akita X","Alaskan Malamute","Alaskan Malamute X","American Bull Dog","American Bull Terrier","American Pit Bull","American Staffordshire Terrier","American Staffordshire Terrier Cross","Anatolian Shepherd Dog","Anatolian Shepherd Dog X","Aust Bulldog","Australian Cattle Dog","Australian Cattle Dog X","Australian Kelpie","Australian Kelpie X","Australian Shepherd","Australian Shepherd X","Australian Silky Terrier","Australian Silky Terrier X","Australian Stumpy Tail Cattle Dog","Australian Stumpy Tail Cattle Dog X","Australian Terrier","Australian Terrier X","Basenji","Basenji X","Bassett Hound","Bassett Hound X","Beagle","Beagle X","Bearded Collie","Bearded Collie X","Bedlington Terrier","Belgian Shepherd Dog","Belgian Shepherd Dog X","Bernese Mountain Dog","Bernese Mountain Dog X","Bichon Frise","Bichon Frise x","Border Collie","Border Collie X","Border Terrier","Boston Terrier","Boston Terrier X","Bouvier Des Flandres","Boxer","Boxer X","Breed_Description","British Bulldog","British Bulldog X","Brittany","Bull Terrier","Bull Terrier (Miniature)","Bull Terrier X","Bulldog","Bullmastiff","Bullmastiff X","Cairn Terrier","Cairn Terrier X","Cane Corso","Cavalier King Charles Spaniel","Cavalier King Charles Spaniel X","Chesapeake Bay Retriever","Chihuahua","Chihuahua X","Chinese Crested Dog","Chinese Crested Dog X","Chow Chow","Chow Chow X","Cocker Spaniel","Cocker Spaniel (American)","Cocker Spaniel X","Collie (Rough Coat) X","Collie (Rough)","Collie (Smooth)","Collie (Smooth) X","Coolie","Coolie X","Corgi","Corgi X","Curly Coated Retriever","Curly Coated Retriever X","Dachshund","Dachshund (Miniature)","Dachshund X","Dalmation","Dalmation X","Dandie Dinmont Terrier X","Deerhound","Deerhound X","Dobermann","Dobermann X","Dogue De Bordeaux","Dogue De Bordeaux X","Dutch Shepherd","English Setter","English Springer Spaniel","English Springer Spaniel X","English Toy Terrier","Fauve De Bretagne","Field Spaniel","Finnish Lapphund","Flatcoated Retriever","Fox Terrier (Smooth)","Fox Terrier (Smooth)  X","Fox Terrier (Wire)","Fox Terrier (Wire) X","Foxhound X","French Bulldog","French Bulldog X","German Cooly","German Pinscher","German Shepherd Dog","German Shepherd Dog X","German Shorthaired Pointer","German Shorthaired Pointer X","German Spitz","German Spitz X","Golden Retriever","Golden Retriever X","Grand Basset Griffon Vendeen","Great Dane","Great Dane X","Greyhound","Greyhound X","Griffon Bruxellois","Griffon Bruxellois X","Havanese","Hungarian Vizsla","Hungarian Vizsla X","Hungarian Wirehaired Vizsla","Irish Setter","Irish Water Spaniel","Irish Wolfhound","Irish Wolfhound X","Italian Greyhound","Italian Greyhound X","Jack Russell Terrier","Jack Russell Terrier X","Japanese Chin","Japanese Spitz","Japanese Spitz X","Keeshond","Kerry Blue Terrier","King Charles Spaniel","King Charles Spaniel X","Labrador Retriever","Labrador Retriever X","Lakeland Terrier","Leonberger","Lhasa Apso","Lhasa Apso X","Lurcher","Maltese","Maltese X","Maremma Sheepdog","Maremma Sheepdog X","Mastiff","Mastiff X","Miniature Pinscher","Miniature Pinscher X","Neapolitan Mastiff","Neapolitan Mastiff X","Newfoundland","Newfoundland X","Norfolk Terrier","Norwegian Elkhound","Nova Scotia Duck Tolling Retriever","Nova Scotia Duck Tolling Retriever X","Old English Sheepdog","Papillon","Papillon X","Pekingese","Pekingese X","Pointer","Pointer X","Pomeranian","Pomeranian X","Poodle","Poodle (Miniature)","Poodle (Miniature) X","Poodle (Toy)","Poodle (Toy) X","Poodle Standard","Poodle Standard X","Poodle X","Portugese Water Dog","Pug","Pug X","Puli","Pyrenean Mountain Dog","Rhodesian Ridgeback","Rhodesian Ridgeback X","Rottweiler","Rottweiler X","Russian Black Terrier","Saluki","Samoyed","Samoyed X","Schipperke","Schnauzer","Schnauzer (Giant)","Schnauzer (Giant) X","Schnauzer (Miniature)","Schnauzer (Miniature) X","Schnauzer X","Scottish Terrier","Scottish Terrier X","Shar Pei","Shar Pei X","Shetland Sheepdog","Shetland Sheepdog X","Shiba Inu","Shih Tzu","Shih Tzu X","Siberian Husky","Siberian Husky X","Skye Terrier","Skye Terrier X","Spaniel","Spaniel X","St. Bernard","St. Bernard X","Staffordshire Bull Terrier","Staffordshire Bull Terrier X","Sussex Spaniel","Swedish Vallhund","Tenterfield Terrier","Tenterfield Terrier X","Terrier","Terrier X","Tibetan Mastiff","Tibetan Spaniel","Tibetan Spaniel X","Tibetan Terrier","Tibetan Terrier X","Unknown","Unknown-pleaseadvise","Water Spaniel","Weimaraner","Weimaraner X","Welsh Corgi  X (Cardigan)","Welsh Corgi (Cardigan)","Welsh Corgi (Pembroke)","Welsh Pemb Corgi X","Welsh Springer Spaniel","Welsh Terrier","West Highland Terrier","West Highland White Terrier","West Highland White Terrier X","Whippet","Whippet X","White Swiss Shepherd","Wire Hair Terrier","Wire Hair Terrier X","X Breed","Yorkshire Terrier","Yorkshire Terrier X"};
	// Dog(String name, String color, String breed, String name, String gender, String cityOrigin, int Mother, int Father)
	/*
	25702,Brown/Tan,Dobermann,RUFUS,Desexed Male,WATERLOO CORNER,0,0
	25703,Grey/Tan,Dobermann,E T,Desexed Male,WATERLOO CORNER,0,0
	26898,Blenheim,Spaniel,SAMO,Male,HILLIER,26901,26899
	26899,Blenheim,Spaniel,ANDY,Male,HILLIER,0,0
	26901,Blenheim,Spaniel,CORKY,Female,HILLIER,0,0
	26938,Black,Rottweiler,SPYDA,Desexed Female,WATERLOO CORNER,0,0
	*/
	public static void importDogsFromCSV(String filename) throws FileNotFoundException {
		int[] collectIDs = new int[3];
		String prevBreed = "Spaniel";
		String tmpBreed = "";
		String prevF = "";
		String prevM = "";
		String prevP = "";
		int breedCounter = 0;
		int prevFid = 0;
		int prevMid = 0;
		int prevPid = 0;
		String filenameOut = "Data/output.sql";
		String sqlLine = "INSERT INTO DOGS (DogID,Color,Breed,DogName,Gender,CityOrigin,MotherID,FatherID) ";
		sqlLine += " VALUES(%d,\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",%d,%d)";
		String line = "";
		String tmpString = "";
		File fh = new File(filename);
		File fhout = new File(filenameOut);
		
		Scanner myScanner = new Scanner(fh);
		myScanner.nextLine();
		
		//26899,Blenheim,Spaniel,ANDY,Male,HILLIER,0,0
		while (myScanner.hasNextLine()) {
			breedCounter++;
			System.out.println(" ---- ");
			System.out.println(" ");
			tmpString = "";
			line = myScanner.nextLine();
			String[] myArr = line.split(",");
			if (myArr[6].equals("0") && myArr[7].equals("0") ) {
				// then a potential parent
				if (prevBreed.equals(myArr[2])) {
					switch (myArr[4]) {
						
						case "Male":
							// is there a female?
							if (!(prevF.length()>1)) {
								// then we have a match
								System.out.println("Match");
								if (!(prevM.length()>1)){
									prevM = myArr[3];
									prevMid = Integer.parseInt(myArr[0]);
								} else {
									//we have an offspring
									tmpString = String.format(sqlLine, Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5],prevMid,prevFid);
									prevFid = 0;
									prevMid = 0;
									prevF ="";
									prevM ="";
									prevBreed = tmpBreed;
								}
								
							} else {
								System.out.println("Still looking for a not " + myArr[4]);
								tmpString = String.format(sqlLine, Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5],prevMid,prevFid);
							}
							break;
						case "Female":
							// is there a male?
							if (!(prevM.length()>1)) {
								// then we have a match
								System.out.println("Match");
								if (!(prevF.length()>1)) {
									prevF = myArr[3];
									prevFid = Integer.parseInt(myArr[0]);
								} else {
									//we have an offspring
									tmpString = String.format(sqlLine, Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5],prevMid,prevFid);
									prevFid = 0;
									prevMid = 0;
									prevF ="";
									prevM ="";
									prevBreed = tmpBreed;
								}
							} else {
								System.out.println("Still looking for a not " + myArr[4]);
								tmpString = String.format(sqlLine, Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5],prevMid,prevFid);
							}
							break;
						default:
							System.out.println("Not a breed pot");
							tmpString = String.format(sqlLine, Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5],prevMid,prevFid);
							break;
							
					}
				} else {
					System.out.println("No breed avail .. just  print");
					tmpBreed = myArr[2];
					tmpString = String.format(sqlLine, Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5],prevMid,prevFid);
				}
			} else {
				System.out.println("is already a  puppet with  parents");
				tmpString = String.format(sqlLine, Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5],prevMid,prevFid);
			}
			
			tmpString += ";";
			System.out.println(tmpString);
		}
		
	}
	
	
}
