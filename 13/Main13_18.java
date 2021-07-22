public class Main13_18 {
    
    public static void main(String[] args) {

        /*
            - 2020 카카오 신입 공채 1차

            '('와 ')'로만 이루어진 문자열이 있을 경우, '('의 개수와 ')'의 개수가 같다면 이를 균형잡힌 괄호 문자열.
            이라고 부른다. 그리고 여기에 '('와 ')'의 괄호의 짝도 모두 맞을 경우에는 이를 올바른 괄호 문자열.
            이라고 부른다.
            ex) "(()))(" 와 같은 문자열은 "균형잡힌 괄호 문자열"이지만 올바른 괄호 문자열은 아니다.
            반면 "(())()" 와 같은 문자열은 "균형잡힌 괄호 문자열"이면서 동시에 올바른 괄호 문자열이다.
            '('와 ')'로만 이루어진 문자열 w가 "균형잡긴 괄호 문자열" 이라면 다음과 같은 과정을 통해
            올바른 괄호 문자열로 변환할 수 있다.

            1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
            2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v 로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상
            분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.
            3. 수행할 결과 문자열을 u에 이어 붙인 후 반환합니다.
            3-1. 문자열 u가 "올바른 괄호 문자열"이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
            4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
            4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
            4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
            4-3. ')'를 다시 붙입니다.
            4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
            4-5. 생성된 문자열을 반환합니다.

            "균형잡힌 괄호 문자열" p가 매개변수로 주어질 때, 주어진 알고리즘을 수행해 "올바른 괄호 문자열"로
            변환한 결과를 return 하도록 solution 함수를 작성하시오.
        */
        System.out.println("1-----------");
        System.out.println(solution("(()())()"));
        System.out.println("2-----------");
        System.out.println(solution(")("));
        System.out.println("3-----------");
        System.out.println(solution("()))((()"));
    }

    public static String solution(String p) {
        String answer = "", u, v;
        String[] list;
        int L_Value=0, R_Value=0;

        list = new String[p.length()];

        for(int i=0; i<list.length; i++) {
            list = p.split("");
        }

        for(int i=0; i<p.length(); i++) {
            if(list[i].equals("(")) {
                answer += list[i];
                L_Value++;
            }
            else{ 
                answer += list[i];
                R_Value++;
            }

            if(L_Value == R_Value) {
                System.out.println(L_Value + " ==  " + R_Value + ", " + answer);
                checkPoint(answer);
            }
        }
        return answer;
    }

    public static void checkPoint(String str) {

    }

}
