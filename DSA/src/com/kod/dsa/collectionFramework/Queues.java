package com.kod.dsa.collectionFramework;

public class Queues {
	private int r=-1;
	private int f=-1;
	private int size=0;
	int q[];
	
	public Queues(int size) {
		this.size=size;
		q=new int[size];
		System.out.println("Queue of size "+size+" is created");
	}
	public void insert(int elem) {
		if(r==size-1) {
			System.out.println("Insertion is not possible queue is Full!");
		}else {
			++r;
			q[r]=elem;
			System.out.println("Element "+elem+" is inseted into the queue");
		}
	}
	public void delete() {
		if(r==-1 || f==size-1) {
			System.out.println("Queue is Empty deletion is not possible!");
		}else {
			++f;
			System.out.println("Element deleted is "+q[f]);
			q[f]=0;
		}
	}
	public void display() {
		if(r==-1 || f==size-1) {
			System.out.println("Queue is empty there is nothing to display");
		}else {
			for(int i=0;i<=r;i++) {
				System.out.print(q[i]+" ");
			}
			System.out.println();
		}
	}
}
