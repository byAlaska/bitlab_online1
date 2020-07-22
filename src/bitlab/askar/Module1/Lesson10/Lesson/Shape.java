package bitlab.askar.Module1.Lesson10.Lesson;

public abstract class Shape {

    abstract public double getPerimeter();
    abstract public double getArea();

    public void printArea(){
        System.out.println(getArea());
    }

    public void printPerimeter(){
        System.out.println(getPerimeter());
    }

}
