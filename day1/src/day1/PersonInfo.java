package day1;

public class PersonInfo {
	String name;
	int ID;
	
	PersonInfo(String name, int ID){
		this.name = name;
		this.ID = ID;
	}
	
	void printPersonInfo() {
		System.out.println("name : "+ this.name +"\nID : "+this.ID);
	}
}
