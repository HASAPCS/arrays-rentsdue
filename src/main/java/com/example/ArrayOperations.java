package com.example;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] Xi_Jinping={69, 420, 111, 556, 79294, 55503, 1, 2};
        for (int Int: Xi_Jinping) {
            System.out.println(Int);
        }
    }

    // Exercise 2: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        int maxValue=array[0];
        for (int num: array) {
            if (num>maxValue) {
                maxValue=num;
            }
        }
        return maxValue;
    }

    // Exercise 3: Check for a Specific Value
    public static boolean containsValue(int[] array, int value) {
        for (int num: array) {
            if (num==value) {
                return true;
            }
        }
        return false; // Placeholder return value
    }

    // Exercise 4: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        double sum=0;
        for (int num: array) {
            sum +=num;
        }
        return sum/array.length; // Placeholder return value
    }

    // Exercise 5: Reverse an Array
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int j = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
    

    // Exercise 6: Sort an Array
    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }      
    }
}
