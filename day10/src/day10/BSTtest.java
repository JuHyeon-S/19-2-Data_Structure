package day10;

public class BSTtest {

	public static void main(String[] args) {
		
		//1��
		BST<Integer, Integer> bst1 = new BST<Integer, Integer>();
		//2��
		int arr1[] = {60,50,70,20,10,45,25,40,30,35};
		for (int i = 0; i < arr1.length; i++) {
			bst1.put(arr1[i], arr1[i]);
		}
		//3��
		bst1.print();
		//4��
		int rst = bst1.get(45);
		System.out.println("\nSearching for 45 yields : " + rst);
		//5��
		bst1.put(45, 99);
		rst = bst1.get(45);
		System.out.println("Searching for 45 yields : " + rst);
		//6��
		rst = bst1.min();
		System.out.println("Min value : " + rst);
		//7��
		bst1.deleteMin();
		rst = bst1.min();
		System.out.println("Min value : " + rst);
		//8��
		bst1.delete(25);
		bst1.delete(35);
		bst1.delete(45);
		
		bst1.print();
	}

}
