package day11;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
		/*
		 * Bir palindrom, madam veya racecar veya 10801 say�s� gibi ileriye do�ru geriye do�ru okuyan bir kelime, say�, kelime �be�i veya di�er karakter dizisidir.
			Girilecek kelimenin palindrom olup olmad���n� do�rulayacak bir Java Kodu yaz�n.
			madam  1234321
		 */
		Scanner input =new Scanner(System.in);
		System.out.println("L�tfen polindrom i�in de�er giriniz.");
		String str =input.nextLine().toLowerCase().replace(" ",""); //ali
		
		int count =str.length()-1;//2
		
		String tersi="";
		
		for(;count>=0;count--) {
			tersi =tersi+str.charAt(count);//ila
		}
		
		
		
		if (tersi.equals(str)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
