package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder1 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList)
    {
        // Code here
        HashSet<String> st = new HashSet<>();
        for (int i = 0; i < wordList.size(); i++) {
            st.add(wordList.get(i));
        }
        Queue<PairWord> queue = new LinkedList<>();
        queue.offer(new PairWord(beginWord,1));
        st.remove(beginWord);
        while(!queue.isEmpty()){
            PairWord pair = queue.poll();
            String word = pair.getWord();
            int steps = pair.getSteps();
            if(word.equals(endWord)) return steps;
            for (int i = 0; i < word.length(); i++) {
                for(char ch = 'a'; ch<= 'z'; ch++){
                    char[] replaceArr = word.toCharArray();
                    replaceArr[i]=ch;
                    String replaceWord = new String(replaceArr);
                    if(st.contains(replaceWord)){
                        queue.offer(new PairWord(replaceWord, steps+1));
                        st.remove(replaceWord);
                    }
                }
            }
        }
        return 0;
    }

}

 class PairWord{
    String word;
    int steps;
    public PairWord(String word, int steps){
        this.word = word;
        this.steps = steps;
    }
    public String getWord(){return word;}
     public int getSteps(){return steps;}
}
