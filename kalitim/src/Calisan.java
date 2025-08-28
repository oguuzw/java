public class Calisan {
    protected String adSoyad,ePosta;
    protected int telefon;
    static int girisSayisi = 0;

    public Calisan(String adSoyad , String ePosta, int telefon) {
        this.ePosta = ePosta;
        this.telefon = telefon;
        this.adSoyad = adSoyad;
    }

    public String giris(){
        return adSoyad + " giris yapti";
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getePosta() {
        return ePosta;
    }

    public static int getGirisSayisi() {
        return girisSayisi;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public static void setGirisSayisi(int girisSayisi) {
        Calisan.girisSayisi = girisSayisi;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public static void listele(Calisan[] girisYapanlar){
        for(Calisan calisan : girisYapanlar){
            System.out.println(calisan.giris());
        }
    }
}
