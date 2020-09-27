package day07;

public class Array05 {

	public static void main(String[] args) {
		// Array elemanlarý arasýnda en büyük elemaný bulan methodu yazalim.
		
		int []arr= {12,54,53,23};
		int max =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Arrayin en büyük elemani: "+ max);
		

	}

}
