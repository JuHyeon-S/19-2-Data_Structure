package week09;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree t1 = new BinaryTree();
		BinaryTree t2 = new BinaryTree();
		
		int arr1[] = {100,200,300,400,500,600,700,800};
		t1.makeBTree(arr1);
//		for (int i = 0; i < arr1.length; i++) {
//			t1.makeBTree(arr1[i]);
//		}
		System.out.println(t1.size(t1.getRoot()));
	}

}
