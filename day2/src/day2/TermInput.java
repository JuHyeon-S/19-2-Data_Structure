package day2;
import java.util.*;

class TermInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input;
		
		System.out.print("������ �Է��ϼ��� : ");
		input = scan.nextInt();
		
		Integer(input);
	}
	
	public static void Integer(int input) {
		int []num = new int[100];
		int i = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		
		for(i = 0; i < 100; i++) {
			num[i] = i+1;
		}
		
		int rst = 0;
		for (x = 0; x < 100; x++) {
			for (y = 0; y < 100; y++) {
				if (x == y) continue;
				for (z = 0; z < 100; z++) {
					if (y == z || x == z) continue;
					if ((num[x] + num[y]+num[z]) == input) {
						rst = 1;
						break;
					}
				}
				if (rst == 1) break;
			}
			if (rst == 1) break;
		}
		if (rst == 1) {
			System.out.println(input+"�� ("+num[x]+","+num[y]+","+num[z]+") ���� ������ �ֽ��ϴ�.");
		}
		else {
			System.out.println(input+"�� �ش��ϴ� ������ �����ϴ�.");
		}
	}
}