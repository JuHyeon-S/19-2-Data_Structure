package day5;

public class SListOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SListOrder<Integer> slist1 = new SListOrder<Integer>();
		int a[] = {7,11,4,1,8};
		slist1.setAndOrderNodes(a);
		System.out.println();
		slist1.print();
		
		SListOrder<Integer> slist2 = new SListOrder<Integer>();
		int b[] = {5,2,8,7,13};
		slist1.setAndOrderNodes(b);
		System.out.println();
		slist1.print();
		
		slist1.join(slist2);
	}

}