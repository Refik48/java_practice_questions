package day02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		// Kullan�c�dan 5 basamakl� say� alal�m,  ilk 2 ve son 2 basamaklar�ndaki say�lar�n 
		// say� de�erlerini toplayal�m 
		
		// 12345
		//12 1+2
		//45 4+5
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("L�tfen 5 basamakl� say� giriniz");
		
		int num = sc.nextInt(); //12345 
		
		int ilkIki  = num/1000; //12
		
		int sonIki = num%100; //45
		
		int iklIkiTop = (ilkIki%10)+ (ilkIki/10);
		
		int sonIkiTop = (sonIki %10) + (sonIki/10);
		
		
		System.out.println("Say�lar�n toplam�: " +(iklIkiTop + sonIkiTop));
		
		
		sc.close();

	}

}
