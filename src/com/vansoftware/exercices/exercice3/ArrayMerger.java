package com.vansoftware.exercices.exercice3;

public class ArrayMerger {
    public static int[] merge(int[] arr1, int[] arr2) {
        if (arr1 == null) {
            return arr2;
        } else {
            if (arr2 == null) {
                return arr1;
            } else {
                int[] result = new int[arr1.length + arr2.length];

                int i1 = 0;
                int i2 = 0;

                for (int i = 0; i < result.length; i++) {

                    if (i1 >= arr1.length) {
                        result[i] = arr2[i2++];
                    } else if (i2 >= arr2.length) {
                        result[i] = arr1[i1++];
                    } else {
                        if (arr1[i1] < arr2[i2]) {
                            result[i] = arr1[i1++];
                        } else {
                            result[i] = arr2[i2++];
                        }
                    }
                }

                return result;
            }
        }
    }
}
