package bitlab.askar.Module1.Lesson9;

public class Dog  extends Animal{

    String nickName;

    public Dog(String sound, String name, int weight, String nickName) {
        super(sound, name, weight);
        this.nickName = nickName;
    }

    public Dog() {
    }


    @Override
    public String toString() {
        return "Dog{" +
                "nickName='" + nickName + '\'' +
                ", sound='" + sound + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
