package com.example.lib;

import java.util.Arrays;

public class MassiveSort {
    public static void main(String[] args) {
        int massive[] = {1, 5, -3, 17, 3, 2, 13};
//        boolean isSorted = false;
//        int buffer;

//        while (isSorted == false){
//            isSorted = true;
//            for (int i=0; i<massive.length-1;i++){
//                if(massive[i] < massive[i+1]){
//                    isSorted = false;
//                    buffer = massive[i];
//                    massive[i] = massive[i+1];
//                    massive[i+1] = buffer;
//                }
//            }
//            System.out.println(Arrays.toString(massive));
//        }

        for (int i = 1; i < massive.length; i++) {
            int current = massive[i];
            int newValue = i - 1;
            while (newValue >= 0 && current < massive[newValue]) {
                massive[newValue + 1] = massive[newValue];
                newValue--;
            }
            massive[newValue + 1] = current;
            System.out.println(Arrays.toString(massive));
        }

    }
}
