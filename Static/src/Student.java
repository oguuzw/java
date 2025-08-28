public class Student {
    public String name;
    public int id;

    private static int counter = 0;  //static kelimesi "bu şey sınıfa aittir, nesneye değil" anlamına gelir. Yani bir şeyi static yaparsan, onu kullanmak için o sınıftan nesne (object) oluşturman gerekmez.

    public static int a = 90;

    Student (String name,int id){
        this.name = name;
        this.id = id ;
        Student.counter++;
    }

    public void exit(){
        Student.counter--;
    }

    public static int HowMuchStudent(){
        return Student.counter;
    }
}
