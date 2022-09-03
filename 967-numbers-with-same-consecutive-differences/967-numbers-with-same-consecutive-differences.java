class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        Set<Integer> set=new HashSet<>();
        
        for(int i=1;i<=9;i++){
            helper(i+"",n-1,k,set);
        }
        
        int ans[]=new int[set.size()];
        
        int pos=0;
        
        for(int e:set)
            ans[pos++]=e;
        
        return ans;
    }
    public void helper(String s,int n,int k,Set<Integer> set){
        if(n==0){
            set.add(Integer.parseInt(s));
            return;
        }
        int num=s.charAt(s.length()-1)-'0';
        
        if(num+k<=9){
            helper(s+(num+k),n-1,k,set);
            
        }
        if(num-k>=0)
            helper(s+(num-k),n-1,k,set);
    }
}