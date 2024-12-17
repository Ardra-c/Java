package com.kod.dsa.collection.set.removedups;

import java.util.Objects;

public class Student implements Comparable{
int id;
String name;
int mark;
public Student(int id, String name, int mark) {
	super();
	this.id = id;
	this.name = name;
	this.mark = mark;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
public String toString() {
	return id+" "+name+" "+mark;
}
public boolean equals(Object obj) {
	Student ref=(Student)obj;
	if(this.id==ref.id && this.name.equals(ref.name) && this.mark==ref.mark) {
		return true;
	}else {
		return false;
	}
}
public int hashCode() {
	return Objects.hash(id,name,mark);
}
public int hashMap() {
	return Objects.hash(id,name,mark);
}


@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Student ref=(Student)o;
//	if(this.mark>ref.mark) {
//		return 1;
//	}else {
//		return -1;
//	}
//	
//	if(this.id>ref.id) {
//		return 1;
//	}else {
//		return -1;
//	}
	return this.name.compareTo(ref.name);
}
}
