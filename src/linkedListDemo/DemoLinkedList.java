package linkedListDemo;

import java.util.LinkedList;


public class DemoLinkedList {
	Node head;
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}
	
	//add- first, last
	public void addFirst(String data) {
		
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode; 
	}
	
	public void delete() {
		
	}
	
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode=head;
		while(currNode !=null) {
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
		System.out.println("NULL"); 
	}
	
	public static void main(String[] args) {
		
		DemoLinkedList list=new DemoLinkedList();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		list.addLast("java");
		list.printList();
		list.addFirst("This");
		list.printList();
		list.addLast("Lecture");
		list.printList();
	}

}
