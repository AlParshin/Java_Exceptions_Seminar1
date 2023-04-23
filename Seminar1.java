package Java_Exceptions;

import java.util.Arrays;

public class Seminar1 {
    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int[] array2 = new int[] { 1, 10, 20, 30, 40, 50, 60 };
        Minus(array1, array2);
        Del(array1, array2);
    }

    public static void Minus(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i] - arr2[i];
        }
        System.out.println("Результат вычитания:");
        System.out.println(Arrays.toString(arr3));
    }

    public static void Del(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль запрещено!");
            }
        }
        float[] arr4 = new float[arr1.length];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (float) arr1[i] / arr2[i];
        }
        System.out.println("Результат деления:");
        System.out.println(Arrays.toString(arr4));
    }
}