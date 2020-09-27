package day02;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		
		// Kullanýcdan alýnan sayýnýn negatif , pozitif yada notr olma durumunu konrtol eden ternary yazalým
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayý giriniz");
		
		int num = sc.nextInt();
		
		String result = num<0 ? "Negatif":num>0 ? "Pozifit": "notr";
		
		System.out.println(result);
		sc.close();

	}

}
