package IB;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by pillutja on 8/17/2018.
 */
public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int[] test = [44, 41, 12, 42, 71, 45, 28, 65, 75, 93, 66, 66, 37, 6, 24, 59];*/
        int testCases = in.nextInt();
        int a[]=new int[testCases];
        for (int i = 0; i < testCases; i++) {
            a[i]=in.nextInt();
        }
        TreeSet<String> b = new TreeSet<>();
        TreeSet<Integer> c = new TreeSet<>();
        for (int i = 0; i < testCases; i++) {
            int x = a[i]%10;
            String s = String.valueOf(a[i]);
            if(s.length()>1 && Integer.parseInt(s.substring(1,s.length()))==0)
                c.add(a[i]);
            else{
                b.add(String.valueOf(a[i]));
            }
        }
        Iterator iterator =b.descendingIterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext())
        {
            sb.append(iterator.next());
        }
        Iterator citerator = c.iterator();
        while (citerator.hasNext())
        {
            sb.append(citerator.next());
        }
        System.out.println(sb.toString());
    }
    public String largestNumber(final List<Integer> A) {
        TreeSet<String> b = new TreeSet<>();
        TreeSet<Integer> c = new TreeSet<>();
        for (int i = 0; i < A.size(); i++) {
            String s = String.valueOf(A.get(i));
            if(s.length()>1 && Integer.parseInt(s.substring(1,s.length()))==0)
                c.add(A.get(i));
            else{
                b.add(String.valueOf(A.get(i)));
            }
        }
        Iterator iterator =b.descendingIterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext())
        {
            sb.append(iterator.next());
        }
        Iterator citerator = c.iterator();
        while (citerator.hasNext())
        {
            sb.append(citerator.next());
        }
        return sb.toString();
    }
}
