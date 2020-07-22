package bitlab.askar.Module1.Lessons;

public class Lesson7 {


    public static int Max(int a, int b, int c){

        if (a>b){
            if (a>c)return a;
            else return c;
        }else{
            if (b>c) return b;
            else return c;
        }

    }

    public static int findMinimumZero(int[][] array){

        int min = 999999;
        int index = 0;

        for (int i=0;i<array.length;i++){

            int cnt = 0;
            for (int j=0;j<array[i].length;j++){
                if (array[i][j] == 0) cnt++;
            }

            if (min>cnt) {
                min = cnt;
                index = i;
            }


        }

        return index+1;


    }


    public static void main(String[] args){


        int[][] array = {
                {1,2,3},{2,3,4},{5,6,7},{0,0,0}
        };


        array = swapArrays(array);


        for (int i=0;i<array.length;i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }


    public static int[][] swapArrays(int[][] array){

        int[] bubble = array[0];
        array[0] = array[array.length-1];
        array[array.length - 1] = bubble;

        return array;
    }






    public static void printSum(int a, int b, String name){
        System.out.println(name);
        System.out.println(a + b);
    }



    public static void printSum(int a, int b, int c){
        System.out.println(a + b + c);
    }


    public static void printSum(int []array){

        int sum= 0;
        for (int i=0;i<array.length;i++){
            sum += array[i];
        }

        System.out.println(sum);
    }


}
