package bitlab.askar.Module1.Lessons;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 90 -100 A
        // 75 - 94 B
        // 60 - 74 C
        // 50 - 59 D
        // 0 - 50 F


//        int mark = in.nextInt();



//        if(mark>=90 && mark<=100){
//            System.out.println("Студент получил A за курс");
//        }else if(mark>=80 && mark<=89){
//            System.out.println("Студент получил B за курс");
//        }else if(mark>=70){
//            System.out.println("Студент получил C за курс");
//        }else if(mark>=60){
//            System.out.println("Студент получил D за курс");
//        }else{
//            System.out.println("Студент провалил курс F");
//        }


//        switch (mark){
//            case 1:
//                System.out.println("FIRST");
//                break;
//
//            case 2:
//                System.out.println("SECOND");
//                break;
//
//            case 3:
//                System.out.println("THIRD");
//                break;
//        }




        int x = in.nextInt();



        if (x <=20 && x>=10){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }



    }
}
