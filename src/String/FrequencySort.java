package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public String frequencySort(String s) {
        if(s.length() <= 1) return s;
        Pair[] pairs = new Pair[62];
        for (int i = 0; i < 26; i++) {
            pairs[i] = new Pair((char)('A'+i),0);
        }
        for (int i = 26; i < 52; i++) {
            pairs[i] = new Pair((char)('a'+i-26),0);
        }
        for (int i = 52; i < 62; i++) {
            pairs[i] = new Pair((char)('0'+i-52),0);
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                pairs[s.charAt(i)-'a'+26].count++;
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                pairs[s.charAt(i)-'A'].count++;
            }else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                pairs[s.charAt(i)-'0'].count++;
            }

        }
        Arrays.sort(pairs, (p1,p2)->{
            if(p1.count!=p2.count) return p2.count-p1.count;
            return p1.c-p2.c;
        });
        StringBuilder sb = new StringBuilder();
        for (Pair p:pairs) {
            for (int i = 0; i < p.count; i++) {
                sb.append(p.c);
            }
        }
        return sb.toString();
    }

    public String frequencySort1(String s) {
        if(s.length() <= 1) return s;
        Map<Character, Integer> map = new HashMap<>();
        for(Character c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();
            for(int i = 0; i < entry.getValue(); i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new FrequencySort().frequencySort("ABCaaaaABCCCCCCCC"));

    }
}
class Pair{
    int count;
    char c;
    public Pair(char c, int count){
        this.c=c;
        this.count=count;
    }

}
