class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length-1;
        int right[]=new int[n+1];
        int left[]=new int[n+1];
        
        right[0]=1;
        left[n]=1;
        
        for(int i=1;i<=n;i++){
            right[i]=right[i-1]*nums[i-1];//{1(initialized),1,2,6}
        }
        for(int i=n;i>=1;i--){
            left[i-1]=left[i]*nums[i];//{24,12,4,1(initialized)}
        }
        for(int i=0;i<=n;i++){
            nums[i]=left[i]*right[i];//{24,12,8,6}
        }
        return nums;
    }
}