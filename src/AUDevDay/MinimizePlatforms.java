package AUDevDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinimizePlatforms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] aTimearray = new int[input], dTimearray = new int[input];
        for (int i = 0; i < input; i++) {
            aTimearray[i] = scanner.nextInt();
        }
        for (int i = 0; i < input; i++) {
            dTimearray[i] = scanner.nextInt();
        }
        MinimizePlatforms minimizePlatforms = new MinimizePlatforms();
        minimizePlatforms.findMinimizePlatforms();
    }
    public static int findPlatformOptimized(int[] arr, int[] dep, int n)
    {
        int count = 0, maxPlatforms = 0;
        // Find the maximum departure time
        int maxDepartureTime = dep[0];
        for (int i = 1; i < n; i++) {
            maxDepartureTime = Math.max(maxDepartureTime, dep[i]);
        }

        // Create a vector to store the count of trains at each time
        List<Integer> v = new ArrayList<>(maxDepartureTime + 2);
        for (int i = 0; i < maxDepartureTime + 2; i++) {
            v.add(0);
        }

        // Increment the count at the arrival time and decrement at the departure time
        for (int i = 0; i < n; i++) {
            v.set(arr[i], v.get(arr[i]) + 1);
            v.set(dep[i] + 1, v.get(dep[i] + 1) - 1);
        }

        // Iterate over the vector and keep track of the maximum sum seen so far
        for (int i = 0; i <= maxDepartureTime + 1; i++) {
            count += v.get(i);
            maxPlatforms = Math.max(maxPlatforms, count);
        }

        return maxPlatforms;
    }

    public void findMinimizePlatforms(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] aTimearray = new int[input], dTimearray = new int[input];
        for (int i = 0; i < input; i++) {
            aTimearray[i] = scanner.nextInt();
        }
        for (int i = 0; i < input; i++) {
            dTimearray[i] = scanner.nextInt();
        }
        Arrays.sort(aTimearray);
        Arrays.sort(dTimearray);
        int max = 1, count = 1;
        int i=0, j=1;
        while(i<input && j<input){
            if(aTimearray[j] <= dTimearray[i]){
                count++;
                j++;
            }
            else if(aTimearray[j] > dTimearray[i]){
                count--;
                i++;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
    static int findPlatform(int aTimearray[], int dTimearray[]) {
        int input = aTimearray.length;
        Arrays.sort(aTimearray);
        Arrays.sort(dTimearray);
        int max = 1, count = 1;
        int i=0, j=1;
        while(i<input && j<input){
            if(aTimearray[j] <= dTimearray[i]){
                count++;
                j++;
            }
            else if(aTimearray[j] > dTimearray[i]){
                count--;
                i++;
            }
            max = Math.max(max, count);
            return max;

        // add your code here


    }
        return max;
    }
}
class Pair {
    int t, d;
    public Pair(int t, int d) {
        this.t = t;
        this.d = d;
    }
}
