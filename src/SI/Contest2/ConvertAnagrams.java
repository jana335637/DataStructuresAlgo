package SI.Contest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by pillutja on 8/26/2018.
 */
public class ConvertAnagrams {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            System.out.println(changeAnagrams());
        }
    }
    static int changeAnagrams() throws Exception {
        String s = br.readLine();
        String a = s.split(" ")[0], b = s.split(" ")[1];
        int[] f = new int[26];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            f[a.charAt(i)-'a']++;
            map.put(a.charAt(i)-'a',0);
        }
        for (int i = 0; i < b.length(); i++) {
            if(map.get(b.charAt(i)-'a') !=null && map.get(b.charAt(i)-'a')==0){
                f[b.charAt(i)-'a']--;
                if(f[b.charAt(i)-'a']==0)
                    map.put(b.charAt(i)-'a',1);
            }
            else{
                f[b.charAt(i)-'a']++;
            }
        }
        int count=0;
        for (int i = 0; i < 26; i++) {
            count+=f[i];
        }
        return count;
    }
}
