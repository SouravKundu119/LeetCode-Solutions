class Solution {
    public void sortColors(int[] nums) {
        //Without using the in-built sort function
        int a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)a+=1;
            else if(nums[i]==1)b+=1;
            else c+=1;
        }
        for(int i=0;i<nums.length;i++){
            if(a>0){
                nums[i]=0;
                a--;
            }
            else if(b>0){
                nums[i]=1;
                b--;
            }
            else{
                nums[i]=2;
                c--;
            }
        }
    }
}