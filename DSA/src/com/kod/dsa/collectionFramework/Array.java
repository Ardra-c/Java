package com.kod.dsa.collectionFramework;


public class Array {
	private int arr[];
	private int size;
	public Array(int size) {
		this.size=size;
		arr=new int[size];
	}
	public void insert(int pos,int element) {
		if(pos>=0 && pos<arr.length-1) {
			arr[pos]=element;
			System.out.println("Elemented inserted at position "+pos+" is "+arr[pos]);
		}else {
			System.out.println("You are surpassing array index,Give index between 0 and"+(size-1));
		}
	}
	public void delete(int pos) {
		arr[pos]=0;
	}
	public void display() {
		for(int i:arr) {
			System.out.println(i+" ");
		}
	}
	public int get(int index) {
		if(index>=0 && index<arr.length) {
		return arr[index];
		}else {
			return -1;
		}
	}
}
