public class StringPermutations {
    static int count=0;
    static int stringCount=0;
    public static void main(String[] args) {
        String str = "abcd";
        int l=0,n=str.length();
        permute(str,l,n-1);
        System.out.println(count+"Count");

    }
    private static void permute(String str,int l,int r){
        //System.out.println(str+" "+l+" "+r);
        if(l==r){
            System.out.println(stringCount+++"."+str);
           // System.out.println(count);
        }
        else{
            for (int i = l; i <= r; i++) {
               // System.out.println("Start of loop");
                str = swap(str,l,i);
                permute(str,l+1,r);
               // System.out.println("Before swapping l:" +l+" i:"+i);
                str = swap(str,l,i);
               // System.out.println("After swapping: " +str);
                count++;
            }
        }
    }
    static String swap(String str,int l,int i)
    {
        char[] chars = str.toCharArray();
        char tempChar = chars[l];
        chars[l]=chars[i];
        chars[i]=tempChar;
        return String.valueOf(chars);
    }
}
