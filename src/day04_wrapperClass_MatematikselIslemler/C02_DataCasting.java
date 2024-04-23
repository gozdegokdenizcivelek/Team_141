package day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen 3 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();


        System.out.println("Girilen sayilarin ortalamasi : " + (sayi1+sayi2+sayi3)/3 );
        System.out.println("Girilen sayilarin ortalamasi : " + (double) (sayi1+sayi2+sayi3)/3 );
    }
}
