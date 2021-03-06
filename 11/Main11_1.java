import java.util.*;

class Main11_1 {
    public static int N, result=0;
    public static int[] list;
    public static boolean[] visited;

    public static void main(String[] args) {
        /*
            모험가가 N명 있다. N명의 모험가를 대상으로 '공포도'를 측정했는데, '공포도'가 높은 모험가는 쉽게 공포를 느껴
            위험 상황에서 제대로 대처할 능력이 떨어진다. 구성원을 안전하게 구성하고자 
            공포도가 X인 모험가는 반드시 X명 이상으로 구성한 그룹에 참여해야 한다고 규정했다. 
            N명의 모험가에 대한 정보가 주어졌을 때, 최대 몇 개의 그룹을 만들 수 있는지 구하는 프로그램을 작성하시오.
            ex)
            N = 5일 때
            공포도가 2 3 1 2 2라면 최대 2개의 그룹을 만들 수 있다.
        */

        Scanner scanner = new Scanner(System.in);
/*

5
2 3 1 2 2

*/
        N = scanner.nextInt();
        list = new int[N];
        visited = new boolean[N];

        for(int i=0; i<N; i++) {
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);

        int number = 0;
        int index = 0;

        // System.out.println(Arrays.toString(list));

        for(int i=0; i<N; i++) {
            number = list[index];
            if (list[index + number - 1] <= number) {
                index += number;
                result += 1;
            }
        }

        System.out.println(result);

    


    }
    
}
