package javapracticeday7;


import java.util.Scanner;
public class Method01 {
    public static void main(String[] args) {
        //Üç sayý arasýndaki en küçük sayýyý bulmak için bir Java METHOD yazýn.
        
         Scanner sc=new Scanner(System.in);
         System.out.println("1.sayiyi girin:");
          double a = sc.nextDouble();
          System.out.println("2.sayiyi girin:");
          double b = sc.nextDouble();
          System.out.println("3.sayiyi girin:");
          double c = sc.nextDouble();
          enBuyuk(a,b,c);
          
          sc.close();
          
          }
          
           public static void enBuyuk(double a, double b, double c){
            if(a<b && a<c){
              System.out.println(a);
            }else if(b<a && b<c){
              System.out.println(b);
            }else{
              System.out.println(c);
            }
    }
}
