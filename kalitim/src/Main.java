//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calisan calisan = new Calisan("oguz kocak","oguuzw@gmail.com", 545);

        //Akademisyen akademisyen = new Akademisyen("ali","ali@gmail.com",012345,"yazilim","java","lab");

        Memurlar memurlar = new Memurlar("ata","b",1,"c",2);

        Asistan asistan = new Asistan("Mehmet","s",2,"d","fizik","h","yes");

        OgretimUyesi ogretimUyesi = new OgretimUyesi("veli","s",2,"d","oop","h","prof dr.");


        System.out.println("Calisan(ana) : " + calisan.giris());
        //System.out.println("Calisan -> Akademisyen : " + akademisyen.giris());
        System.out.println("Calisan -> Memurlar : " + memurlar.giris());
        System.out.println("Calisan -> Akademisyen -> OgretimUyesi : " + ogretimUyesi.giris());
        System.out.println("Calisan -> Akademisyen -> Asistan : " + asistan.giris());

        /*

        Calisan calisanPolimorfizm = new Akademisyen("ali","a@gmail.com",123,"software","java","derslere gir");
        System.out.println("polymorphism : " + calisanPolimorfizm.giris()); //giris metodunu Akademisyen sınıfından alir

        */

        System.out.println("------------------------------------");
        Calisan[] girisListesi = {ogretimUyesi,memurlar,asistan};
        Calisan.listele(girisListesi);

        System.out.println("**********************************");
        ogretimUyesi.derseGir();
        asistan.derseGir();
    }
}