package day7;

public class LQReverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LQReverse<Character> lq1 = new LQReverse<Character>();
		
		char []str = {'A','B','C','D','E'};
		for (int i = 0; i < str.length; i++) {
			lq1.add(str[i]);
		}
		lq1.print();
		lq1.reverse();
		lq1.print();
		
		LQReverse<Integer> lq2 = new LQReverse<Integer>();
		
		int []arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			lq2.add(arr[i]);
		}
		lq2.print();
		lq2.reverse();
		lq2.print();
	}

}
