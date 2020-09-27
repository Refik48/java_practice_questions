package day02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		
		// kullanýcýdan 2 tam sayý alalým ve dört iþlem sonucunu yazdýralým.
		
		Scanner  sc =new Scanner (System.in);
		
		System.out.println("Lütfen 1. sayýyý giriniz");
		
		double num1 = sc.nextDouble();
		
		System.out.println("Lütfen 2. sayýyý giriniz");
		double num2 = sc.nextDouble();
		
		System.out.println("Toplam: " + (num1+num2));
		System.out.println("Fark: " + (num1-num2));
		System.out.println("Çarpým: " +(num1*num2));
		System.out.println("Bölüm: " + (num1/num2));
		
		sc.close();

	}

}
