package binarysearchbuiltin;

import java.util.Arrays;

public class Binarysearchbuiltin {

    public static int binarysearch(int[] array, int target) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        var x = Arrays.binarySearch(array, target);
        return x;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int index = binarysearch(array, 4);
        System.out.println("is found at index" + index);

    }

}

