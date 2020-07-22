package bitlab.askar.Module2.Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {

        Scanner in = new Scanner(System.in);

        User []users = new User[5];


        for (int i=0;i<5;i++){
            User user;
            String name = "";
            String surname = "";
            int age;
            try {
                System.out.println("Input name");
                 name = in.next();
                System.out.println("Input surname");
                 surname = in.next();
                System.out.println("Input age");
                 age = in.nextInt();
            }catch (Exception e){
                age = 0;
                e.printStackTrace();
            }

            user = new User(name,surname,age);

            users[i] = user;
        }

        for (int i=0;i<5;i++){
            System.out.println(users[i]);
        }
    }
}
