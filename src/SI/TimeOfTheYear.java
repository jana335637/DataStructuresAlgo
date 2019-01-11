package SI;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TimeOfTheYear {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        Calendar c= Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");

        //c.add(Calendar.DATE,d);
        System.out.println(format.format(c.getTime()));
        int testCases=in.nextInt();
        for (int i = 0; i < testCases ; i++) {
            int s = in.nextInt();
            int d = (s/864000);
            c.set(1970,0,1,0,0,0);
            c.add(Calendar.DATE,d);
            System.out.println(format.format(c.getTime()));
        }
    }

    private static int findMissingNumber() {
        int sizeOfArray = in.nextInt();
        long userXOR =0,calculatedXOR = 0;
        int[] array = new int[sizeOfArray+1];
        for (int i = 0; i < sizeOfArray ; i++) {
            array[i]=in.nextInt();
            userXOR=userXOR^array[i];
        }
        for(int i=1;i<=sizeOfArray+1;i++)
            calculatedXOR=calculatedXOR^i;
        return (int) (calculatedXOR^userXOR);
    }
}
