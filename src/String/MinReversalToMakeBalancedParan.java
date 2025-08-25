package String;

public class MinReversalToMakeBalancedParan {
    public static void main(String[] args) {
        System.out.println("HI");
    }

    public int minAddToMakeValid(String s) {
        if(s.length()%2 == 1){
            return -1;
        }
        int open=0, close=0, res=0;
        for(char ch : s.toCharArray()){
            if(ch == '(') open++;
            else {
                if(open > 0 ) open --;
                else close++;
            }
        }
        return (open / 2) + (open %2) +  (close/2) + (close %2);
    }
}
