package day02;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		
		// Kullanýcýndan 2 sayý alalým ve bunlarýn birbirleriyle olan durumunu karþýlaþtýrakým.
		
		/* 12 15      		12 < 15  12 != 15
		 * num1 > num2
		 * num1 < num2
		 * num1= num2
		 * num1 != num2
		 *  num1 <= num2
		 *  num1 >= num2
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen 1. sayýyý giriniz");
		int num1 = sc.nextInt();
		System.out.println("Lütfen 2. sayýyý giriniz");
		int num2 = sc.nextInt();
		
		if(num1==num2) {
			System.out.println(num1 + "=" + num2);}
		
		if (num1 != num2) {
			System.out.println(num1 + "!=" + num2);
		}
		if (num1 < num2) {
			System.out.println(num1 + "<" + num2);
			
		}
		if (num1 <= num2) {
			System.out.println(num1 + "<=" + num2);
		}
		if (num1 > num2) {
			System.out.println(num1 + ">" + num2);
			
		}
		if (num1>= num2) {
			System.out.println(num1 + ">=" + num2);
		}
		

	}

}
