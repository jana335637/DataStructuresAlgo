import java.util.Scanner;

public class Cforces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int e = 2*b+1;
        int c = a/e;
        int d = a%e;
        String s = "";
        if(d==0){
            System.out.println(c);
            for (int i=e;i<=a;i+=e){
                s = s+i+" ";
            }

        }else{
            System.out.println(c+1);
            for (int i=1;i<=a;i+=2*b+1){
                s = s+i+" ";
            }
        }
        System.out.println(s.trim());

    }

}
