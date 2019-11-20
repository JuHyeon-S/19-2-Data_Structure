package day1;

public class TestPersonAndStudent {
	public static void main(String args[]) {
		
		String name = "서주현";
		int ID = 9908;
		String dept = "컴공";
		int stuID = 20185135;
		
		PersonInfo per = new PersonInfo(name, ID);
		StudentInfo stu = new StudentInfo(name, ID, dept, stuID);
		
		System.out.println("***PersonInfo***");
		per.printPersonInfo();
		
		System.out.println("\n***StudentInfo***");
		stu.printStudentInfo();
	}
}
