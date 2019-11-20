package day10;

public class BSTcheck <Key extends Comparable<Key>, Value>{
	public Node root;
	public Node getRoot() { return root; }
	public BSTcheck() { root = null; }
	public BSTcheck(Key newId, Value newName) {
		root = new Node(newId, newName); 
	}
	//get
	public Value get(Key k) { return get(root, k); }
	public Value get(Node n, Key k) {
		if(n == null) return null;
		int t = n.getKey().compareTo(k);
		if(t > 0) return get(n.getLeft(), k);
		else if (t < 0) return get(n.getRight(), k);
		else return (Value) n.getValue();
	}
	//put
	public void put(Key k, Value v) { root = put(root, k, v); }
	public Node put(Node n, Key k, Value v) {
		if(n == null) return new Node(k, v);
		int t = n.getKey().compareTo(k);
		if(t > 0) n.setLeft(put(n.getLeft(), k, v));
		else if (t < 0) n.setRight(put(n.getRight(), k, v));
		else n.setValue(v);
		return n;
	}
	//min
	public Key min() {
		if(root == null) return null;
		return (Key) min(root).getKey();
	}
	
	private Node min(Node n) {
		if(n.getLeft() == null) return n;
		return min(n.getLeft());
	}
	//deleteMin
	public void deleteMin() {
		if(root == null) System.out.println("empty Ʈ��");
		else root = deleteMin(root);
	}
	private Node deleteMin(Node n) {
		if(n.getLeft() == null) return n.getRight();
		n.setLeft(deleteMin(n.getLeft()));
		return n;
	
	}
	//delete
	public void delete(Key k) { root = delete(root, k); }
	public Node delete(Node n, Key k) {
		if (n == null) return null;
		int t = n.getKey().compareTo(k);
		if (t > 0) n.setLeft(delete(n.getLeft(), k));
		else if (t < 0) n.setRight(delete(n.getRight(), k));
		else {
			if (n.getRight() == null) return n.getLeft();
			if (n.getLeft() == null) return n.getRight();
			Node target = n;
			n = min(target.getRight());
			n.setRight(deleteMin(target.getRight()));
			n.setLeft(target.getLeft());
		}
		return n;
	}
	//print
	public void print() { print(root); }
	public void print(Node n) {
		if(n != null) {
			print(n.getLeft());
			System.out.print(n.getKey() + " ");
			print(n.getRight());
		}
	}
	//setRoot
	public void setRoot(Node n) {
		root = n;
	}
	//checkBST
	public boolean checkBST() {
		boolean ch = true;
		Node n = root;
		ch = checkBST(n, ch);
		return ch;
	}
	public boolean checkBST(Node n, boolean ch) {
		if (ch == false) return ch;
		if (n.getKey() != null) {
			if(n.getRight() == null || n.getLeft() == null) {
				return ch;
			}
			else if(((int)n.getLeft().getKey() < (int)n.getKey()) && ((int)n.getRight().getKey() > (int)n.getKey())) {
				ch = checkBST(n.getLeft(), ch);
				if (ch == false) return ch;
				ch = checkBST(n.getRight(),ch);
				if (ch == false) return ch;
			}
			else ch = false;
		}
		return ch;
	}
}