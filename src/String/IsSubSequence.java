package String;

public class IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() ==0) return true;
        if( t.length()==0) return false;

        int current=0, last = t.indexOf(s.charAt(0));
        if(last==-1) return false;
        t=t.replaceFirst(t.substring(last,last+1),"0");
        for (int i = 1; i < s.length(); i++) {
            int deltaIndex = t.substring(last).indexOf(s.charAt(i));
            if(deltaIndex == -1) return false;
            current = last+ deltaIndex;
            String sub = t.substring(current,current+1);
            t=t.replaceFirst(sub,"0");
            System.out.println(t);
            last= current;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsSubSequence().isSubsequence("abc","ahbgdc"));
    }
}
