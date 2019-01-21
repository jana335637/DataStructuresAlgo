package SI.BIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class ReverseBits {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        Calendar c= Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");

        //c.add(Calendar.DATE,d);
        int testCases=in.nextInt();
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"Thursday");
        map.put(1,"Friday");
        map.put(2,"Saturday");
        map.put(3,"Sunday");
        map.put(4,"Monday");
        map.put(5,"Tuesday");
        map.put(6,"Wednesday");
        for (int i = 0; i < testCases ; i++) {
            int s = in.nextInt();
            int d = (s/86400);
            c.set(1970,0,1,0,0,0);
            c.add(Calendar.DATE,d);
            int day = d%7;
            String print = sdf.format(c.getTime());
            print=print.toUpperCase();
            System.out.println(print+" "+map.get(day));
        }
    }
}
