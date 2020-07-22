package bitlab.askar.Module1.Lesson10.Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner in = new Scanner(System.in);


        while (true){


            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");


            int choice = in.nextInt();

            if (choice==1){

                int choice2 = in.nextInt();

            } else if(choice==2){

            }else if (choice==0){
                break;
            }




        }



        FerrariEngine f1 = new FerrariEngine(100,200,300);
        FerrariEngine f2 = new FerrariEngine(400,100,30);
        FerrariEngine f3 = new FerrariEngine(100,200,3);
        FerrariEngine f4 = new FerrariEngine(150,2000,700);

        RenaultEngine r1 = new RenaultEngine(100,200,300, 100);
        RenaultEngine r2 = new RenaultEngine(400,100,30,500);
        RenaultEngine r3 = new RenaultEngine(100,200,310,0);
        RenaultEngine r4 = new RenaultEngine(150,2000,700, 100);


        Engine[] engines = {f1,f2,f3,f4,r1,r2,r3,r4};

        for (int i=0;i<engines.length;i++){
            System.out.println(engines[i].getMaxSpeed());
        }
    }
}
