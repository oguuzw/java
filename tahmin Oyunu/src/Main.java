import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int sayi = rand.nextInt(100);
        int kalanHak=5;

        for(int i=0;i<5;i++){
            System.out.println("Sayi tahmin ediniz");
            int tahmin = scan.nextInt();

            if(tahmin == sayi){
                System.out.println("Tebrikler " + tahmin + " dogru cevap");
                return;
            }else{
                kalanHak--;
                if(tahmin < sayi){
                    System.out.println("daha buyuk bir sayi tahmin ediniz");
                    System.out.println("kalan tahmin sayisi : " + kalanHak );
                }else{
                    System.out.println("daha kucuk bir sayi tahmin ediniz");
                    System.out.println("kalan hak : " + kalanHak);
                }
            }
        }

        System.out.println("Sayi : " + sayi );

    }
}