import java.util.Arrays;

public class ArraysProblems {
    public static void main(String[] args) {
        int[] stocks = {90, 80, 70, 60, 200,100,400};
        //getProfitinStocks(stocks);
        int maxProfit = 0,currentProfit=0;
        for (int i = 1; i < stocks.length-2; i++) {
            currentProfit = (getProfitinStocks(stocks, 0, i+1) + getProfitinStocks(stocks, i+1, stocks.length));
            if (maxProfit < currentProfit){

                maxProfit = currentProfit;
            }
        }
        if(maxProfit==0)
        {
            System.out.println("There is no possibility to get profit");
        }
        else {
            System.out.println("Max profit is "+maxProfit);
        }
    }

    private static int getProfitinStocks(int[] stocks,int start,int end) {
        System.out.println("LENGTH ------------"+(end-start));
        System.out.println("indexes:"+start+":end:"+end);
        int min = stocks[start], maxProfit = 0,minIndex=start,maxIndex=start;
        for (int i = start; i < end; i++) {
            if (stocks[i] < min) {
                min = stocks[i];
                minIndex=i;
            }
            if(maxProfit<(stocks[i]-min)){
                maxIndex=i;
                maxProfit = stocks[i]-min;}
        }
        if(maxProfit==0)
        {
            //System.out.println("There is no possibility to get profit");
            return 0;
        }
        else {
            System.out.println("Max profit is "+maxProfit);
            System.out.println("Buy at "+stocks[minIndex]+",and sell at "+stocks[maxIndex]);
            return maxProfit;
        }
    }

}
