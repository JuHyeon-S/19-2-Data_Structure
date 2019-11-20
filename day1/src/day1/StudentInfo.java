package day1;

public class StudentInfo extends PersonInfo{
	String deptName;
	int stuID;
	
	StudentInfo(String name,int ID,String deptName, int stuID){
		super(name,ID);
		this.deptName = deptName;
		this.stuID = stuID;
	}
	
	void printStudentInfo() {
		super.printPersonInfo();
		System.out.println("deptName : "+ this.deptName +"\nstuID : "+this.stuID);
	}
}
