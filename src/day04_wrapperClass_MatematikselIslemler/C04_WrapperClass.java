package day04_wrapperClass_MatematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String fiyatStr1 = "23";
        String fiyatStr2 = "45";

        System.out.println(fiyatStr1+fiyatStr2);
        System.out.println(Integer.parseInt(fiyatStr1)+Integer.parseInt(fiyatStr2));

        String fiyatStr3 = "23.56";
        String fiyatStr4 = "45.21";
        System.out.println(Double.parseDouble(fiyatStr3) + Double.parseDouble(fiyatStr4));

    }
}
