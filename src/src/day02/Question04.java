package day02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
//		System.out.println(5 + "Ali"); //5Ali
//		System.out.println( 5+5 + "Ali" +4+3); //10Ali43
//		
//		System.out.println(1==3);//false
//		System.out.println(2==2);//true
		
	//Kullanýcýdan adýný ve soyadýný alalým ve adýnýn ve soyadýnýn ilk harflerini yazdýralým
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Lütfen adýnýzý giriniz");
//		
//		char adilk= sc.next().charAt(0);
//		
//		System.out.println("Lütfen soyadýnýzý giriniz");
//		char soyadilk = sc.next().charAt(0);
//		
//		System.out.println("adýnýzýn ilk harfi: " + adilk  + "\n"  + "soyadýnýzýn ilk harfi: " + soyadilk);
		
		//hasan kara 
		System.out.println("Adýnýzý ve sayadýnýzý giriniz."); // hasan kara
		
		String adSoyad = sc.nextLine();
		
		System.out.println("isminizin ilk harfi: " + adSoyad.charAt(0) + "\n" + "soyisminizin ilk harfi: " +
		  adSoyad.charAt(6));
		
		sc.close();
		

	}

}
