package day10;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTcheck<Integer,Integer> bst4 = new BSTcheck<Integer,Integer>(); 
		
		Node n1 = new Node(50,50);
		n1.setLeft(new Node(25,25));
		n1.getLeft().setLeft(new Node(10,10));
		n1.getLeft().setRight(new Node(30,30));
		n1.setRight(new Node(75,75));
		n1.getRight().setLeft(new Node(60,60));
		n1.getRight().setRight(new Node(80,80));
		
		bst4.setRoot(n1);
		bst4.print();
		System.out.println();
		System.out.println(bst4.checkBST());
		
		BSTcheck<Integer,Integer> bst5 = new BSTcheck<Integer,Integer>();
		
		Node n2 = new Node(50,50);
		n2.setLeft(new Node(25,25));
		n2.getLeft().setLeft(new Node(10,10));
		n2.getLeft().setRight(new Node(30,30));
		n2.setRight(new Node(75,75));
		n2.getRight().setLeft(new Node(80,80));
		n2.getRight().setRight(new Node(60,60));
		
		bst5.setRoot(n2);
		bst5.print();
		System.out.println();
		System.out.println(bst5.checkBST());
		
	}

}
