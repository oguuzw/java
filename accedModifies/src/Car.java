public class Car {
    int enginePower,model;  //(public) ayni sinif,ayni paket,farkli projeden erişilebilir
    private int speed;  //(private) ayni siniftan erisilebilir
    protected String color; //(protected) ayni sinif ayni paket
    String Marka;  //(default) ayni paket

    Car(){
        this.model = 2025;
        this.enginePower = 300;
        this.speed = 120;
        this.color = "red";
    }

    public void print(){
        System.out.println("model: "+model);

    }

    private void print2(){
        System.out.println(enginePower);

    }

    protected void print3(){
        System.out.println("hiz : "+speed);

    }
}
