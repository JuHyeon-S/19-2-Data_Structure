package day1;

public class FactorialLoop {

	public static int fac2(int num) {
		// TODO Auto-generated method stub
		int rst = 1;
		
		while (num != 1) {
			rst = rst * num;
			num -= 1;
		}
		
		return rst;
	}

}
