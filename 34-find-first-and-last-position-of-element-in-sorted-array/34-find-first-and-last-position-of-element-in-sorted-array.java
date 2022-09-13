class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=bsearch(nums,target,true);
        if(ans[0]!=-1)ans[1]=bsearch(nums,target,false);
        return ans;
    }
    public static int bsearch(int[] nums,int target,boolean first_index){
        int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target)end=mid-1;
            else if(nums[mid]<target)start=mid+1;
            else{
                ans=mid;
                if(first_index)end=mid-1;
                else
                start=mid+1;
            }
        }
        return ans;
    }
}