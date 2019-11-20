package day5;

public class SListReverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SListReverse<Integer> sl = new SListReverse<Integer>();
		
		for(int i = 1;i <= 5;i++) {
			sl.insertFront(i);	
		}
		System.out.print("[SList sl 리스트] ");
		sl.print();
		
		System.out.println();
		
		sl.reverse();
		System.out.print("[sl.reverse() 결과] ");
		sl.print();
		
	}

}
