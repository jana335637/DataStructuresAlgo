package Greedy;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five=0, ten=0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            }
            if (bills[i] == 10) {
                if(five>0){
                    five--;
                    ten++;
                }else return false;
            }
            if(bills[i] == 20){
                if(ten>0 && five>0){
                    five--;
                    ten--;
                } else if(five>=3){
                    five-=3;
                } else return false;
            }
        }
        return true;
    }
}
