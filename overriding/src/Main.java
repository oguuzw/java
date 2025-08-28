//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[] {new TarimKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};

        for(BaseKrediManager krediManager : krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }
    }
}