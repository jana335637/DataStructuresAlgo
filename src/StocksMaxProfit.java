import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class StocksMaxProfit {
    public static void main(String[] args) {
        ArrayList<Stock> stocks = new ArrayList<>();
        try {
            stocks.add(new Stock(new SimpleDateFormat("mm/dd/yyyy").parse("1/3/2019"),10));
            stocks.add(new Stock(new SimpleDateFormat("mm/dd/yyyy").parse("1/4/2019"),20));
            stocks.add(new Stock(new SimpleDateFormat("mm/dd/yyyy").parse("1/5/2019"),50));
            stocks.add(new Stock(new SimpleDateFormat("mm/dd/yyyy").parse("1/6/2019"),40));
            stocks.add(new Stock(new SimpleDateFormat("mm/dd/yyyy").parse("1/7/2019"),150));
            stocks.add(new Stock(new SimpleDateFormat("mm/dd/yyyy").parse("1/8/2019"),140));
            Date buyDate=stocks.get(0).getDate(),sellDate=stocks.get(0).getDate();
            int maxProfit=-1,minPrice=stocks.get(0).price;
            for (int i = 0; i < stocks.size(); i++) {
                int currentPrice = stocks.get(i).getPrice();
                if(minPrice>currentPrice)
                {
                    minPrice=currentPrice;
                    buyDate =stocks.get(i).getDate();
                }
                if(maxProfit<(currentPrice-minPrice)) {
                    maxProfit = (currentPrice - minPrice);
                    sellDate = stocks.get(i).getDate();
                }
            }
            System.out.println("Sell date"+sellDate+": Buy Date"+buyDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
class Stock{
    Date date;
    int price;
    Stock(Date date,int price){
        this.date = date;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public Date getDate(){
        return date;
    }
}
