package IB;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by pillutja on 8/17/2018.
 */
public class LargestNumber {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int[] test = [44, 41, 12, 42, 71, 45, 28, 65, 75, 93, 66, 66, 37, 6, 24, 59];*/
        int testCases = in.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            A.add(in.nextInt());
        }
        System.out.println(largestNumber(A));
    }
    public static int merge(String b1,String c1){
        if(b1.length()>1){
            int len= c1.length();
            String substring = (b1.length()>len)?b1.substring(0,len):b1;
            if(Integer.parseInt(substring)>Integer.parseInt(c1)){
                sb.append(b1);
                return 0;
            }
            else{
                sb.append(c1);
                return 1;
            }
        }
        else{
            int firstCompare = Integer.parseInt(c1.substring(0,1));
            if(Integer.parseInt(b1)>firstCompare){
                sb.append(b1);
                return 0;
            }
            else{
                sb.append(c1);
                return 1;
            }
        }
    }
    public static String largestNumber1(final List<Integer> A) {
        TreeSet<String> b = new TreeSet<>();
        TreeSet<Integer> c = new TreeSet<>();
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        int flag=0,testCases=A.size();
        for (int i = 0; i < testCases; i++) {
            String s = String.valueOf(A.get(i));
            if(s.length()>1 && Integer.parseInt(s.substring(1,s.length()))==0)
                c.add(A.get(i));
            if(s.length()>1){
                flag=0;
                for (int j = 0; j < testCases; j++) {
                    String s1 = String.valueOf(A.get(j));
                    if(i!=j && s1.length()>s.length() && s1.contains(s)){
                        flag=1;
                        int first = Integer.parseInt(s1.substring(0,1)),last = Integer.parseInt(s1.substring(s1.length()-1,s1.length()));
                        if(first>last || first==last){
                            if(map.get(A.get(i))!=null){
                                map.get(A.get(i)).add(A.get(j));
                            }
                            else
                                map.put(A.get(i), new ArrayList<>(Arrays.asList(A.get(j))));
                        }
                        else{
                            b.add(s);
                            b.add(s1);
                        }
                    }
                }
                if(flag==0 && !c.contains(Integer.parseInt(s)))
                    b.add(s);
            }
            else{
                b.add(String.valueOf(A.get(i)));
            }
        }
        Iterator iterator =b.descendingIterator();
        Iterator citerator = c.iterator();
        int bint=0,cint=0,move=-1,c1=0;
        String b1="";
        while (bint<b.size() && cint<c.size())
        {
            if(move==-1){
                b1= (String)iterator.next();
                c1 = (int) citerator.next();
                bint++;cint++;
                move = merge(b1,String.valueOf(c1));
            }
            else if(move==0){
                b1= (String)iterator.next();
                bint++;
                move = merge(b1,String.valueOf(c1));
            }
            else{
                c1 = (int) citerator.next();
                cint++;
                move = merge(b1,String.valueOf(c1));
            }
        }
        while (iterator.hasNext())
        {
            sb.append(iterator.next());
        }
        while (citerator.hasNext())
        {
            sb.append(citerator.next());
        }
        return  sb.toString();
    }
    public static String largestNumber(final List<Integer> A) {
        int flag=0;
        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String XY = String.valueOf(o1)+String.valueOf(o2);
                String YX = String.valueOf(o2)+String.valueOf(o1);
                return XY.compareTo(YX)>0?-1:1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int x : A) {
            if(x!=0)
                flag=1;
            sb.append(x);
        }
        if(flag==0)
            return "0";
        return  String.valueOf(Integer.parseInt(sb.toString()));
    }
}
