package String;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
        String[] arr = s.split(" ");
        for (int i = arr.length; i >= 0; i--) {
            if(arr[i].length()!=0) return arr[i].length();
        }
        System.out.println(arr);
        return 0;
    }

    public static void main(String[] args) {
        String s= "   fly me   to   the moon  ";
        System.out.println(s.split(" "));
        System.out.println("   fly me   to   the moon  ");

    }
}
