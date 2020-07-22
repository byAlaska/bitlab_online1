package bitlab.askar.Module1.Lesson9;

public class Animal{

    String sound;
    String name;
    int weight;

    public Animal(String sound, String name, int weight) {
        this.sound = sound;
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
    }

    public void say(){
        System.out.println("Name: " + name + " says: " + sound);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "sound='" + sound + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }



}
