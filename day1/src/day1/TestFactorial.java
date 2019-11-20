package day1;

import java.util.Scanner;

public class TestFactorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*재귀함수 사용 버전");
		
		System.out.print("1)숫자를 입력하세요 : ");
		int num = scan.nextInt();

		System.out.println("\t"+num+"!은 "+FactorialRecursive.fac1(num)+"입니다.\n");
		
		System.out.println("*while문 사용 버전");
		
		System.out.print("2)숫자를 입력하세요 : ");
		num = scan.nextInt();
		
		System.out.println("\t"+num+"!은 "+FactorialLoop.fac2(num)+"입니다.");
	}

}
