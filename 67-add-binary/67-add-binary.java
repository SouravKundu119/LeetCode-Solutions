import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger n1=new BigInteger(a,2); //to handle BIG numbers
        BigInteger n2=new BigInteger(b,2);
        BigInteger res=n1.add(n2);// to add two BIG numbers
        return res.toString(2);// to convert the BIG number to string type with base 2
    }
}