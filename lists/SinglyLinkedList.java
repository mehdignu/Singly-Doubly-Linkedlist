package lists;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import data.*;
import lists.SinglyLinkedList.Node;

public class SinglyLinkedList<T> implements Listable<T> {
	
	private Node head;
	
	class Node{
		T data;
		Node next;
	}

	@Override
	public void add(T data) {
		
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
	}
	
	@Override
	public void addFirst(T data) {
		Node n = new Node();
		n.data = data;
		n.next=head;
		head=n;
		
	}

	@Override
	public void addLast(T data) {
		Node t = head;
		Node n = new Node();
		if(t == null){
			n.data = data;
			n.next=null;
			head=n;
		}else{
		
		while(t.next != null){
			t = t.next;
		}
		
		n.data=data;
		n.next=null;
		t.next=n;
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
	public void printAll() {
		Node n = head;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
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
	public void delete(int index) {
		Node n = head;
		int p=2;
		if(index==1){
		head = n.next;	
		}else{
			
		while(p != index){
			n = n.next;
			p++;
		}
		n.next = n.next.next;
	
		}
	}

	@Override
	public void clear() {
		head=null;
	}

	
	
	

}
