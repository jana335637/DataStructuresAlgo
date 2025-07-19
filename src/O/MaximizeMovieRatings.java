package O;

public class MaximizeMovieRatings {
    public static void main(String[] args) {
        int[] arr = {9,-7,8,-9,-10,-11,-12,-1,-6,-7,-1,1,2,3,4,5};
        int[] ans = new int[arr.length];
        int n = arr.length;
        System.out.println(maximizeRatings(arr));
    }
    public static int maximizeRatings(int[] arr) {
        int sum = 0, start, end;
        if(arr.length == 1) return arr[0];
        //if(arr.length == 2) return Math.max(Math.max(arr[0], arr[1]), arr[0]+arr[1]);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                sum+=arr[i];
            } else {
                if(i+1 < arr.length && arr[i+1] > 0){
                    continue;
                } else if(i+1 < arr.length && arr[i+1] < 0){
                    start =i;
                    while(i<arr.length && arr[i]<0){
                        i++;
                    }
                    end = i-1;
                    i--;
                    sum+=getMaxFromNegatives(arr, start, end);
                }
            }
            System.out.println(sum);
        }
        return sum;
    }

    private static int getMaxFromNegatives(int[] arr, int start, int end) {
        int temp = start, sum = 0, sum1=0;
        for (int i = start; i <=end ; i=i+2) {
            sum += arr[i];
            if(i+1 <= end)
                sum1 += arr[i+1];
        }
        System.out.println("sum:"+sum+", sum1:"+sum1);
        return Math.max(sum, sum1);
    }
}
