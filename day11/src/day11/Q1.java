package day11;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearProbing<Integer, String> l1 = new LinearProbing<Integer, String>();
		
		int [] key = {25,37,18,55,22,35,50,63};
		String [] data = {
				"grape","apple","banana","cherry",
				"mango","lime","orange","watermelon" };
		
		for (int i = 0; i < key.length; i++) {
			l1.put(key[i], data[i]);	
		}
		
		System.out.println("Ž�� ��� :");
		System.out.println("50�� data = "+ l1.get(50));
		System.out.println("63�� data = "+ l1.get(63));
		
		System.out.println("\n�ؽ� ���̺� : ");
		l1.print();
	}

}