class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> res=new ArrayList<>();
        res.add(1);
        long temp=1;
        for(int i=1,up=r,down=1;i<=r;i++,up--,down++){
            temp=temp*up/down;
            res.add((int)temp);
        }
        return res;
    }
}
    