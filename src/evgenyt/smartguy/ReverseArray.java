package evgenyt.smartguy;

import java.util.Arrays;

/**
 * Reverse int array, you smart guy
 * Aug 2019 EvgenyT
 */

public class ReverseArray {

    public static void main(String[] args) {
        int [] intArray = {1, 2, 3, 4, 5};
        // Cycle threw half of array
        for (int idx = 0; idx < intArray.length / 2; idx++) {
            // swap elements in idx and (length-idx-1) places
            int buff = intArray[idx];
            intArray[idx] = intArray[intArray.length - idx - 1];
            intArray[intArray.length - idx - 1] = buff;
            /* or swap without buffer - looks to crazy to use it in practice
            intArray[idx] += intArray[intArray.length - idx - 1];
            intArray[intArray.length - idx - 1] = intArray[idx] - intArray[intArray.length - idx - 1];
            intArray[idx] = intArray[idx] - intArray[intArray.length - idx - 1];
            */
        }
        System.out.println("Result: " + Arrays.toString(intArray));
    }
}
