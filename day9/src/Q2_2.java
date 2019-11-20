
public class Q2_2 {
	public static void main(String []args) {
		BTreeArr2 tNew = new BTreeArr2();
		
		BTreeArr2 t1 = new BTreeArr2();
		
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
		
		System.out.println("Q2_2");
		tNew.intarr2btree(t1.btree2intarr());
		
		tNew.levelorder(tNew.getRoot());

	}	
}

