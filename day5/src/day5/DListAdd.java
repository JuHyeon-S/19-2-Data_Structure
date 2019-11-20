package day5;

import java.util.NoSuchElementException;

public class DListAdd<E> {
	protected DNode head, tail;
	protected int size;
	public DListAdd() {
		head = new DNode (null, null, null);
		tail = new DNode (null, head, null);
		head.setNext(tail);
		size = 0;
	}
	
	public void insertBefore(DNode p, E newItem) {
		DNode t = p.getPrevious();
		DNode newNode = new DNode(newItem, t, p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}
	
	public void insertAfter(DNode p, E newItem) {
		DNode t = p.getNext();
		DNode newNode = new DNode(newItem, p, t);
		
		t.setPrevious(newNode);
		p.setNext(newNode);
		size++;
	}
	
	public void delete(DNode x) {
		if(x == null) throw new NoSuchElementException();
		if(size <= 0) throw new NoSuchElementException();
		DNode f = x.getPrevious();
		DNode r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
	}
	
	public void print() {
		DNode p = head;
		p = p.getNext();
		int n;
		int rst = 0;
		if (p.getItem()==null) {
			System.out.println("리스트 비어있음");
		}
		for (int i = size; i > 0;i--) {
			n = (int) Math.pow(10,i-1);
			rst += n*(int)p.getItem();
			p = p.getNext();
		}
		System.out.println(rst);
	}

	public int add(DListAdd dl) {
		DNode p = head;
		p = p.getNext();
		DNode q = dl.head;
		q = q.getNext();
		int n,rst;
		int sum = 0;
		int i = size;
		int j = dl.size;
		
		while(p != null && dl != null){
			rst = 0;
			if (i == j) {
				n = (int) Math.pow(10, i - 1);
				rst = n * (int) q.getItem() + n * (int) p.getItem();
				q = q.getNext();
				p = p.getNext();
				i--;
				j--;
			} else if (i > j) {
				n = (int) Math.pow(10, i - 1);
				rst = n * (int) p.getItem();
				p = p.getNext();
				i--;
			} else {
				n = (int) Math.pow(10, j - 1);
				rst = n * (int) q.getItem();
				q = q.getNext();
				j--;
			}
			sum += rst;
			if ((i == 0) && (j == 0)) {
				break;
			}
		}
		return sum;
	}
}
