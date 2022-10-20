package Lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lesson11 {

    public static void main(String[] args) {
//        int[][] numbers = {{3,1,4}, {6,2,5}, {7,9,8}};
//
//
//        for (int[] numbers1D : numbers){
//            Arrays.sort(numbers1D);
//            for (int number : numbers1D){
//                System.out.print(number + " ");
//                //1 3 4 2 5 6 7 8 9
//            }
//        }
//
//        System.out.println();
//
//        for (int[] numbers1D : numbers){
//            for (int number = 0; number < numbers1D.length; number++){
//                System.out.print(numbers1D[numbers1D.length-1] - number + " ");
//            }
//        }


        Object[] numbers = {3, 1, 4, 6, 2, 5, 7, 9, 8};
        List arrayList = new ArrayList(Arrays.asList(numbers));
        Collections.sort(arrayList);
        System.out.print(arrayList + " ");
        Collections.reverse(arrayList);
        System.out.print(arrayList + " ");
        arrayList.toArray();
        for (int value = 0; value < arrayList.size(); value++){
            System.out.print(arrayList.get(value) + " ");
        }
        System.out.println();
        System.out.println((arrayList));


    }

}
