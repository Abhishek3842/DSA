class Student{
    String name="XYZ";
    int age=20;
    void show(){
        System.out.println("XYZ is student");
    }
}
class Trainer{
    String name;
    int age;
    void show(){
        System.out.println("ABC is Trainer");
    }
}

public class StudentTrainerDemo {
    public static void main(String[] args) {
        Student s1= new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);

        Student s2 = new Student();
        s2.name="ASD";
        s2.age=23;
        System.out.println(s2.name);
        System.out.println(s2.age);

        Trainer t= new Trainer();
        t.name="ABC";
        t.age=26;
         System.out.println(t.name);
        System.out.println(t.age);

        s1.show();
        t.show();
    }
}
