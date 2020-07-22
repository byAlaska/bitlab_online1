package bitlab.askar.Module1.Lesson11;

public class Main {
    public static void main(String[] args){

        Rozetka []rozetkas = {
                new Pylesos(),
                new Multivarka(),
                new Telephone()
        };

        for (int i=0;i<rozetkas.length;i++){
            rozetkas[i].connect();
        }

        cook(new Multivarka());
        cook(new ElectroPlita());

    }

    public static void cook(CanCook canCook){
        canCook.cook();
    }
}
