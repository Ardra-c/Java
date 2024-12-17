package com.kod.dsa.collection.set.removedups;

import java.util.Objects;

public class Product {
			int id;
			String name;
			int price;
			public Product(int id, String name, int price) {
				super();
				this.id = id;
				this.name = name;
				this.price = price;
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
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			
			public String toString() {
				return id+" "+name+" "+price;
			}
			
			public boolean equals(Object obj) {
				Product ref=(Product)obj;
				if(this.id==ref.id && this.name.equals(name) && this.price==ref.price) {
					return true;
				}else {
					return false;
				}
			}
			
			public int hashCode() {
				return Objects.hash(id,name,price);
			}
			
}