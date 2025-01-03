package IB;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by pillutja on 8/17/2018.
 */
public class ArrayBug {
    public static void main(String[] args) {
        String[] a= new String[]{"a","b"};
        System.out.println(a.length);
        ArrayList<Integer> ans = primesum(4);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        /*HashMap.HashMap<Integer,Boolean> ans = sieve(19);
        for (int x : ans.keySet()) {
            System.out.print(x+" ");
        }*/
        /*for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }*/
        //System.out.println(findDigitsInBinary(23));
        //System.out.println(isPrime(6789));
        /*int[] test = [44, 41, 12, 42, 71, 45, 28, 65, 75, 93, 66, 66, 37, 6, 24, 59];*/
    }
    public static int isPrime(int A) {
        if(A==1)
            return 0;
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if ( A % i == 0) return 0;
        }
        return 1;
    }
    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        B = B%A.size();
        for (int i = 0; i < A.size() - B; i++) {
            ret.add(A.get(i + B));
        }
        for (int i = 0; i < B; i++) {
            ret.add(A.get(i));
        }

        return ret;
    }
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> start = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();
        if(A==1){
            start.add(A);
            return start;
        }
        for (int i = 1; i <= ((int)Math.sqrt(A)) ; i++) {
            if(A%i == 0){
                start.add(i);
                end.add(A/i);
            }
        }
        for (int i = end.size()-1; i >=0 ; i--) {
            start.add(end.get(i));
        }
        return start;
    }
    public static String findDigitsInBinary(int A) {
        StringBuilder sb = new StringBuilder();
        while(A>=1){
            sb.append(A%2);
            A=A/2;
        }
        return sb.reverse().toString();
    }

    public static HashMap<Integer,Boolean> sieve(int A) {
        HashMap<Integer,Boolean> a = new HashMap<>();
        HashMap<Integer,Boolean> ans = new HashMap<>();
        for (int i = 2; i <= A ; i++) {
            a.put(i,true);
        }
        for (int n : a.keySet()) {
            int x=0,y=2;
            if(a.get(n)==true && isPrime(n)==1){
                ans.put(n,true);
                x=n*y;y++;
                while (x<=A){
                    a.put(x,false);
                    x=n*y;y++;
                }
            }
        }
        return ans;
    }

    public static ArrayList<Integer> primesum(int A) {
        HashMap<Integer,Boolean> a = new HashMap<>();
        a = sieve(A);
        for (int x :a.keySet()) {
            if(a.containsKey(A-x))
                return new ArrayList<Integer>(Arrays.asList(x,A-x));
        }
        return new ArrayList<Integer>();
    }

}
