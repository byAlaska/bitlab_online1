package bitlab.askar.Module2.Lesson5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static  ArrayList<User> users = new ArrayList<>();
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        readUsers();

        while (true) {
            System.out.println("[1] Add user");
            System.out.println("[2] list users");
            System.out.println("[3] remove user");
            System.out.println("[0] exit");

            int choice = in.nextInt();

            if (choice == 1) {
                int id = in.nextInt();
                String username = in.next();
                String password = in.next();
                int age = in.nextInt();
                User user = new User(id, username, password, age);
                users.add(user);
                writeUser();
            } else if (choice == 2) {
                for (User u : users) {
                    System.out.println(u);
                }
            }else if(choice==3){
                int index = in.nextInt();
                users.remove(index);
                writeUser();
            }else{
                break;
            }
        }

    }


    public static void writeUser(){
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("input.txt"));
            outputStream.writeObject(users);
            outputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void readUsers(){
        try {

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("input.txt"));
            users = (ArrayList<User>)inputStream.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
