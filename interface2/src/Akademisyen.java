public class Akademisyen implements ICalisan{
    private String adSoyad,bolum,gorev;

    public Akademisyen(String adSoyad, String bolum, String gorev) {
        this.adSoyad = adSoyad;
        this.bolum = bolum;
        this.gorev = gorev;
    }

    @Override
    public void cikis() {

    }

    @Override
    public void giris() {

    }

    @Override
    public boolean yemek(int saat) {
        return false;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }


}
