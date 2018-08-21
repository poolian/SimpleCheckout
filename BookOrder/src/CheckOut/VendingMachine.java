package com.XXX.test;

public class VendingMachine {

	public static void main(String[] args) {
		
		int money = 10000;
		int price = 4320;
		int change = money-price;

		int [] temps= {5000,1000,500,100,50,10};
		int tempv=0;
		
		for(int temp:temps ) {
			tempv=change/temp;
			change%=temp;
			System.out.println(temp+" : "+tempv);
		}
	}
}
