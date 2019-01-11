import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by pillutja on 1/22/2018.
 */
public class Practice {
    {
        System.out.println("Instance block");
    }

    Practice() {
        System.out.println("Practice Constructor");
    }

    void Practice() {
        System.out.println("Practice method");
        System.out.println();
    }

    static int tryReturn() {
        try {
            //throw new Exception();
            return 1;
        } finally {
            System.out.println("finally block executed");
        }
    }

    public static void main(String[] args) throws IOException, CloneNotSupportedException {

        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings.contains("jana"));
        //System.out.println("889".compareTo("898"));
        /*System.out.println(tryReturn());
        System.out.println(sum(1,2.0));
        B obj = new B();
        obj.sum(1,2);
        obj.getObject(obj);
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] a2 = array.clone();
        for (int n : a2) {
            System.out.println(n);
        }
        B b = (B)obj.clone();
        System.out.println(b.sum(3,4));*/

        //return 2;
        /*int x= -4;
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
        System.out.println(matrix.length + " "+ matrix[0].length );*/
        /*System.out.println(e.d);
        Date sysDate = new Date(),validationDate=new Date("05/31/2019");
        System.out.println(sysDate +" "+ validationDate+ " "+ validationDate.after(sysDate));
        Calendar aCalendar = Calendar.getInstance();
        System.out.println(aCalendar);*/
        rec(1);
    }

    private static void rec(int i) {
        if (i == 8) return;
        /*if(i!=4) return i;*/
        rec(i + 1);
        if(i<=4)
            return;
        System.out.println(i + " ");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(int a, double b) {
        return a + b;
    }
}

class A {
    public int sum(int a, int b) {
        System.out.println("A sum:::::::");
        return a + b;
    }

    A getObject(A a) {
        sum(1, 2);
        return this;
    }
}

class B extends A implements Cloneable {
    public int sum(int a, int b) {
        System.out.println("B Sum:::::::::::::");
        return a + b;
    }

    B getObject(B a) {
        sum(1, 2);
        return this;
    }
}

class e {
    static Date d = new Date();

}

