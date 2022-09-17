class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int merge[]=new int[nums1.length+nums2.length];
        
        System.arraycopy(nums1,0,merge,0,nums1.length);//Copy the first array
        
        System.arraycopy(nums2,0,merge,nums1.length,nums2.length);//Copy the second array
        
        Arrays.sort(merge);//sort the merge array(merge of both)
        
        if(merge.length%2==0){//checking if the length is even
            
            return (merge[(merge.length/2)-1]+merge[(merge.length/2)])/2.0;
            
        }
        else{//if the length is odd
            
            return merge[(merge.length/2)];
            
        }
        
    }
    
}