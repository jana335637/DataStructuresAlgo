package DP;

public class NinjaTraining {
    public int maximumPoints(int arr[][], int N) {
        int[] prev= new int[4];
        prev[0] = Math.max(arr[0][1], arr[0][2]);
        prev[1] = Math.max(arr[0][0], arr[0][2]);
        prev[2] = Math.max(arr[0][0], arr[0][1]);
        prev[3] = Math.max(arr[0][0], Math.max(arr[0][1], arr[0][2]));
        for (int day = 1; day < N; day++) {
            int[] tmp = new int[4];
            for (int last = 0; last < 4; last++) {
                tmp[last] = 0;
                for (int task = 0; task < 3; task++) {
                    if(last!=task)
                        tmp[last] = Math.max(tmp[last], arr[day][task]+prev[task]);
                }
            }
            prev=tmp;
        }
        return prev[3];
    }
}
