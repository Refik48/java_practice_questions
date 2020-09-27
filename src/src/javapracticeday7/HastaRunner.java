package javapracticeday7;

public class HastaRunner {

	public static void main(String[] args) {
		
		Hasta hasta1 =new Hasta();
		
		
		Case durum = new Case();
		durum.setActuatCase("Covit-19");
		durum.setEmergencey("kritik");
		
		System.out.println("Şuanki durumu: " +durum.getActuatCase());
		
		System.out.println("Aciliyet: " + durum.getEmergencey());
		
		hasta1.setIsim("John");
		hasta1.setSoyisim("Smith");
		hasta1.setSuankiDurum(durum);
		
		
		System.out.println("Hastanın ismi: "+hasta1.getIsim());
		System.out.println("Hastanın Soyismi: "+hasta1.getSoyisim());
		System.out.println("Hastanın Hastalığı: "+hasta1.getSuankiDurum().getActuatCase());
		System.out.println("Hastanın Aciliyeti: " + hasta1.getSuankiDurum().getEmergencey());
		
		

	}

}
