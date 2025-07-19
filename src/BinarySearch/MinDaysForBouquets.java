package BinarySearch;

public class MinDaysForBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length, ans=0;
        long val =(long) m*k;
        if(val > n) return -1;
        int low=minElement(bloomDay), high=maxElement(bloomDay);
        while(low<=high){
            int mid = (low+high)/2;
            if(areDaysSufficient(bloomDay, m, k, mid)){
                    ans=mid;
                    high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

    private int minElement(int[] bloomDay) {
        int ans= bloomDay[0];
        for(int i=1;i<bloomDay.length;i++){
            if(bloomDay[i]<ans) ans=bloomDay[i];
        }
        return ans;
    }

    private boolean areDaysSufficient(int[] bloomDay, int m, int k, int day) {
        int adj=0;
        for (int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <= day){
                adj++;
            } else{
                m-=Math.floor(adj/k);
                adj=0;
            }
        }
        m-=Math.floor(adj/k);
        return m<=0;
    }

    private int maxElement(int[] bloomDay) {
        int ans = bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            ans = Math.max(ans, bloomDay[i]);
        }
        return ans;
    }
}
