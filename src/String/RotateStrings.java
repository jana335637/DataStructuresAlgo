package String;

public class RotateStrings {
    public boolean rotateString(String s, String goal) {
        //your code goes here
        if(s.length() != goal.length()) return false;
        return (s+s).contains(goal);
    }
}
