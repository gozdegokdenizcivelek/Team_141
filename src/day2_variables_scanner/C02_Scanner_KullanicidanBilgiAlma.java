package day2_variables_scanner;

import java.util.Scanner;

public class C02_Scanner_KullanicidanBilgiAlma {

    public static void main(String[] args) {

        //Kullanicidan ismini alip
        //ismi buyuk harf olarak yazdirin


        //Kullanicidan bilgi almak için
        //3 adima ihtiyaç vardir


        //1- Bir scanner objesi olusturmak

        Scanner scanner = new Scanner(System.in);


        //2-Kullaniciya ne istediğimizi soylemeiyiz

        System.out.println("Lutfen isminizi giriniz...");

        // 3- ıstediğimiz bilgiyi kaydedebileceğimiz,
        // istenen bilgiye UYGUN bir variable olusturun,
        // olusturduğumuz scanner objesi ile uygun hazir method'u kullanip
        // kullanilinin girdigi degeri, konsoldan alip,
        // olustudugumuz variable'a atayin

        String kullaniciIsmi = scanner.nextLine();

        // 32. satirdan bilgiyi alip kod dünyasina kaydettik,
        // Bundan sonra bizden istenen islemi yapabiliriz

        System.out.println( "Girilen ismin buyuk harfle yazilisi : "  + kullaniciIsmi.toUpperCase());

    }
}
