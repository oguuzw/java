//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("program basladi");


        int a = 0;
        int[] arr = new int[3];

        try{
            // hata cikma ihtimali varsa buraya yazilir
            a = 2/0;
        }catch (ArithmeticException e){
            //hata cikarsa burasi calisir
            System.out.println(e.getMessage());
        }

        System.out.println(a);

        try{
            arr[4]=10;
        }catch(Exception exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.toString());
        }

    }
}