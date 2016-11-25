package main;
import data.*;
import lists.*;
public class main {

	public static void main(String[] args) {
		Student s1 = new Student("mehdi", "Dridi", 25, 1);
		Student s2 = new Student("Donald", "bock", 26, 0);
		Student s3 = new Student("micky", "mouse", 27, 1);
		Student s4 = new Student("yoo", "hoo", 27, 1);
		
		
		Listable<Student> list = new SinglyLinkedList<Student>();
		list.add(s1);
		list.add(s2);
		//list.add(s3);
		list.delete(1);
		
		System.out.println(list.getSize());
		list.printAll();
	}

}
