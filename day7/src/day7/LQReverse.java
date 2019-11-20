package day7;

import java.util.NoSuchElementException;

public class LQReverse <E>{
	private Node<E> front,rear;
	private int size;
	public LQReverse() {
		front = rear = null;
		size = 0;
	}
	public int size() { return size; }
	public boolean isEmpty() { return size() == 0; }
	
	public void add(E newItem) {
		Node newNode = new Node(newItem, null);
		if (isEmpty()) front = newNode;
		else rear.setNext(newNode);
		rear = newNode;
		size++;
	}
	
	public E remove() {
		if (isEmpty()) throw new NoSuchElementException();
		E frontItem = front.getItem();
		front = front.getNext();
		if(isEmpty()) rear = null;
		size--;
		return frontItem;
	}
	
	public void print() {
		Node p = front;
		for (int i = 0; i < size(); i++) {
			System.out.print(p.getItem() + "\t");
			p = p.getNext();
		}
		System.out.println();
	}
	
	public void reverse() {
		ListStack<E> LS = new ListStack<E>();
		int size = size();
		for (int i = 0; i < size; i++) {
			LS.push(remove());
		}
		for (int i = 0; i < size; i++) {
			add(LS.pop());
		}		
	}
}
