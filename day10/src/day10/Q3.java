package day10;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTsmall<Integer, Integer> bst3 = new BSTsmall<Integer, Integer>();
		
		int arr1[] = {60,50,70,20,10,45,25,40,30,35};
		for (int i = 0; i < arr1.length; i++) {
		bst3.put(arr1[i], arr1[i]);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(bst3.kthSmallest(i) + "\t");
		}
	}

}
