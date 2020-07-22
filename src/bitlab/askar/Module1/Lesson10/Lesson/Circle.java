package bitlab.askar.Module1.Lesson10.Lesson;

public class Circle extends Shape{


    int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 3.14*2*radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
}
