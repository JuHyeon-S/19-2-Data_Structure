package day5;
import java.util.NoSuchElementException;

public class CList <E> {
	private Node last;
	private int size;
	public CList() {
		last = null;
		size = 0;
	}
	
	public void insert(E newItem) {
		Node newNode = new Node(newItem, null);
		if (last == null) {
			newNode.setNext(newNode);
			last = newNode;
		}
		else {
			newNode.setNext(last.getNext());
			last.setNext(newNode);
		}
		size++;
	}
	public int isEmpty() {
		Node p = last;
		if (p.getItem() == null) {
			return 0;
		}
		else {
			return 1;
		}
	}
	public Node delete() {
		if (isEmpty() == 0) throw new NoSuchElementException();
		Node x = last.getNext();
		if (x == last) last = null;
		else {
			last.setNext(x.getNext());
			x.setNext(null);
		}
		size--;
		return x;
	}
	
	public void print() {
		Node p = last;
		p = p.getNext();
		if (p.getItem()==null) {
			System.out.println("����Ʈ �������");
		}
		for (int i = 0; i < size; i++) {
			System.out.print(p.getItem() + "\t");
			p = p.getNext();
		}
	}
	public int size() {
		return size;
	}
}