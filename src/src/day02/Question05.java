package day02;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// Kullanýcýdan  yaþýný ve kilosunu alalým
		// 18 yaþýndan küçük ise kan baðýþý yapamaz
		// 18 yaþýndan büyük ve 50 kilo dan hafif ise kan baðýþý yapamaz.
		// 18 yaþýndan büyük ve 50 kilodan aðýr ise kan baðýþý yapabilir.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lüften yaþýnýzý giriniz");
		 int yas = sc.nextInt();
		 System.out.println("Lütfen kilonuzu giriniz");
		 int kilo = sc.nextInt();
//		 
//		 if (yas>18) {
//			 		 
//			 System.out.println("Lütfen kilonuzu giriniz");
//			 int kilo = sc.nextInt();
//			 if (kilo>50) {
//			 System.out.println("Kan verebilirsiniz.");
//			 }else {
//			 System.out.println("50 kilodan hafifler kan baðýþý yapamaz.");
//		 }
//	 }else {
//			 System.out.println("18 yaþýndan küçükler kan baðýþý yapamaz.");
//		 }
	
//		 
		 String result = yas>18 ? kilo>50 ? "Kan baðýþý yapabilir":"50 kilodan hafifler kan baðýþý yapamaz."
			 :"18 yaþýndan küçükler kan baðýþý yapamaz."; 
		 System.out.println(result);

	}

}
