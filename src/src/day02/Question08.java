package day02;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		
		// Kullan�c�ndan 2 say� alal�m ve bunlar�n birbirleriyle olan durumunu kar��la�t�rak�m.
		
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
		System.out.println("L�tfen 1. say�y� giriniz");
		int num1 = sc.nextInt();
		System.out.println("L�tfen 2. say�y� giriniz");
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
