import java.util.*;

class Main23_1 {
    public static int N, M, V, X, Y;
    public static int[][] map;
    public static boolean[] visited;
    public static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {

        // 백준 온라인 저지 DFS/BFS(23)의 1번
        
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt(); // 정점의 개수
        M = scanner.nextInt(); // 간선의 개수
        V = scanner.nextInt(); // 시작 정점

        map = new int[1001][1001];
        visited = new boolean[1001];

        for(int i=1; i<=M; i++ ){
            X = scanner.nextInt();
            Y = scanner.nextInt();

            map[X][Y] = 1;
            map[Y][X] = 1;
            
        }

        DFS(V);
        visited = new boolean[1001];
        System.out.println();

        BFS();
        
    }

    public static void DFS(int i) {
        visited[i] = true;
        System.out.print(i + " ");

        for(int j=1; j<=M; j++) {
            if(map[i][j] == 1 && visited[j] == false) {
                DFS(j);
            }
        }
    }

    public static void BFS() {
        visited[V] = true;
        queue.offer(V);
        System.out.print(V + " ");

        while(!queue.isEmpty()) {
            int temp = queue.poll();

            for(int j=1; j<=M; j++) {
                if (map[temp][j] == 1 && visited[j] == false) {
                    visited[j] = true;
                    System.out.print(j + " ");
                    queue.offer(j);
                }
            }
        }
    }
}