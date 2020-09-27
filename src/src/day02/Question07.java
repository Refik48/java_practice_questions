package day02;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan 1 harf (karakter) alalým ve bunun büyük harf, küçük harf yada 
		//hatalý giriþ þeklinde kod yazalým
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen bir karakter giriniz");
		
		char ch = sc.next().charAt(0);
//		
//		if (ch >= 'a' && ch<='z') {
//			
//			System.out.println("Küçük harf");
//			
//		}else if (ch>='A' && ch<='Z') {
//			System.out.println("Büyük harf");
//		}else {
//			System.out.println("Hatalý giriþ yaptýnýz.");
//		}
//		
		String result = ch>='a' && ch<='z' ? "Küçük harf": ch>='A' && ch<='Z'? "Büyük harf": 
			"Hatalý giriþ";
		
		System.out.println(result);

	}

}
