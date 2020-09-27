package day10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Array04 {

	public static void main(String[] args) {
		// Klavyeden girilecek plaka numarasýndan ili gösteren uygulamayý yazalým

        /*      "Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara",
                "Antalya", "Artvin", "Aydýn", "Balýkesir", "Bilecik", "Bingöl", "Bitlis",
                "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum", "Denizli",
                "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir",
                "Gaziantep", "Giresun", "Gümüþhane", "Hakkari", "Hatay", "Isparta",
                "Ýçel (Mersin)", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
                "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
                "K.maraþ", "Mardin", "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize",
                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdað", "Tokat", "Trabzon",
                "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan",
                "Iðdýr", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"

         */
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lutfen il plaka numarasi giriniz. 1-81");
		//int plaka = input.nextInt();
		String Sehirler [] = {"","Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara",
                "Antalya", "Artvin", "Aydýn", "Balýkesir", "Bilecik", "Bingöl", "Bitlis",
                "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum", "Denizli",
                "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir",
                "Gaziantep", "Giresun", "Gümüþhane", "Hakkari", "Hatay", "Isparta",
                "Ýçel (Mersin)", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
                "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
                "K.maraþ", "Mardin", "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize",
                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdað", "Tokat", "Trabzon",
                "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan",
                "Iðdýr", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
		
		//System.out.println("Girilen Plaka Numarasi " +Sehirler [plaka] +" iline aittir.");
		int plaka = Byte.valueOf(JOptionPane.showInputDialog("Lutfen Plaka Numarasi Giriniz"));
		JOptionPane.showMessageDialog(null,Sehirler [plaka]);

	}

}
