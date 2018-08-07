package HackerEarth;

import java.util.Scanner;

public class SpecialShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases>0)
        {
            double minCost=-1;
            int totalPots=scanner.nextInt();
            int aCost=scanner.nextInt();
            int bCost=scanner.nextInt();
            if(totalPots>0)
            {
                if(aCost==bCost)
                {
                    if(totalPots%2==0)
                    {
                        int x=totalPots/2;
                        minCost=aCost*(Math.pow(x,2)*2);
                    }
                    else{
                        int x=totalPots/2;
                        int y=totalPots-x;
                        minCost=aCost*(Math.pow(x,2)+Math.pow(y,2));
                    }
                }
                else if(aCost<bCost) {
                    minCost=calculateCost(totalPots,aCost,bCost);
                }
                else
                    minCost=calculateCost(totalPots,bCost,aCost);
            }
            testCases--;
            System.out.println((int)minCost);
        }
    }

    private static double calculateCost(int totalPots, int aCost, int bCost) {
        double minCost=-1;
        double calculatedCost;
        for (int i = totalPots/2; i >=0; i--) {
            int b=totalPots-i;
            calculatedCost= ((Math.pow(b,2)*aCost) + (Math.pow(i,2)*bCost));
            if(calculatedCost<minCost)
                minCost=calculatedCost;
            if(minCost==-1)
                minCost=calculatedCost;
        }
        return minCost;
    }
}