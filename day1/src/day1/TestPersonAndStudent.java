package day1;

public class TestPersonAndStudent {
	public static void main(String args[]) {
		
		String name = "������";
		int ID = 9908;
		String dept = "�İ�";
		int stuID = 20185135;
		
		PersonInfo per = new PersonInfo(name, ID);
		StudentInfo stu = new StudentInfo(name, ID, dept, stuID);
		
		System.out.println("***PersonInfo***");
		per.printPersonInfo();
		
		System.out.println("\n***StudentInfo***");
		stu.printStudentInfo();
	}
}
