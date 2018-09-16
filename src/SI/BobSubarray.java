package SI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BobSubarray {
    public static void main(String[] args) {
        int ite=0;
        Scanner in  = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
        }
        long sum=0,or,por;
        for (int i = 0; i < size ; i++) {
            or=arr[i];
            sum+=or;
            //System.out.println(sum);
            int zeroBits = getZeroBits(or);
            for (int j = i+1; j < size; j++) {
                if(zeroBits>0 || (arr[j]>or)){
                    //System.out.println(ite+++":"+"Successs");
                    por = or;
                    or |= arr[j];
                    sum += or;
                    //System.out.println(sum);
                    if((por ^ or) >0)
                        zeroBits=getZeroBits(or);
                }
                else{
                    sum+=or;
                    //System.out.println(sum);
                }

            }
        }
        System.out.println(sum);
    }
    static int getZeroBits(long sum){
        int highSetBit=-1,zeroBits=0;
        for (int j = 63; j >=0 ; j--) {
            //System.out.println("value"+(((long)(1l<<j) & (sum)))+"compa:"+((long)(1l<<j))+"OR:"+sum);
            if(((long)(1l<<j) & (sum)) == (long)(1l<<j)){
                highSetBit=j;
                break;
            }
        }
        //System.out.println("OR::::::"+sum+",High Bit"+highSetBit);
        for (int j = 0; j <= highSetBit ; j++) {
            if(((long)(1l<<j) & (sum))==0)
                zeroBits++;
        }
        //System.out.println("zeroBits"+zeroBits);
        return zeroBits;
    }

}
