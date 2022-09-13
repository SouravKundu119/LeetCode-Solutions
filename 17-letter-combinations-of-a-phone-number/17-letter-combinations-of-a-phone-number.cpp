class Solution {
public:
    vector<string> letterCombinations(string digits) {
        vector<string> ans;
        if(digits.length()==0)return ans;
        
        string res="";
        int index=0;
        string vec[10] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(ans,digits,res,index,vec);
        return ans;
    }
    
    void helper(vector<string> &ans,string digits,string res,int index,string vec[]){
        if(index>=digits.length()){//base case
            ans.push_back(res);
            return;
        }
        int num=digits[index]-'0'; //taking out the number from the given string
        string value=vec[num];   //Map that number from our mapping array and get the                   corresponding string (Eg. '2' = "abc")
        
        for(int i=0;i<value.length();i++){
            res.push_back(value[i]);
            helper(ans,digits,res,index+1,vec);
            res.pop_back();
        }
        
    }
};