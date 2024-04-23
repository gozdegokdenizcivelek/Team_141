package day2_variables_scanner;

import java.util.Scanner;

public class C04_Scanner_IlkHarfiYazdirma {
    public static void main(String[] args) {
        //Kullanicidan bir matin istemek
        //metnin ilk harfini buyuk harf olarak yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Metin Giriniz");

        // 2 yöntemle yapcagiz
        // 1- once tum metni alip sonra ilk harfi yazdiralim

        String metin = scanner.nextLine(); //metni alıp kaydettik
        System.out.println(metin.toUpperCase().charAt(0));
        //kaydedilen metnin ilk harfi büyük alındı

        //2.YONTEM...

        System.out.println("Lutfen Bir Metin Daha Giriniz...");
        char ilkHarf = scanner.nextLine().toUpperCase().charAt(0);
        System.out.println("ikinci metin ilk harf" + ilkHarf);
    }
}
