package day5;

public class DListAddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DListAdd <Integer> dl1 = new DListAdd<Integer>();
		dl1.insertAfter(dl1.head, 1);
		dl1.insertBefore(dl1.tail, 2); 
		dl1.insertBefore(dl1.tail, 3);
		System.out.print("[dl1 리스트] ");
		dl1.print();
		
		
		DListAdd <Integer> dl2 = new DListAdd<Integer>();
		dl2.insertAfter(dl2.head, 6);
		dl2.insertBefore(dl2.tail, 7); 
		dl2.insertBefore(dl2.tail, 8);
		dl2.insertBefore(dl2.tail, 9);
		
		System.out.print("[dl2 리스트] ");
		dl2.print();
		
		int add1 = dl2.add(dl1);
		int add2 = dl1.add(dl2);
		
		System.out.println("add1 : "+ add1 + " / add2 : "+add2);
	}

}
