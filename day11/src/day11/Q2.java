package day11;

public class Q2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearProbing2<Integer, Integer> l2 = new LinearProbing2<Integer, Integer>();
		
		int [] key = {25,37,18,55,22,35,50,63};

		for (int i = 0; i < key.length; i++) {
			l2.put(key[i], key[i]);	
		}
		
		System.out.println("\n해시 테이블 : ");
		l2.print();
		
		System.out.println("\n탐색 결과 :");
		System.out.println("63의 data = "+ l2.get(63));
		
		l2.delete(50);
		
		System.out.println("50 삭제");
		
		System.out.println("\n해시 테이블 : ");
		l2.print();
		
		System.out.println("\n\n63의 data = "+ l2.get(63));
	}
}
