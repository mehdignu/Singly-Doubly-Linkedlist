package lists;

public class SinglyLinkedList<T> implements Listable<T> {

	private Node head;
	
	private class Node{
		T data;
		Node next;
	}
	
	@Override
	public void add(T data) {
		Node n = new Node();
		n.data = data;
		n.next = null;
		
		if(head == null){
			head = n;
		}else{
			Node t = head;
			while(t.next != null){
				t = t.next;
			}
			t.next = n;
		}
		
	}
	
	




	@Override
	public void delete(int index) {
		Node n = head;
		int p=0;
		while(p != index-1){
			n = n.next;
			p++;
		}
		n.next = n.next.next;
		
	}

	@Override
	public void insertAt(int index, T data) {
		int p=0;
		Node k = new Node();
		k.data = data;
		Node n = head;
		while(n.next != null ){
			if(p==index-1){
			k.next = n.next;
	        n.next = k;
	      }
	      n = n.next;
	      p++;
		}
		
		
	}

	@Override
	public T get(int index) {
		int p=0;
		Node n = head;
		while(n.next != null && p != index){
			n = n.next; p++;
		}
		return n.data;
	}

	@Override
	public boolean isEmpty() {
		return (head==null);
	}

	@Override
	public void clear() {
		head=null;
		
	}

	@Override
	public int getSize() {
		int p=0;
		Node t = head;
		while(t.next != null){
			t = t.next;
			p++;
		}
		return p;
	}

	@Override
	public void printAll() {
		System.out.println(this.getClass().getSimpleName());
		Node  t = head;
		while(t != null){
			System.out.println(t.data);
			t = t.next;
		}
		
	}

}
