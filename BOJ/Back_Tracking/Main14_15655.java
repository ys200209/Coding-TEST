import java.util.*;
import java.io.*;

public class Main14_15655 {
    static String str = "";
    static int N, M;
    static int[] A;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        int i=0;
        while(st.hasMoreTokens()) {
            A[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(A);

        DFS(0, 0);
        
        System.out.println(sb);
    }

    public static void DFS(int index, int count) {
        if (count == M) {
            sb.append(str + "\n");
            return;
        }

        for(int i=index; i<N; i++) {
            String num = Integer.toString(A[i]);
            str += (num + " ");
            DFS(i+1, count+1);
            str = str.substring(0, str.length() - (num.length()) - 1);
        }
    }

}
