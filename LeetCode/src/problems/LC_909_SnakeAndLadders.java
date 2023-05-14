package src.problems;

import java.util.LinkedList;
import java.util.Queue;

public class LC_909_SnakeAndLadders {

    public int bfs(int[] arr,int n)
    {
        boolean[] visited=new boolean[n*n];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        int steps=0;
        while(!q.isEmpty())
        {
            int size=q.size();

            for(int i=0;i<size;i++)
            {
                int val=q.poll();
                if(val==n*n-1) return steps;

                for(int next=val+1;next<=Math.min(val+6,n*n-1);next++)
                {
                    int move=arr[next]>-1?arr[next]:next;
                    if(!visited[move])
                    {
                        visited[move]=true;
                        q.add(move);
                    }
                }
            }
            steps++;
        }

        return -1;
    }
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        int[] arr=new int[n*n]; int index=0;
        int i=n-1,j=0,dir=1;

        while(i>=0)
        {
            arr[index++]=board[i][j]==-1?-1:board[i][j]-1;
            if(dir==1 && j==n-1)
            {
                dir=-1;
                i--;
            }
            else if(dir==-1 && j==0)
            {
                dir=1;
                i--;
            }
            else
            {
                j+=dir;
            }
        }

        return bfs(arr,n);
    }

//    public static void main(String[] args) {
//        System.out.println(snakesAndLadders(new int[][] {
//                {-1,1,2,-1},
//                {2,13,15,-1},
//                {-1,10,-1,-1},
//                {-1,6,2,8}
//        }));
//    }
//
//    static class Graph {
//        int v;
//        List<Set<Integer>> adjList;
//        public Graph(int v) {
//            this.v = v;
//            adjList = new ArrayList<>();
//            for(int i=0; i<=v; i++) {
//                adjList.add(new HashSet<>());
//            }
//        }
//
//        public void addEdge(int v, int e) {
//            adjList.get(v).add(e);
//        }
//
//        public int bfs(int start, int end) {
//            int[] traversed = new int[v+1];
//            Arrays.fill(traversed, -1);
//            traversed[1] = 0;
//            Queue<Integer> queue = new LinkedList<>();
//            queue.add(start);
//            while(!queue.isEmpty()) {
//                int node = queue.poll();
//                for(int val: adjList.get(node)) {
//                    if(traversed[val] == -1) {
//                        traversed[val] = traversed[node] + 1;
//                        queue.add(val);
//                    }
//                }
//            }
//            return traversed[end];
//        }
//
//
//    }
//
//    public static int snakesAndLadders(int[][] board) {
//        int n = board.length;
//        int[] jumps = new int[n * n + 1];
//        int[][] snakeLadders = new int[n][n];
//        buildSnakeAndLadders(snakeLadders, n);
//        fillJumps(board, snakeLadders, jumps, n);
//        System.out.println(Arrays.deepToString(snakeLadders));
//        System.out.println(Arrays.toString(jumps));
//        Graph g = new Graph(n*n);
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=1; i<=n*n; i++) {
//            for(int j=1; j<=6; j++) {
//                int pos = i+j;
//                while(pos <= n*n) {
//                    if(map.containsKey(pos)) {
//                        pos = map.get(pos);
//                        break;
//                    }
//                    map.put(pos, pos + jumps[pos]);
//                    pos = map.get(pos);
//                }
//                map.clear();
//                if(pos <= n*n) {
//                    System.out.println(i + " " + j + " " + pos);
//                    g.addEdge(i, pos);
//                }
//            }
//        }
//        System.out.println(g.adjList);
//        return g.bfs(1, n*n);
//    }
//
//    public static int dfs(int[] jumps, int node, int[] dp, int n) {
//        if(node == n * n) return 0;
//        if(dp[node] != -1) return dp[node];
//        int ans = Integer.MAX_VALUE;
//        for(int i=node+1; i<=node+6; i++) {
//            if(i <= n*n && i + jumps[i] <= n*n) {
//                ans = Integer.min(ans, 1 + dfs(jumps, i+jumps[i], dp, n));
//            }
//        }
//        dp[node] = ans;
//        return dp[node];
//    }
//
//    public static void fillJumps(int[][] board, int[][] snakeLadders, int[] jumps, int n) {
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<n; j++) {
//                if(board[i][j] != -1) {
//                    int index = snakeLadders[i][j];
//                    jumps[index] = board[i][j] - index;
//                }
//            }
//        }
//    }
//
//    public static void buildSnakeAndLadders(int[][] snakeLadders, int n) {
//        int val = 1;
//        int j = 0;
//        for(int i=n-1; i>=0; i--) {
//            if(j <= 0) {
//                for(j=0; j<n; j++) {
//                    snakeLadders[i][j] = val++;
//                }
//            }
//            else {
//                for(j=n-1; j>=0; j--) {
//                    snakeLadders[i][j] = val++;
//                }
//            }
//        }
//    }

}
