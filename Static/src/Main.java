//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("how much student : " + Student.HowMuchStudent());

        Student s1 = new Student("Ali",1);
        Student s2 = new Student("Veli",2);

        System.out.println("how much student : " + Student.HowMuchStudent());
        System.out.println(Student.a);

    }
}