package BinarySearch;

public class AggressiveCows {
    public static void main(String[] args) throws Exception {

        System.out.println(getValue(false));
        System.out.println("YES");
    }

    private static boolean getValue(boolean b)  throws Exception{
        if(b){
            if(true){
                return true;
            }
        } else {
            throw new Exception("value passed is false");
        }
        return false;
    }
}
