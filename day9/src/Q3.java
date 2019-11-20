import java.util.LinkedList;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTreeSub tA = new BTreeSub();
		BTreeSub tB = new BTreeSub();
		
		Node n1 = new Node(100,null,null);
		Node n2 = new Node(200,null,null);
		Node n3 = new Node(300,null,null);
		Node n4 = new Node(400,null,null);
		Node n5 = new Node(500,null,null);
		Node n6 = new Node(600,null,null);
		Node n7 = new Node(700,null,null);
		Node n8 = new Node(800,null,null);
		
		n1.setLeft(n2);
		n1.setRight(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n3.setLeft(n6);
		n3.setRight(n7);
		n4.setLeft(n8);
		
		tA.setRoot(n1);
		
		int arr2[] = {1,2,3,300,7,9,70,600,700};
		tB.intarr2btree(arr2);
		
		LinkedList list = tA.subTreeCompare(tB);
		
		BTreeSub sb[] = new BTreeSub[list.size()];
		
		for (int i = 0; i < list.size();i++) {
			sb[i].setRoot((Node)list.getFirst());
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Found a matching subtree " + i);
			System.out.print(sb[i].getRoot().getKey() + " ");
			System.out.print(sb[i].getRoot().getLeft().getKey() + " ");
			System.out.print(sb[i].getRoot().getRight().getKey() + " ");
		}
	}

}
