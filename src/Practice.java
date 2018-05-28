import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pillutja on 1/22/2018.
 */
public class Practice {
    {
        System.out.println("Instance block");
    }
    Practice(){
        System.out.println("Practice Constructor");
    }
    void Practice(){
        System.out.println("Practice method");
        System.out.println();
    }
    public static void main(String[] args) throws IOException {

        int x= -4;
        String s="jana";
        System.out.println(s.equals("jana"));
        System.out.println((int)Math.sqrt(23));
        //Runtime.getRuntime().exec("notepad");
        System.out.println(
        Runtime.getRuntime().availableProcessors() + "Free memory:"+
        Runtime.getRuntime().freeMemory() + "Total Memory"+
        Runtime.getRuntime().totalMemory() );
        for (int i = 0; i < 10000; i++) {
            new Practice();
        }
        System.out.println("After creation of objects");
        System.out.println(
                Runtime.getRuntime().availableProcessors() + "Free memory:"+
                        Runtime.getRuntime().freeMemory() + "Total Memory"+
                        Runtime.getRuntime().totalMemory() );
        System.gc();
        System.out.println("After Garbage Collection");
        System.out.println(
                Runtime.getRuntime().availableProcessors() + "Free memory:"+
                        Runtime.getRuntime().freeMemory() + "Total Memory"+
                        Runtime.getRuntime().totalMemory() );
        String s1 = "adp";
        String s2 = "pvt";
        String s3 = "adp" + "pvt";
        String s4 = s1 + s2;
        String s5 = s1.concat(s2);
        String s6 = s1 + "pvt";
        String s7 = "adp" + "pvt";
        System.out.println( s3==s4);
        System.out.println( s3==s5);
        System.out.println( s3==s6);
        System.out.println( s3==s7);
        System.out.println(s3.hashCode() +" " +s4.hashCode()+" "+s5.hashCode()+" "+s6.hashCode());
        System.out.println(new SimpleDateFormat("yyyy-mm-dd").format(new Date()));
        Practice practice = new Practice();
        practice.Practice();
        int[][] matrix = new int[3][4];
        System.out.println(matrix.length + " "+ matrix[0].length );
    }
}
