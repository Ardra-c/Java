package com.kod.dsa.collectionFramework;

public class Stacks {
	private int s[];
	private int size;
	private int top=-1;
	
	public Stacks(int size) {
		this.size=size;
		s=new int[size];
		System.out.println("Stack of size "+size+" is created");
	}
	
	public void push(int elem) {
		if (top == (size-1)) {
			System.out.println("Stack is full push not possible");
		}else {
			++top;
			s[top]=elem;
			System.out.println("Element "+elem+"pushed on to the stack");
		}
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty pop not possible");
		}else {
			System.out.println("Element deleted is "+s[top]);
			s[top]=0;
			--top;
		}
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else {
			for(int i=top;i>=0;i--) {
				System.out.println(s[i]);
			}
		}
	}
}
