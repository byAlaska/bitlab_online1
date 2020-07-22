package bitlab.askar.Module1.Lessons;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        System.out.println("Choose your branch:\n" +
                "\n" +
                "1 - Science, 2 - Humanitarian subjects, 3 - Art, 4 - Sport:");


        int choice = in.nextInt();

        if (choice == 1){

            System.out.println("1 - Math, 2 - Physics:");

            int choice2 = in.nextInt();

            if (choice2 == 1){
                System.out.println("You are Financier");
            }else if(choice2 == 2){
                System.out.println("You are Engineer");
            }

        }else if(choice == 2){

            System.out.println("1 - History, 2 - Foreign Languages:");

            int choice2 = in.nextInt();

            if (choice2 ==1){
                System.out.println("You are Historic or Diplomat  ");
            }else if (choice2 == 2){
                System.out.println("You are Translator");
            }
        }


    }
}
