package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] randomIntsArray = IntStream.generate(() -> new Random().nextInt(100_000)).limit(100_000).toArray();
        System.out.println(Arrays.toString(randomIntsArray));
        sortInsertion(randomIntsArray);
        System.out.println(Arrays.toString(randomIntsArray));
    }
        private static void swapElements(int[] arr, int indexA, int indexB) {
            int tmp = arr[indexA];
            arr[indexA] = arr[indexB];
            arr[indexB] = tmp;
        }
        public static void sortInsertion(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;
                while (j > 0 && arr[j - 1] >= temp) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }

}

