class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        int i=0,j=len-1;
        int max=0;
        while(i<j){
            int min=Math.min(height[i],height[j]);
            max=Math.max(max,min*(j-i));//max water*distance
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}