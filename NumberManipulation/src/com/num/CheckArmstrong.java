package com.num;


public class CheckArmstrong {
	static boolean checkArms(int num) {
		int originalNumber=num;
		int digitcount=CheckArmstrong.digitcount(num);
		int finalNumber=0;
		
		while(num!=0) {
			int digit=num%10;
			int powres=CheckArmstrong.getPower(digit,digitcount);
			finalNumber=finalNumber+powres;
			num=num/10;
		}
		if(finalNumber==originalNumber) {
			return true;
		}else {
			return false;
		}
	}
	static int digitcount(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		return count;
	}
	static int getPower(int digit,int raisepower) {
		int res=1;
		for(int i=1;i<=raisepower;i++) {
			res=res*digit;
		}
		return res;
	}
}
