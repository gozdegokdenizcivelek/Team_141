package day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C01_DataCasting_Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz....");
        char girilenKarakter = scanner.next().charAt(0);


        System.out.println("Girdiginiz karakterden bir sonraki karakter : " + (char) (girilenKarakter+1));
        System.out.println("Girdiginiz karakterden iki sonraki karakter : " + (char) (girilenKarakter+2));
        System.out.println("Girdiginiz karakterden uc sonraki karakter : " + (char) (girilenKarakter+3));


    }
}
