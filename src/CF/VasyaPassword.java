package CF;

import java.util.*;

public class VasyaPassword {
    static Scanner in = new Scanner(System.in);
    static int ans = 0;
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println(replacePass());
        }
    }

    private static String replacePass() {
        String s = in.next();
        char[] charArray = s.toCharArray();
        HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
        map.put("upper",new ArrayList<>());
        map.put("lower",new ArrayList<>());
        map.put("digits",new ArrayList<>());
        HashMap<String,Character> ansMap = new HashMap<String,Character>();
        ansMap.put("upper",'A');
        ansMap.put("lower",'a');
        ansMap.put("digits",'0');
        for (int i = 0; i < s.length(); i++) {
         if('a'<=s.charAt(i) && s.charAt(i)<='z')
             (map.get("lower")).add(i);
        if('A'<=s.charAt(i) && s.charAt(i)<='Z')
            (map.get("upper")).add(i);
        if('0'<=s.charAt(i) && s.charAt(i)<='9')
            (map.get("digits")).add(i);
        }
        ArrayList<String> invalid = new ArrayList<>();
        ArrayList<String> multiple = new ArrayList<>();
        int count=0;
        Set<String> set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            if(map.get(key).size()>1)
                multiple.add(key);
        }
        if(map.get("upper").size()==0){
            count++;
            invalid.add("upper");
        }
        if(map.get("lower").size()==0){
            count++;
            invalid.add("lower");
        }
        if(map.get("digits").size()==0){
            count++;
            invalid.add("digits");
        }
        if(count==0)
            return s;
        else if (count == 1) {
            ArrayList<Integer> multipleArray = (map.get(multiple.get(0)));
            charArray[(multipleArray.get(multipleArray.size() - 1))]= ansMap.get(invalid.get(0));
            return new String(charArray);
        } else {
            ArrayList<Integer> multipleArray = (map.get(multiple.get(0)));
            charArray[(multipleArray.get(multipleArray.size() - 1))]= ansMap.get(invalid.get(0));
            charArray[(multipleArray.get(multipleArray.size() - 2))]= ansMap.get(invalid.get(1));
            return new String(charArray);
        }
    }
}
