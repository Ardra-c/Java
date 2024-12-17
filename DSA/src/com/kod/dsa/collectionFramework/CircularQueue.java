package com.kod.dsa.collectionFramework;

public class CircularQueue {
	private int r=-1;
	private int f=-1;
	private int size=0;
			int q[];
			
			public CircularQueue(int size) {
				this.size=size;
				q=new int[size];
				System.out.println("Queue of size "+ size+ " is created");
			}
			public void insert(int elem) {
				if((r+1)%size==f) {
					System.out.println("Queue is full insertion is not possible!");
				}else {
					if(f==-1){
						f=0;
					}
					r=(r+1)%size;
					q[r]=elem;
					System.out.println("Element "+elem+" is inserted into queue");
				}
			}
			public void delete() {
				if(f==-1) {
					System.out.println("Queue is empty deletion is not possible");
				}else {
					System.out.println("Element deleted is "+q[f]);
					if(f==r) {
					f=r=-1;
					}else {
						f=(f+1)%size;
					}
				}
			}
			public void display() {
				if(f==-1) {
					System.out.println("There is nothing to display queue is empty");
				}else {
					int i=f;
					while(true) {
						System.out.print(q[i]+" ");
						if(i==r) break;
						i=(i+1)%size;
					}
					System.out.println();
				}
			}
}
