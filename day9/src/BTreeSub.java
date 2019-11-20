import java.util.LinkedList;
import java.util.Queue;

public class BTreeSub <Key extends Comparable<Key>>{
	private Node root;
	public BTreeSub() { root = null; }
	public Node getRoot() { return root; }
	public void setRoot(Node newRoot) { root = newRoot; }
	public boolean isEmpty() { return root == null; }
	
	public void preorder(Node n) {
		if (n != null) {
			System.out.print(n.getKey() + " ");
			preorder(n.getLeft());
			preorder(n.getRight());
		}
	}
	
	public void inorder(Node n) {
		if (n != null) {
			inorder(n.getLeft());
			System.out.print(n.getKey() + " ");
			inorder(n.getRight());
		}
	}
	
	public void postorder(Node n) {
		if (n != null) {
			postorder(n.getLeft());
			postorder(n.getRight());
			System.out.print(n.getKey() + " ");
		}
	}
	
	public void levelorder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		Node t;
		q.add(root);
		while (!q.isEmpty()) {
			t = q.remove();
			System.out.print(t.getKey() + " ");
			if (t.getLeft() != null)
				q.add(t.getLeft());
			if (t.getRight() != null)
				q.add(t.getRight());
		}
	}
	
	public int height(Node n) {
		if (n == null)
			return 0;
		else
			return (1+ Math.max(height(n.getLeft()), height(n.getRight())));
	}
	
	public int size(Node n) {
		if (n == null)
			return 0;
		else 
			return (1 + size(n.getLeft()) + size(n.getRight()));
	}
	
	public static boolean isEqual(Node n, Node m) {
		if (n == null || m == null)
			return n == m;
		if (n.getKey().compareTo(m.getKey()) != 0)
			return false;
		return (isEqual(n.getLeft(),m.getLeft()) &&
				isEqual(n.getRight(),m.getRight()));
	}
	
	public void intarr2btree(int []arr) {
		if (getRoot() != null) {
			root = null;
		}
		Node n[] = new Node[arr.length];
		for (int i = 0; i < arr.length; i++) {
			n[i] = new Node(arr[i],null,null); 
		}
		int j = 1;
		for (int i = 0; i< arr.length/2;i++) {
			n[i].setLeft(n[j++]);
			n[i].setRight(n[j++]);
		}
		setRoot(n[0]);
	}

	
	public LinkedList<Node> subTreeCompare(BTreeSub t){
		Node r = getRoot();
		
		LinkedList<Node> list = new LinkedList<Node>();
		boolean ch1 = false;
		boolean ch2 = false;
		for (int i = 0; i < t.size(t.getRoot());i++){
			if (i/2 == 3 && ch2 == false) {
				i = (i/2);
				ch2 = true;
			}
			if (r.getKey().compareTo(t.getRoot().getKey()) == 0) {
				if (r.getLeft().getKey()==t.getRoot().getLeft().getKey()) {
					if(r.getRight().getKey()==t.getRoot().getRight().getKey()) {
						list.add(r);
					}
				}
			}
			if (r.getRight() == null && t.getRoot().getRight() == null && ch1 == false) {
				i = 3;
				r = getRoot().getRight();
				t.setRoot(t.getRoot().getRight());
				ch1 = true;
				continue;
			}
			if (ch1 == true) {
				r = r.getRight();
				t.setRoot(t.getRoot().getRight());
			}
			else {
				r = r.getLeft();
				t.setRoot(t.getRoot().getLeft());
			}
			
		}
		return list;
		
	}
}