package day02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
//		System.out.println(5 + "Ali"); //5Ali
//		System.out.println( 5+5 + "Ali" +4+3); //10Ali43
//		
//		System.out.println(1==3);//false
//		System.out.println(2==2);//true
		
	//Kullan�c�dan ad�n� ve soyad�n� alal�m ve ad�n�n ve soyad�n�n ilk harflerini yazd�ral�m
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("L�tfen ad�n�z� giriniz");
//		
//		char adilk= sc.next().charAt(0);
//		
//		System.out.println("L�tfen soyad�n�z� giriniz");
//		char soyadilk = sc.next().charAt(0);
//		
//		System.out.println("ad�n�z�n ilk harfi: " + adilk  + "\n"  + "soyad�n�z�n ilk harfi: " + soyadilk);
		
		//hasan kara 
		System.out.println("Ad�n�z� ve sayad�n�z� giriniz."); // hasan kara
		
		String adSoyad = sc.nextLine();
		
		System.out.println("isminizin ilk harfi: " + adSoyad.charAt(0) + "\n" + "soyisminizin ilk harfi: " +
		  adSoyad.charAt(6));
		
		sc.close();
		

	}

}
