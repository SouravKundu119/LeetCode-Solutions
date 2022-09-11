class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        PriorityQueue<Integer> min_heap=new PriorityQueue<>();
        
        int[][] candidates=new int[n][2];
        
        for(int i=0;i<n;i++){//pair of efficiency and speed
            candidates[i]=new int[]{efficiency[i],speed[i]};
        }
        
        Arrays.sort(candidates, (a,b) -> Integer.compare(b[0],a[0]));
        
        //Sorting according to the efficiency
        long sum=0,ans=0;
        //Maintain a min_heap to track the minimum speed of the team.
        for(int[] pair:candidates){
            //Update performance after each loop.
            int cur_speed=pair[1];
            min_heap.add(cur_speed);
            
            if(min_heap.size() <= k){
                sum+=cur_speed;
            }
            else{
                sum+=cur_speed-min_heap.poll();
            }
            ans=Math.max(ans,sum*pair[0]);
        }
        return (int)(ans%1000000007);
    }
}