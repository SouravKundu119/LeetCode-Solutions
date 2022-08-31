class Solution {
    List<String> res=new ArrayList<>();
    public void helper(int n,int open,int close,String s){
        if(open==n && close==open){//Base Case
            res.add(s);
            return;
        }
        if(open<n){
            helper(n,open+1,close,s+'(');
        }
        if(close<open){
            helper(n,open,close+1,s+')');
        }
        
    }
    
    public List<String> generateParenthesis(int n) {
        helper(n,0,0,"");
        return res;
    }
}