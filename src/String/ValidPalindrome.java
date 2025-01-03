package String;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.trim().length()==0) return true;
        int l=0, r=s.length()-1;
        while(l<=r){
            while(l < s.length() && !isAlphaNumeric(s.charAt(l))) l++;
            while(r >=0 && !isAlphaNumeric(s.charAt(r))) r--;
            System.out.println(s.substring(l,l+1));
            System.out.println(s.substring(r,r+1));
            if(l<s.length() && r>=0){
            if(s.substring(l,l+1).equalsIgnoreCase(s.substring(r,r+1))){
                l++;
                r--;
            } else {
                return false;
            }}
        }
        return true;
    }

    private static boolean isAlphaNumeric(char c) {
        return (c >= 'A'  && c<= 'Z') || (c >= 'a'  && c<= 'z') || (c >= '0'  && c<= '9');
    }


    public static void main(String[] args) {
        ValidPalindrome v  =new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(s.substring(s.length()-1, s.length()));
        System.out.println(v.isPalindrome(s));
        System.out.println(isAlphaNumeric(' '));
        System.out.println('A'+1-1 );
        System.out.println('Z'+1-1 );
        System.out.println('a'+1-1 );
        System.out.println('z'+1-1 );
        System.out.println('0'+1-1 );System.out.println('9'+1-1 );
        System.out.println("abc".indexOf("d"));
    }
}
