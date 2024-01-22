package com.pages;

public class Test2 {

	public static void main(String[] args) {

		String str="My name is Shrikant Patil";
		int total=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				total++;
			}
		}
		System.out.println("Number of words == "+total);
	}

}
