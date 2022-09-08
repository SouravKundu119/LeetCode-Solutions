class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        int i = 0;
        int[] ans = new int[k];
        // take the maximum frequent element and store it in array
        while (i < k) {
            // find the max key
            int max = findMax(map);
            ans[i] = max;
            //now remove the max key from map
            map.remove(max);
            i++;
        }
        return ans;
        
    }
    static int findMax(HashMap<Integer, Integer> map) {
        int val = -1;
        int max = 0;
        
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (max < key.getValue()) {
                val = key.getKey();
                max = key.getValue();
            }
        }
        return val;
    }
}