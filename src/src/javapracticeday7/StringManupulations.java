package javapracticeday7;

import java.util.Scanner;

public class StringManupulations {

	public static void main(String[] args) {
		
		// Kullan�c�dan isim ve soyad� al�n�z ve ilk karflerini b�y�k yap�n�z
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("L�tfen ad�n�z� giriniz");
		String isimSoyisim =sc.nextLine().toLowerCase();
		
		int ikinciBaslangic= isimSoyisim.indexOf(" ");
		
		System.out.println(isimSoyisim.substring(0,1).toUpperCase()+isimSoyisim.substring(1,
				ikinciBaslangic)+" " +isimSoyisim.substring(ikinciBaslangic+1,ikinciBaslangic+2).toUpperCase()+
				isimSoyisim.substring(ikinciBaslangic+2)
				
						) ;
		
		String arrNames [] = isimSoyisim.split(" ");
		for (int i = 0; i < arrNames.length; i++) {
			if (arrNames.length-1 !=i)
				System.out.print(arrNames[i].substring(0,1).toUpperCase()+arrNames[i]
					.substring(1)+ " ");
			else
				System.out.print(arrNames[i].substring(0,1).toUpperCase()+arrNames[i]
						.substring(1));
					
					
			
		}
		
		
		

	}

}
