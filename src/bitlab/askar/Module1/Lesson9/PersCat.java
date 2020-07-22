package bitlab.askar.Module1.Lesson9;

public class PersCat extends Cat{

    public PersCat(String sound, String name, int weight, int mou) {
        super(sound, name, weight, mou);
    }

    public PersCat() {
    }

    @Override
    public String toString() {
        return "PersCat{" +
                "mou=" + mou +
                ", sound='" + sound + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
