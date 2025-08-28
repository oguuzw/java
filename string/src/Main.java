//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char[] str = {'k','o','d'};
        String metin = new String(str);
        System.out.println(metin);

        System.out.println(metin.length());  //degiskenAdi.length();  uzunluk

        String metin2 = "java";
        System.out.println(metin.concat(metin2));  //iki metin birlestirme

        System.out.println(metin.equals(metin2));  //metinler ayni mi?
        System.out.println(metin.equalsIgnoreCase(metin2));  //buyuk kucuk onemsemeden bakar (Hello ile hello icin true doner)
    }
}