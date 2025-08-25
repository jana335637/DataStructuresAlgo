package Array;

public class ContainerWIthMostWater {
    public static void main(String[] args) {
    }

    public int maxArea(int[] arr) {
        int total = 0, lmax = arr[0], rmax = arr[arr.length - 1];
        int l = 0, r = arr.length;
        while (l < r) {
            if (arr[l] <= arr[r]) {
                if (arr[l] < lmax)
                    total += (lmax - arr[l]);
                else
                    lmax = arr[l];
                l++;
            } else {
                if (arr[r] < rmax)
                    total += (rmax - arr[r]);
                else
                    rmax = arr[r];
                r--;
            }
        }
        return total;
    }
}
