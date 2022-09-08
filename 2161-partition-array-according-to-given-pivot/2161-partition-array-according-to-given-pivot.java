class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[]=new int[nums.length];
        int idx=0;
        for(int i:nums){
            if(i<pivot)
            arr[idx++]=i;
        }
        for(int i:nums){
            if(pivot==i)
                arr[idx++]=i;
        }
        for(int i:nums){
            if(i>pivot)
                arr[idx++]=i;
        }
        return arr;
    }
}