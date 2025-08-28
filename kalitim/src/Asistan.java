public class Asistan extends Akademisyen {
    private String yuksekLisans;

    public Asistan(String adSoyad, String ePosta, int telefon, String bolum, String ders, String gorev, String yuksekLisans) {
        super(adSoyad, ePosta, telefon, bolum, ders, gorev);
        this.yuksekLisans = yuksekLisans;
    }

    @Override
    public String giris(){
        return "asistan " + super.giris();
    }

    @Override
    public void derseGir(){
        System.out.println(getAdSoyad() + " " + getDers() + " dersine girdi.");
    }

    public String getYuksekLisans() {
        return yuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        this.yuksekLisans = yuksekLisans;
    }
}
