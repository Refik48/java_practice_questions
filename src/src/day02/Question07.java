package day02;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan 1 harf (karakter) alal�m ve bunun b�y�k harf, k���k harf yada 
		//hatal� giri� �eklinde kod yazal�m
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("L�tfen bir karakter giriniz");
		
		char ch = sc.next().charAt(0);
//		
//		if (ch >= 'a' && ch<='z') {
//			
//			System.out.println("K���k harf");
//			
//		}else if (ch>='A' && ch<='Z') {
//			System.out.println("B�y�k harf");
//		}else {
//			System.out.println("Hatal� giri� yapt�n�z.");
//		}
//		
		String result = ch>='a' && ch<='z' ? "K���k harf": ch>='A' && ch<='Z'? "B�y�k harf": 
			"Hatal� giri�";
		
		System.out.println(result);

	}

}
