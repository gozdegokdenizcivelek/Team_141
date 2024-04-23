package day2_variables_scanner;

public class C01_PrimitiveDataTurleri {


    public static void main(String[] args) {
        char chr1 = 'o' ;
        char chr2 = ' ';
        // char chr3 = 'a '; //

        byte byt = 10; // bu hafizada 8 bit yer kapliyor
        short sh = 10; // bu hafizada 16 bit yer kapliyor
        int sayi = 10; // bu hafizada 32 bit yer kapliyor
        long lng = 10; // bu hafizada 64 bit yer kapliyor

        int sayi1 = 0; // bu hafizada 32 bit yer kapliyor
        int sayi2 = 1000; // bu hafizada 32 bit yer kapliyor
        int sayi3 = 1000000; // bu hafizada 32 bit yer kapliyor
        int sayi4 = 1000000000; // bu hafizada 32 bit yer kapliyo


        float flt = 234123123454332f;
        float flt2 = 234F;
        float flt3 = 23.678f;
        double dbl1 = 3.14234323456543432;


        /*
        1-boolean mantiksal true-folse
        2-char tek bir karakter tek tirnak içinde yazilir
        3--4-5-6 byte,short,int,long tam sayi barindirir
        7-8 float,double ondalikli sayi barindirir
         */

        //primitive data turleri sadece deger barindirir
        // non-primitive data turleri ise deger ve hazir method'lari barindirirlar

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDİR
        System.out.println(str.toLowerCase()); // java candir

        int not =10;
        int Not =20;
        int NOT =30;
        System.out.println(NOT);

        String isim1$_ = "Eghbal";
        // String 1isim = "Ali"; variable isimleri sayi ile baslayamaz
        String $isim = "Seher"; // isimlerin $ veya _ ile baslamasi tavsiye edilmez

        // int int = 20; Javada tanimli keyword'ler isim olarak kullanilmaz

        char isminIlkHarfi = 'a';



    }



}
