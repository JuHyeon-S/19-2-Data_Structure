
public class Q2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTreeArr t1 = new BTreeArr();
			
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
		
		int arr[] = t1.btree2intarr();
		System.out.println("Q2_1");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
