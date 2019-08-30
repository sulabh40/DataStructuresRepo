package com.LinkedListDS;

public class LinkedListImpl {

	public Node head;

	public void insert(int data) {
		Node node= new Node();
		node.data=data;
		node.next = null;

		if(head==null) {
			head =node;
		}else {
			Node n= head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next= node;
			
		}

	}
	
	public void show() {
		
		Node n= head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}


	public class Node{
		int data;
		Node next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImpl list= new LinkedListImpl();
		list.insert(10);
		list.insert(20);
		list.insert(45);
		
		list.show();
	}

}
