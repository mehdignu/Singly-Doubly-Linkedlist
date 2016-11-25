package lists;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import data.*;
import lists.SinglyLinkedList.Node;
public class DoublyLinkedList<T> implements Listable<T> {

	private Node head;
	private Node tail;
	
	private class Node{
		T data;
		Node next;
		Node prev;
	}
	
	@Override
	public void add(T data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = null;

		if (head == null) {
			head = newNode;
			tail = null;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			temp.prev = temp;
		}
		
	}

	@Override
	public void delete(int index) {
		Node n = head;
		int p=2;
		if(index==1){
		head = n.next;
		n.prev = null;
		}else{
			
		while(p != index){
			n = n.next;
			p++;
		}
		n.next = n.next.next;
		n.prev.prev = n.next;
	
		}
		
		
	}

	

	@Override
	public T get(int index) {
		int p=1;
		Node n = head;
		if(index == 1){
			return n.data;
		}else{
			
		
		while(n.next != null && p != index){
			n = n.next; p++;
		}
		}
		return n.data;
	}
	

	

	@Override
	public void clear() {
		head=null;
		
	}

	@Override
	public int getSize() {
		int p=0;
		Node t = head;
		while(t != null){
			t = t.next;
			p++;
		}
		return p;
	}

	@Override
	public void printAll() {
		Node n = head;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
		
	}

	@Override
	public void addFirst(T data) {
		Node n = new Node();
		n.data = data;
		n.next=head;
		n.prev = null;
		head=n;
		head.prev = n;
		
	}

	@Override
	public void addLast(T data) {
		Node t = head;
		Node n = new Node();
		if(t == null){
			n.data = data;
			n.next=null;
			n.prev = null;
			head=n;
		}else{
		
		while(t.next != null){
			t = t.next;
		}
		n.data=data;
		n.next=null;
		n.prev = t;
		t.next=n;
		}
		
	}


	

}
