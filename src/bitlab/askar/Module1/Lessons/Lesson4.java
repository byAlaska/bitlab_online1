package bitlab.askar.Module1.Lessons;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] array = new int[n];

        for (int i=0;i<array.length;i++){
            array[i] = in.nextInt();
        }

        // 3 4  0 5 6 9 0 1 2

        int sum = 0;
        boolean b = false;

        for (int i=0;i<array.length;i++){

            if (array[i] == 0 && !b){
                b = true;
            }else if(array[i] !=0 && b){
                sum += array[i];
            }else if(array[i]==0 && b){
                break;
            }

        }


        System.out.println(sum);


    }
}
