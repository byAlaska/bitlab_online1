package bitlab.askar.Module1.Lesson10.Lesson;

public class Square extends Shape {

    int width;

    public Square(){

    }

    public Square(int width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 4*width;
    }


    public double getArea() {
        return width*width;
    }
}
