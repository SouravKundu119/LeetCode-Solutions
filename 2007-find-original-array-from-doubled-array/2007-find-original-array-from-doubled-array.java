class Solution {
    public int[] findOriginalArray(int[] changed) {
        //doubled array mush have even length
        if(changed.length % 2 == 1)return new int[]{};
        
        int[] res=new int[changed.length/2];
        
        int max=Integer.MIN_VALUE,j=0;
        //find the max number in the array
        //for(int num:changed)max=Math.max(max,num);
        
        int freq[]=new int[200005];
        //find the frequency of all the elements
        for(int num:changed)freq[num]+=1;
        
        //iterate till the max number
        for(int i=0;i<200005;i++){
            //checking if the count of number i exists
            if(freq[i]>0){
                //decrease it by 1
                freq[i]-=1;
                
                //now checking if the doubled value exits
                if(freq[i*2]>0){
                    //decrease by 1
                    freq[i*2]-=1;
                    
                    //store the number in the result
                    res[j++]=i--;
                }
                else{
                    return new int[]{};
                }
                
            }
        }
        return res;
        
        
    }
}