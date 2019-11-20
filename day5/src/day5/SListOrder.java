package day5;

import java.util.NoSuchElementException;

public class SListOrder<E> {
	protected Node head;
	private int size;

	public SListOrder() {
		head = null;
		size = 0;
	}

	public int search(E target) {
		Node p = head;
		for (int k = 0; k < size; k++) {
			if (target == p.getItem()) return k;
			p = p.getNext();
		}
		return -1;
	}
	
	public void insertFront(E newItem) {
		head = new Node(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, Node p) {
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}
	
	public void deleteFront() {
		if (size == 0) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	
	public void deleteAfter(Node p) {
		if (p == null) throw new NoSuchElementException();
		Node t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}
	
	public void print() {
		Node p = head;
		for (int i = 0; i < size; i++) {
			System.out.print(p.getItem() + "\t");
			p = p.getNext();
		}
	}
	
	public int size() {
		return size;
	}
	
	public void setAndOrderNodes(int[] arr) {
		if (arr != null) {
			while(size != 0) {
				deleteFront();
			}
		}
		int i = 0;
		
		Node p = head;
		/*
		Node p = new Node((E)(Object)arr[i++],head);
		p.setNext(p.getNext());*/

		//Node q = head;
		

		for (i = 0; i < arr.length;i++) {
			if (p == null) {
				p = new Node((E)(Object)arr[i],head);
			}
			else if ((int)p.getItem() >= arr[i]) {
				insertFront((E)(Object)arr[i]);
			}
			else {
				insertAfter((E)(Object)arr[i], p);
			}
			//System.out.println(size);
		}
	}
	
	public void join(SListOrder slist2) {
		int count = size()+slist2.size(); 
		int all[] = new int[count];
		
		Node p = slist2.head;
		p = p.getNext();
		
		Node q = head;
		q = q.getNext();
		
		for (int i = 0; i < count; i++) {
			if (i < size()) {
				all[i] = (int)q.getItem();
				q = q.getNext();
			}
			else {
				all[i] = (int)p.getItem();
				p = p.getNext();				
			}
		}
		
		setAndOrderNodes(all);
		print();
	}
}
