class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merge[]=new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,merge,0,nums1.length);
        System.arraycopy(nums2,0,merge,nums1.length,nums2.length);
        Arrays.sort(merge);
        if(merge.length%2==0){
            return (merge[(merge.length/2)-1]+merge[(merge.length/2)])/2.0;
        }
        else{
            return merge[(merge.length/2)];
        }
    }
}