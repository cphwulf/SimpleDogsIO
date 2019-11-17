/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledogsio;

/**
 *
 * @author thor
 */
public class Dog {
//20990,Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER
	int id;
	int motherID;
	int fatherID;
	String dogname;
	String gender;
	String color;
	String breed;
	String cityOrigin;

	public Dog(int id, String color, String breed, String dogname, String gender, String cityOrigin) {
		this.id = id;
		this.dogname = dogname;
		this.gender = gender;
		this.color = color;
		this.breed = breed;
		this.cityOrigin = cityOrigin;
	}

	public int getMotherID() {
		return motherID;
	}

	public void setMotherID(int motherID) {
		this.motherID = motherID;
	}

	public int getFatherID() {
		return fatherID;
	}

	public void setFatherID(int fatherID) {
		this.fatherID = fatherID;
	}
	

	@Override
	public String toString() {
		String msg = "";
		msg += "NAME: " + this.dogname;
		msg += " RACE: " + this.breed;
		msg += " GENDER: " + this.gender;
		msg += " COLOR: " + this.color;
		msg += " TOWN: " + this.cityOrigin;
		System.out.println(msg);

		return msg;
	}

	public String getName() {
		return this.dogname;

	}
	
}
