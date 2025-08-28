import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("program basladi");

        int a = 0;
        int[] arr = new int[3];
        Scanner scanner = new Scanner(System.in);

        try{
            // hata cikma ihtimali varsa buraya yazilir
            a = 2/0;
        }catch (ArithmeticException e){
            //hata cikarsa burasi calisir
            System.out.println(e.getMessage());
        }

        System.out.println(a);
        System.out.println("-------------------------");

        try{
            arr[4]=10;
        }catch(Exception exception){  //hatanin turunu bilmiyorsam Exception sinifindan cagiririz
            System.out.println(exception.getMessage());
            System.out.println(exception.toString());
        }
        System.out.println("-------------------------");

        //birden fazla catch'de kullanilabilir
        try{
            a = 2/0;
        }catch (ArithmeticException e){
            System.out.println("sifira bolunme hatasi");
            System.out.println(e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println("Array boyut hatasi");
            System.out.println(e.getMessage());
        }catch (Exception exception){
            System.out.println(exception.toString());
        }finally{
            //hata olsa da olmasa da calisir
            System.out.println("finally kismi");
        }


    }
}