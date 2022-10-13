package com.example.lib;

import java.util.Arrays;

public class Lesson9 {
    public static void main(String[] args) {
//        String[] massive = {"hello", "bye", "world"};
//        String[] massive3 = new String[]{"hello", "bye", "world", "country"};
//    int [] massive4 = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};
//
//        for (int i = 0; i<=massive4.length-1; i++){
//            System.out.print(massive4[i] + " ");
//        }
//
//        Arrays.sort(massive4);
//        System.out.println();
//        int index = Arrays.binarySearch(massive4, 33);
//        System.out.println(index);
//
//
//    for (int i = 0; i<=massive4.length-1; i++){
//        System.out.print(massive4[i] + " ");
//    }
//        System.out.println("\n");

//        int[] massive2 = new int[5];
//        massive2[0] = 1;
//        massive2[1] = 2;
//        massive2[2] = 3;
//        massive2[3] = 4;
//        massive2[4] = 5;
//
//        for (int i = 0; i<=massive.length-1; i++){
//            System.out.println(massive[i] +"\n");
//        }
//
//        for (int i = 0; i<=massive2.length-1; i++){
//            System.out.println(massive2[i] +"\n");
//        }
//        System.out.println(massive3[3]);


//        int[] massive5 = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};
//        for (int i =0; i<=massive5.length -1; i++){
//            System.out.print(massive5[i] + " ");
//        }
//        System.out.println();
//        for (int element : massive5){
//            System.out.print(element + " ");
//        }
        //      System.out.println(Arrays.toString(massive5));

//        int [] temp = new int[]{16, -17, 22, 0, 21, 33, 5, 4, -7};
//        double averageTemp;
//        int sumOfTemp =0;
//        for (int i=0; i<=temp.length-1;i++){
//            sumOfTemp+=temp[i];
//        }
//        averageTemp = (double) sumOfTemp/temp.length;
//        System.out.println(averageTemp);
        int[] mas = new int[]{25, 47, 34, 18, 96, 33, 28, 55, 87, 13};

        int max = 0;
        for (int i = 0; i <= mas.length - 1; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }
        }
        int min = max;
        for (int i = 0; i <= mas.length - 1; i++) {

            if (min > mas[i]) {
                min = mas[i];
            }
        }

        System.out.println(min + " " + max);

    }
}