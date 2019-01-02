package SI;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class SubSetsofArray {
    static Scanner in = new Scanner(System.in);
    static int ans = 0;

    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            printSubsets();
        }
    }

    static public void printSubsets() {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        mergeSort(a, 0, a.length - 1);
        int[] b=removeDuplicates(a);
        /*LinkedList*/

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            for (int l = 1; l < b.length; l++) {
                for (int j = 1; j <= (b.length - l - i); j++) {
                    System.out.print(b[i] + " ");
                    for (int k = i + l; k < (i + j + l); k++) {
                        System.out.print(b[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

    private static int[] removeDuplicates(int[] a) {
        int j = 0, n = a.length;
        for (int i = 0; i < (n-1); i++) {
            if (a[i] != a[i + 1])
                a[j++] = a[i];
        }
        a[j++] = a[n - 1];
        int[] b = new int[j];
        for (int i = 0; i < j; i++) {
            b[i]=a[i];
        }
        return b;
    }

    private static void print(int j, int i, int[] a) {
        for (int k = j; k < (i + j); k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] a, int low, int high) {
        if (low == high)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    private static void merge(int[] a, int low, int mid, int high) {
        int tempSize = high - low + 1;
        int[] temp = new int[tempSize];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= high) {
            temp[k++] = a[j++];
        }
        for (int l = 0; l < tempSize; l++) {
            a[l + low] = temp[l];
        }
    }
}
