package day10;

public class Q2 {

	public static void main(String[] args) {
		BSTdelMax<Integer, Integer> bst2 = new BSTdelMax<Integer, Integer>();
		
		int arr1[] = {60,50,70,20,10,45,25,40,30,35};
		for (int i = 0; i < arr1.length; i++) {
		bst2.put(arr1[i], arr1[i]);
		}
		bst2.print();
		
		for(int i = 0; i < 3; i++) {
			System.out.print("\n>deleteMax " + (i+1) + "¹ø È£Ãâ  >> ");
			bst2.deleteMax();
			bst2.print();
		}
	}

}
