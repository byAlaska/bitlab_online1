package bitlab.askar.Module1.Lessons;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        String str = in.nextLine();
        String []words = str.split(" ");

        for (int i=0;i<words.length;i++){

            String example = "";
            for (int j=words[i].length()-1;j>=0;j--){
                example += words[i].charAt(j);
            }
            words[i] = example;

        }

        for (int i=0;i<words.length;i++){
            System.out.print(words[i] + " ");
        }






//        String string = in.next();

//        char[] chars = string.toCharArray();
//
//        System.out.println(string.equals("Alaska"));
//
//        System.out.println(string.length());
//        System.out.println(string.charAt(1));
//
//        System.out.println(string.toLowerCase());
//        System.out.println(string.toUpperCase());
//
//        string = string.trim();
//
//        int a = Integer.parseInt(string);
//        boolean b = Boolean.parseBoolean(string);
//
//        System.out.println(a);
//        System.out.println(b);
//
//        System.out.println(string.indexOf(" home"));
//
//        String[] strings = {"Alaska", "Wyoming", "Ohio"};
//
//        for (int i=0;i<strings.length;i++){
//            System.out.println(strings[i]);
//        }



        // kazbk

        // 5 - 0 - 1 = 4

        // int i = 0

//        int cnt = 0;
//
//        for (int i=0;i<string.length();i++){
//            if ( string.charAt(i) > 96 && string.charAt(i) < 123){
//                cnt++;
//            }
//        }
//
//
//        System.out.println(cnt);


//        String string2 = in.next();
//
//        boolean b = false;
//
//
//        for (int i=0;i<string.length();i++){
//
//            if (string.charAt(i) == string2.charAt(i)){
//                b = true;
//            }
//
//        }

//        Scanner in = new Scanner(System.in);


    }
}
