
public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree t1 = new BinaryTree();
		BinaryTree t2 = new BinaryTree();
		
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
		
		t1.setRoot(n1);
		t2.setRoot(n1);
		
		System.out.println("트리 노드 수  = " + t1.size(t1.getRoot()));
		
		System.out.println("트리높이 = " + t1.height(t1.getRoot()));
		System.out.print("전위순회 : ");
		t1.preorder(t1.getRoot());
		System.out.print("\n중위순회 : ");
		t1.inorder(t1.getRoot());
		System.out.print("\n후위순회 : ");
		t1.postorder(t1.getRoot());
		System.out.print("\n레벨순회 : ");
		t1.levelorder(t1.getRoot());
		
		System.out.print("\n동일성 검사 : " +t1.isEqual(t1.getRoot(), t2.getRoot()));
		
	}

}
