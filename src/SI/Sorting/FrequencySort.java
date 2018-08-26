package SI.Sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by pillutja on 8/22/2018.
 */
public class FrequencySort {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            frequencySort();
            System.out.println();
        }
    }

    private static void frequencySort() {
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];
        int[] countArray = new int[2001];
        Set<Integer> counts = new HashSet<>();
        for (int i = 0; i < arraySize; i++) {
            array[i]=in.nextInt();
        }
        for (int i = 0; i < arraySize; i++) {
            countArray[array[i]+(1000)]++;
        }
        for (int i = 0; i < 2001; i++) {
            if(countArray[i]!=0)
                counts.add(countArray[i]);
        }

        for (int i : counts) {
            for (int j = 0; j < 2001; j++) {
                if(countArray[j]== i)
                    for (int k = 0; k < i; k++) {
                        System.out.print(j-1000+" ");
                    }
            }
        }
    }
}
