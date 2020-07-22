package bitlab.askar.Module1.Lesson9;

public class Cat extends Animal {

    int mou;


    public Cat(String sound, String name, int weight, int mou) {
        super(sound, name, weight);
        this.mou = mou;
    }

    public Cat() {

    }


    @Override
    public void say() {
        System.out.println("Name: " + name + " says: " + sound + ", MOUS: " + mou);
    }



    @Override
    public String toString() {
        return super.toString() + ", mou=" + mou;
    }
}
