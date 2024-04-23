package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_KullaniciBilgileriniYazdirma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim =scanner.nextLine();

        System.out.println("Lutfen soyisiminizi giriniz...");
        String soyisim =scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();

        System.out.println( "Isminiz : " + isim +
                "\nSoyisim:"  +soyisim+
                "\nYasiniz: "  +yas+
                "\nKaydiniz basariyla tamamlanmiştir.");

    }
}
