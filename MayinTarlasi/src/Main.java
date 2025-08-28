import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row,col;

        System.out.println("row(satir boyutu giriniz)");
        row = scan.nextInt();
        System.out.println("col(sutun sayisi giriniz)");
        col = scan.nextInt();

        MayinTarlasi mayin = new MayinTarlasi(row,col);

        mayin.run();
    }

}