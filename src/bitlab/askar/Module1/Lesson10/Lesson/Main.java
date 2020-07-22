package bitlab.askar.Module1.Lesson10.Lesson;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        Circle circle = new Circle(10);

        Shape[] shapes = {
                square,
                circle
        };


        for (int i=0;i<shapes.length;i++){
            System.out.println(shapes[i].getArea());
            shapes[i].printPerimeter();
        }


    }

}
