package day1;

import java.util.Scanner;

public class TestFactorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*����Լ� ��� ����");
		
		System.out.print("1)���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();

		System.out.println("\t"+num+"!�� "+FactorialRecursive.fac1(num)+"�Դϴ�.\n");
		
		System.out.println("*while�� ��� ����");
		
		System.out.print("2)���ڸ� �Է��ϼ��� : ");
		num = scan.nextInt();
		
		System.out.println("\t"+num+"!�� "+FactorialLoop.fac2(num)+"�Դϴ�.");
	}

}
