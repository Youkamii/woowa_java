package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        int pobi_100, pobi_10, pobi_1, pobi_scr;
        int crong_100, crong_10, crong_1, crong_scr;

        1 <= n <= 400
        if (!(1 <= pobi.get(0) && pobi.get(0) <= 400 && 1 <= pobi.get(1) && pobi.get(1) <= 400 &&
                1 <= crong.get(0) && crong.get(0) <= 400 && 1 <= crong.get(1) && crong.get(1) <= 400))
            return -1;
        else if (pobi.get(0) >= pobi.get(1) && pobi.get(0) + 1 != pobi.get(1))
            return -1;
        else if (crong.get(0) >= crong.get(1) && crong.get(0) + 1 != crong.get(1))
            return -1;
        /* 1. 예외 처리 */m
        return answer;
    }
}
/*
필요한 기능
1. 예외 처리
    1) 입력받은 페이지가 연속적이지 않을 경우
    2) 입력받는 페이지의 짝수가 홀수보다 작을 경우
    3) 입력받는 페이지가 1-400의 범위를 벗어날 경우
    -1 을 return하고 프로세스 종료.
2. pobi와 crong로 입력받은 숫자의 각 자릿수를 더하기
3. pobi와 crong로 입력받은 숫자의 각 자릿수를 곱하기
4. 2. 와 3. 의 값을 비교하여 나온 값 중 각각 큰 수를 구하기
5. 4. 에서 구해진 값을 비교하여
    1) pobi의 수와 crong의 수가 같으면 0을 return
    2) pobi의 수가 crong의 수보다 크면 1을 return
    3) pobi의 수가 crong의 수보다 작으면 2를 return
 */