//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int[] source = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                source[i] = x;
            }
            int[] dest = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                dest[i] = x;
            }
            Solution ob = new Solution();
            int ans = ob.shortestPath(grid, source, dest);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java



class Solution {

    public static class Pair{

        int r;

        int c;

         Pair(int r,int c)

        {

            this.r=r;

            this.c=c;

        }
}
    int shortestPath(int[][] grid, int[] s, int[] d) {

        // Your code here
         int [][]visited = new int[grid.length][grid[0].length];

        Queue<Pair> q = new ArrayDeque<>();

        int dis=1;

        q.add(new Pair(s[0],s[1]));

        q.add(new Pair(-1,-1));

        visited[s[0]][s[1]]=1;

        int dx[] ={-1,0,1,0};

        int dy[] ={0,1,0,-1};

        if(s[0]==d[0] && s[1]==d[1])

        {

            return 0;

        }

        while(q.size()!=0)

        {

            Pair p  = q.remove();

            int i= p.r;

            int j = p.c;

            if(i==-1 && j==-1)

            {

                dis++;

                if(q.size()==0)

                {

                    return -1;

                }

                  q.add(new Pair(-1,-1));

            }

            for(int k=0;k<4;k++)

            {

                int nr = i+dx[k];

                int nc = j+dy[k];

                if(nr==d[0] && nc==d[1] && grid[nr][nc]==1)

                {

                    return dis;

                }

                if(nr>=0 && nc>=0 &&  nr<grid.length && nc<grid[0].length && grid[nr][nc]==1 && visited[nr][nc]==0)

                {

                    q.add(new Pair(nr,nc));

                    visited[nr][nc]=1;

                }

            }

            

        }

        return -1;

        

    
    }
}
