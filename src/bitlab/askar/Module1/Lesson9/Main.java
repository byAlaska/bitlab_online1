package bitlab.askar.Module1.Lesson9;

public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal("name", "sound", 10);

        Cat cat = new Cat("Meow", "Barsik", 10, 4);


        Dog dog = new Dog("Gav", "Rex", 50, "T-Rex");



        Animal[] animals = {
                new Cat("Meow", "Barsik", 10, 4),
                new Dog("Gav", "Rex", 50, "T-Rex"),
                new Mouse()
        };




        for (int i=0;i<animals.length;i++){
            System.out.println(animals[i].toString());
        }

    }
}
