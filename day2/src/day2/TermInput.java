package day2;
import java.util.*;

class TermInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input;
		
		System.out.print("정수를 입력하세요 : ");
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
			System.out.println(input+"은 ("+num[x]+","+num[y]+","+num[z]+") 으로 조합이 있습니다.");
		}
		else {
			System.out.println(input+"에 해당하는 조합이 없습니다.");
		}
	}
}