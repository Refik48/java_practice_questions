package day02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		
		// kullan�c�dan 2 tam say� alal�m ve d�rt i�lem sonucunu yazd�ral�m.
		
		Scanner  sc =new Scanner (System.in);
		
		System.out.println("L�tfen 1. say�y� giriniz");
		
		double num1 = sc.nextDouble();
		
		System.out.println("L�tfen 2. say�y� giriniz");
		double num2 = sc.nextDouble();
		
		System.out.println("Toplam: " + (num1+num2));
		System.out.println("Fark: " + (num1-num2));
		System.out.println("�arp�m: " +(num1*num2));
		System.out.println("B�l�m: " + (num1/num2));
		
		sc.close();

	}

}
