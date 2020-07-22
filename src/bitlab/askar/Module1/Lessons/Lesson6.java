package bitlab.askar.Module1.Lessons;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();


        boolean b = false;
        for (int i=0;i<s.length();i++){

            System.out.print(s.charAt(i));
            System.out.print(s.charAt(i));
//            if (s.charAt(i) == ' '){
//                if (s.charAt(i+1) > 64 &&  s.charAt(i+1)< 91) b = true;
//                else b = false;
//            }
//
//            if (i==0){
//                if (s.charAt(i) > 64 &&  s.charAt(i)< 91){
//                    b = true;
//                }
//            }
//
//            if (b){
//                if ((s.charAt(i) > 64 &&  s.charAt(i)< 91 ) || (s.charAt(i) > 94 &&  s.charAt(i)< 123 ) || s.charAt(i) == 32){
//                    System.out.print(s.charAt(i));
//                }
//            }

        }
    }
}
