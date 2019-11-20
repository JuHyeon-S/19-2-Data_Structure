package day10;

public class BSTtest {

	public static void main(String[] args) {
		
		//1번
		BST<Integer, Integer> bst1 = new BST<Integer, Integer>();
		//2번
		int arr1[] = {60,50,70,20,10,45,25,40,30,35};
		for (int i = 0; i < arr1.length; i++) {
			bst1.put(arr1[i], arr1[i]);
		}
		//3번
		bst1.print();
		//4번
		int rst = bst1.get(45);
		System.out.println("\nSearching for 45 yields : " + rst);
		//5번
		bst1.put(45, 99);
		rst = bst1.get(45);
		System.out.println("Searching for 45 yields : " + rst);
		//6번
		rst = bst1.min();
		System.out.println("Min value : " + rst);
		//7번
		bst1.deleteMin();
		rst = bst1.min();
		System.out.println("Min value : " + rst);
		//8번
		bst1.delete(25);
		bst1.delete(35);
		bst1.delete(45);
		
		bst1.print();
	}

}
