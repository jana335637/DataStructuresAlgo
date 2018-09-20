package SI;

import java.util.Scanner;

public class NumberOfValidSubArrays {
    public static void main(String[] args) {
        /*System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);*/
     Scanner in = new Scanner(System.in);
    int n= in.nextInt();
        for (int i = 0; i < n; i++) {
            int size =in.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j]=in.nextInt();
            }
            int count=0;
            for (int j = 0; j < size-1; j++) {
                int nOne=0,nZero=0,k=j;
                for (; k < 2+j ; k++) {
                    if(array[k]==1)
                        nOne++;
                    else
                        nZero++;
                }
                if(nOne==nZero)
                    count++;
                for (int l=4; l <=(size-j) ; l+=2) {
                    if(array[k++]==1)
                        nOne++;
                    else
                        nZero++;
                    if(array[k++]==1)
                        nOne++;
                    else
                        nZero++;
                    if(nOne==nZero)
                        count++;
                }
            }
            System.out.println(count);
/*
            for (int j = 0; j < size-1; j++) {
                int nOne=0,nZero=0;
                if(array[j]==1)
                    nOne++;
                else
                    nZero++;
                for (int k = j+1; k < size ; k++) {
                    if(array[k]==1)
                        nOne++;
                    else
                        nZero++;
                    if(((k-j)&1)==1)
                    {
                        if(nOne==nZero)
                            count++;
                    }
                }
            }
            System.out.println(count);
*/
        }
    }
    static long solve(int x,int l,int r){
        int xMSB=(int)(Math.log(x)/Math.log(2)),rMSB = (int)(Math.log(r)/Math.log(2));
        long max=Integer.MIN_VALUE;
        if(rMSB>xMSB){
            int end = ((1<<rMSB)>l)?(1<<rMSB):(l);
            for (int j = r; j >= end ; j--) {
                if(max<(x^j))
                    max=x^j;
            }
        }
        else{
            for (int j = r; j >= l ; j--) {
                if(max<(x^j))
                    max=x^j;
            }
        }
        return max;
    }
}
