package com.vansoftware.exercices.exercice3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import static java.util.stream.Collectors.*;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class ArrayMergerTest {

    @Test
    public void testMerge1() {
        int[] arr1 = null;
        int[] arr2 = null;

        int[] result = ArrayMerger.merge(arr1, arr2);

        assertNull(result);
    }

    @Test
    public void testMerge2() {
        int[] arr1 = {1,2,6,9,10};
        int[] arr2 = null;

        int[] result = ArrayMerger.merge(arr1, arr2);

        assertArrayEquals(new int[]{1,2,6,9,10}, result);
    }

    @Test
    public void testMerge3() {
        int[] arr1 = null;
        int[] arr2 = {3,4,5,7,8};

        int[] result = ArrayMerger.merge(arr1, arr2);

        assertArrayEquals(new int[]{3,4,5,7,8}, result);
    }

    @Test
    public void testMerge4() {
        int[] arr1 = {1,2,6,9,10};
        int[] arr2 = {};

        int[] result = ArrayMerger.merge(arr1, arr2);

        assertArrayEquals(new int[]{1,2,6,9,10}, result);
    }

    @Test
    public void testMerge5() {
        int[] arr1 = {};
        int[] arr2 = {3,4,5,7,8};

        int[] result = ArrayMerger.merge(arr1, arr2);

        assertArrayEquals(new int[]{3,4,5,7,8}, result);
    }

    @Test
    public void testMerge6() {
        int[] arr1 = {1,2,6,9,10};
        int[] arr2 = {3,4,5,7,8};

        int[] result = ArrayMerger.merge(arr1, arr2);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, result);
    }

    @Test
    public void testMergeU() {
        Random random = new Random();
        int l = random.nextInt(1000);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < l; i++) {
            if (random.nextBoolean()) {
                list1.add(i);
            } else {
                list2.add(i);
            }
        }

        int[] arr1 = list1.stream().mapToInt(Integer::intValue).toArray();
        int[] arr2 = list2.stream().mapToInt(Integer::intValue).toArray();

        int[] result = ArrayMerger.merge(arr1, arr2);

        assertArrayEquals(IntStream.range(0, l).toArray(), result);
    }
}