package bitlab.askar.Module1.Lesson8.Lesson;

public class Main {
    public static void main(String[] args){

        Student[] students = {
                new Student(1,"Askar", "Datk",3.0),
                new Student(2,"Alibi","Datk",4.0),
                new Student(3,"KAzbek","Zhanbolsyn",1.0),
                new Student(4,"Alsyn","Dosbek",5.0),
                new Student(5,"Altyn","Java",10.0)
        };

//        for (int i=0;i<students.length;i++){
//            System.out.println(students[i].getStudentData());
//        }

        Student s = new Student(1,"Askar", "Datk",3.0);
        Student s2 = s;
        s.name = "Beka";
        s.surname = "Ushkemoirov";
        s.gpa = 2.0;
        s.id = 2;


        System.out.println(s.getStudentData());
        System.out.println(s2.getStudentData());


        int a = 10;
        int b = a;
        a = 5;

        System.out.println(a);
        System.out.println(b);

    }
}