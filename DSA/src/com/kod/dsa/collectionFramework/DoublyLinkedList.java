package com.kod.dsa.collectionFramework;

public class DoublyLinkedList {
	class Node {
		Node pl;
		int data;
		Node nl;
	}
	Node first=null;
	
	public void insert(int elem) {
		Node n = new Node();
		n.pl=null;
		n.data=elem;
		n.nl=null;
		if(first==null) {
			first=n;
		}else if(first.nl==null) {
			first.nl=n;
			n.pl=first;
		}else {
			Node temp = first;
			while(temp.nl!=null) {
				temp=temp.nl;
			}
			temp.nl=n;
			n.pl=temp;
		}
	}
	
	public void insertFront() {
		
	}
}
