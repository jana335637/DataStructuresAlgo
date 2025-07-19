package Heap;

public class Heapify {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        //heapify(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public void heapify(int[] nums, int ind, int val) {
        if(nums[ind] > val) {
            nums[ind]=val;
            heapifyUp(nums, ind);
        } else if(nums[ind] < val) {
            nums[ind]=val;
            heapifyDown(nums, ind);
        }
    }

    private void heapifyDown(int[] nums, int ind) {
        int leftChild = 2*ind+1, rightChild = 2*ind+2;
        int smallest_ind = ind;
        if(leftChild< nums.length && nums[leftChild]<nums[ind]) {
            smallest_ind = leftChild;
        }
        if(rightChild< nums.length && nums[rightChild]<nums[smallest_ind]) {
            smallest_ind = rightChild;
        }
        if(smallest_ind != ind) {
            swap(nums, ind, smallest_ind);
            heapifyDown(nums, smallest_ind);
        }
    }

    void heapifyUp(int[] nums, int ind){
        int parent = (ind-1)/2;
        if(parent>=0 && nums[parent]>nums[ind]){
            swap(nums, parent, ind);
            heapifyUp(nums, parent);
        }
    }

    private void swap(int[] nums, int parent, int ind) {
        int temp = nums[parent];
        nums[parent] = nums[ind];
        nums[ind] = temp;
    }

}
