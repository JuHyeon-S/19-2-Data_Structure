package day5;

import java.util.NoSuchElementException;

public class CListRotate <E>{
	private Node last;
	private int size;
	public CListRotate() {
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
			System.out.println("리스트 비어있음");
		}
		for (int i = 0; i < size; i++) {
			System.out.print(p.getItem() + "\t");
			p = p.getNext();
		}
	}
	public int size() {
		return size;
	}
	
	public void rotateLeft(int n) {
		Node p = last;
		Node q = last.getNext();
		Node v = new Node(q.getItem(),null);
		System.out.println(size);
		
		for (int i = 0; i < n*size ; i++) {
			q = q.getNext();
			p = p.getNext();
			System.out.print(p.getItem()+" " + q.getItem() + " ");
			
			p.setItem(q.getItem());
			p.setNext(q.getNext());
			System.out.println(p.getItem() + " " + q.getItem());
			
		}

	}
	
	public void rotateRight(int n) {
		if (n == 0) return;
		
		Node p = last;
		
		int i = 1;
		
		while(i < n) {
			p = p.getNext();
			i++;
			System.out.println(p.getItem());
		}
		
		Node q = p;
		
		while(p.getNext() != null) {
			p = p.getNext();
		}
		p.setNext(last);
		
		last = q.getNext();
		
	}
}
