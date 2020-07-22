package bitlab.askar.Module2.Lesson1;

public class Main {
    static MainMenu menu;
    public static void main(String[] args){

        MainFrame frame = new MainFrame();
        SecondPage secondPage = new SecondPage();
        menu = new MainMenu(frame,secondPage);
        menu.setVisible(true);

    }
}
