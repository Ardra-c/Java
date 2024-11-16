package com.kod.dsa.string.prg;

public class revWordMethod {
	public static String revWords(String str) {
		String arr[]=str.split(" ");
		String revWord;
		String revSente="";
		for(int i=0;i<arr.length;i++) {
			revWord="";
			String word =arr[i];
			for(int j=word.length()-1;j>=0;j--) {
				revWord=revWord+word.charAt(j);
			}
			revSente=revSente+revWord+" ";
		}
		return revSente;
	}
}
