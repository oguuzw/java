public abstract class Akademisyen extends Calisan {

    String bolum,gorev,ders;

    public Akademisyen(String adSoyad, String ePosta, int telefon, String bolum, String ders, String gorev) {
        super(adSoyad, ePosta, telefon);
        this.bolum = bolum;
        this.ders = ders;
        this.gorev = gorev;
    }

    public abstract void derseGir();

        @Override
    public String giris(){
        return super.giris() + " A kapisindan ";
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
