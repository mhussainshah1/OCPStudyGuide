package ocp11.ch14.collection;

import java.util.Arrays;

public class BinarySearch {

    //Receive a sorted array of n elements
    public static int binarySearch(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            //Compute middle point
            int mid = low + (high - low) / 2;

            //If index key is less than array[mid] then high = mid -1 (This changes mid)
            if (key < array[mid]) {
                high = mid - 1;

                //else If index key is greater than array[mid] then low = mid +1
            } else if (key > array[mid]) {
                low = mid + 1;

                //else if index isn't greater nor less than array[mid], this means it's equal return mid
            } else {
                return mid;
            }
        }
        //If not greater, less nor equal, then it's not in the array so return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {-100, 1, 2, 3, 4, 5, 100, 999, 10203};

        System.out.println(binarySearch(999, array));  //returns index 6
        System.out.println(binarySearch(-100, array)); //returns index 0
        System.out.println(binarySearch(6, array));    //returns index -1
        Arrays.binarySearch(array, 6);
    }

}
