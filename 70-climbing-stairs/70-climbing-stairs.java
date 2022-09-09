class Solution {
    public int climbStairs(int n) {
        int a = 0, b = 2, c = 1;
		Map<Integer, Integer> fibonicSeries = new HashMap<Integer, Integer>();
		fibonicSeries.put(1, c);
		fibonicSeries.put(2, b);
		for (int 	i = 3; i < 46; i++) {
			a = b + c;
			c = b;
			b = a;
			fibonicSeries.put(i, a);

		}
		return fibonicSeries.get(n);
    }
}