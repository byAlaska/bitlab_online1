package bitlab.askar.Module2.Lesson3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> products = new ArrayList<>();

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String s;
            while ((s = reader.readLine())!= null){
                products.add(s);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        while (true){

            System.out.println("press [1] write product");
            System.out.println("press [2] list products");
            System.out.println("press [3] exit");

            int choice = in.nextInt();

            if (choice == 1){
                String product = in.next();
                products.add(product);
                writeProduct(products);
            }else if (choice==2){
                readProduct();
            }else{
                break;
            }

        }
    }


    public static void writeProduct(ArrayList<String> products){

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));

            for (String s:products){
                writer.write(s + "\n");
            }

            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void readProduct(){
        for (String s:products){
            System.out.println(s);
        }

    }

}
