package com.xworkz.mall.configuration;

import java.util.Base64;

public class decr {

	public static void main(String[] args) {

//		String ref = "name";
//		String dec = "name";
//		String ref1 = "name";
//		byte[] decode = Base64.getDecoder().decode(dec.getBytes());
//		byte[] encodes = Base64.getEncoder().encode(ref.getBytes());
//		byte[] encodes1 = Base64.getEncoder().encode(ref1.getBytes());
//		System.out.println(encodes1.toString());
//		System.out.println(encodes.toString());
//		System.out.println(decode.toString());

//		int num = 12391, s = 0, z;
//
//		while (num > 0) {
//			z = num % 10;
//			z++;
//
//			s = s * 10 + z;
//			num = num / 10;
//		}
//
//		System.out.println(s);
//		System.out.println("*&^%$%^&");
//
//		num = s;
//		s = 10;
//		while (num > 0) {
//			z = num % 10;
//			s = s * 10 + z;
//			num = num / 10;
//		}
//
//		System.out.println(s);

		String k = "RRR ";
		String g = "KGF ";
		String h = " ";

		for (int i = 0; i < 6; ++i) {
			for (int j = i; j <= i; ++j) {
				if (i % 2 == 0) {
					h = h + k;
				} else {
					h = h + g;
				}
				System.out.println(h);
			}
		}
		
		String [] ref = {"RED","BLUE","GREEN"};
		char[] charArray = ref[0].toCharArray();
		char[] charArray2 = ref[1].toCharArray();
		char[] charArray3 = ref[2].toCharArray();
		
		for(int i=0;i<ref.length;i++) {

				if(i==0) {
					System.out.print(ref[0].charAt(i));
					System.out.print(ref[1].charAt(i));
					System.out.print(ref[2].charAt(i));
					
				}
				System.out.println("");
		}
		for(int i=1;i<ref.length;i++) {

			if(i==1) {
				System.out.print(ref[0].charAt(i));
				System.out.print(ref[1].charAt(i));
				System.out.print(ref[2].charAt(i));
			}
			System.out.println("");
	}
		for(int i=2;i<ref.length;i++) {

			if(i==2) {
				System.out.print(ref[0].charAt(i));
				System.out.print(ref[1].charAt(i));
				System.out.print(ref[2].charAt(i));
			}
			System.out.println("");
	}
		for(int i=3;i<ref.length+1;i++) {

			if(i==3) {
				System.out.print("");
				System.out.print(ref[1].charAt(i));
				System.out.print(ref[2].charAt(i));
//				System.out.print(ref[3].charAt(i));
			}
			System.out.println("");
	}
		for(int i=4;i<ref.length+2;i++) {

			if(i==4) {
				System.out.print("");
				System.out.print("");
				System.out.print(ref[2].charAt(i));
//				System.out.print(ref[3].charAt(i));
//				System.out.print(ref[4].charAt(i));
			}
			System.out.println("");
	}
				
		
		System.out.println("=======================================");
		
		String a="Gadag";
		String b="";
		
		for (int i = a.length()-1; i >= 0; i--) {
			b=b+a.charAt(i);
			
		}
		String lowerCase = b.toLowerCase();
		System.out.println(b);
		if(a.toLowerCase().equals(b.toLowerCase())) {
			System.out.println(b+" it is a palindrome "+lowerCase);
		}else {
			System.out.println(b+" it is not a palindrome ");
		}
		
	}

	public static String encryption(String value, int secretKey) {
		String encrypt = "";
		for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);
			ch += secretKey;
			encrypt = encrypt + ch;
		}
		return encrypt;

	}

	public static String decryption(String encrypt, int secretKey) {
		String decrypt = "";
		for (int i = 0; i < encrypt.length(); i++) {
			char ch = encrypt.charAt(i);
			ch -= secretKey;
			decrypt = decrypt + ch;
		}
		return decrypt;
	}

}
