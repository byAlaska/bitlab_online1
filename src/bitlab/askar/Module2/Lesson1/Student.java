package bitlab.askar.Module2.Lesson1;

public class Student {
    String name;
    String surname;
    int age;

    public Student() {
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age;
    }
}
