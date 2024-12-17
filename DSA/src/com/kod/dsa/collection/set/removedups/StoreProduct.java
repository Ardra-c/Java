package com.kod.dsa.collection.set.removedups;

import java.util.LinkedHashSet;

public class StoreProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet  lhs=new LinkedHashSet();
		lhs.add(new Product(120,"Redtap-shoe",3500));
		lhs.add(new Product(125,"Levis-shoe",3000));
		lhs.add(new Product(145,"GUCCHI-shoe",10000));
		lhs.add(new Product(145,"GUCCHI-shoe",10000));
		lhs.add(new Product(125,"Levis-shoe",3000));
		System.out.println(lhs);
	}

}
