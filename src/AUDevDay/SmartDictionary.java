package AUDevDay;

import java.util.Arrays;
import java.util.Scanner;

public class SmartDictionary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(),k = input.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = input.next();
        }
        Arrays.sort(words);
        int first =0 , last = k-1, max=0;
        while(last<n){
            max = Math.max(max, getLCP(first, last, words));
            first++;
            last++;
        }
        System.out.println(max);
    }

    private static int getLCP(int first, int last, String[] words) {
        int count=0, minLen = Integer.MAX_VALUE;
        for (int i = first; i <= last; i++) {
            minLen = Math.min(minLen, words[i].length());
        }
        int index = 0;
        while(index<minLen){
            if(words[first].charAt(index)!=words[last].charAt(index)){
                return index;
            }
            index++;
        }
        return minLen;
    }
}
