package Heap;

public class BuildMinHeap {
    public void buildMinHeap(int[] nums) {
        for (int i = nums.length/2-1; i >=0 ; i--) {
            heapifyDown(nums, i);
        }
    }

    private void heapifyDown(int[] nums, int ind) {
        int leftChild = 2*ind+1, rightChild= 2*ind+2;
        int smallest_ind = ind;
        if(leftChild< nums.length && nums[leftChild]<nums[ind]) {
            smallest_ind = leftChild;
        }
        if(rightChild< nums.length && nums[rightChild]<nums[smallest_ind]){
            smallest_ind = rightChild;
        }
        if(smallest_ind != ind) {
            swap(nums, ind, smallest_ind);
            heapifyDown(nums, smallest_ind);
        }
    }

    private void swap(int[] nums, int ind, int smallestInd) {
        int temp = nums[ind];
        nums[ind] = nums[smallestInd];
        nums[smallestInd] = temp;
    }
}
