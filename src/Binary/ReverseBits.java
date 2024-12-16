package Binary;

public class ReverseBits {
    public static void main(String[] args) {
        //System.out.println(reverseBits(00000010100101000001111010011100));
    }
    public static int reverseBits(int n) {
        String binary="";
        while(n>0){
            binary+=(n%2);
            n=n/2;
        }
        if(binary.length()<32){
            int diff = 32 - binary.length();
            if(diff > 0 ){
                for (int i = 0; i < diff; i++) {
                    binary +=0;
                }
            }
        }
        System.out.println(binary);
        int b = 31, res = 0;
        int pow = 0;
        while(b >= 0 ){
            int remainder = binary.charAt(b);
            res += (remainder*Math.pow(2,pow));
            pow++;
            b--;
        }
        System.out.println(res);
        System.out.println(res);
        return (int) res;
    }
}
