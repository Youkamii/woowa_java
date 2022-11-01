package onboarding;

import java.util.Stack;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        char[] strtmp = cryptogram.toCharArray();
        int flag = 0;
//        Stack stackAnswer = new Stack<>();
        char[] answerArr = new char[1000];
        int count = 0;

        if (cryptogram.length() < 1 && cryptogram.length() > 1000) {
            return ("");
        } else {
            for (int i = 0; i < cryptogram.length(); i++) {
                if (!((strtmp[i] >= 65 || strtmp[i] <= 90) && !(strtmp[i] >= 97 || strtmp[i] <= 122)))
                    return ("");
            }
        }
        /*
            예외처리
            1. 문자열 길이
            2. 대문자, 소문자
        */
        for (int i = 0; i < cryptogram.length(); i++) {
            if (strtmp[i] != 0) {
                flag = 1;
                for (int j = i + 1; j < cryptogram.length() - i; j++) {
                    if (strtmp[j] == strtmp[i]) {
                        strtmp[j] = '0';
                        if (flag == 1)
                            flag = 0;
                        else
                            flag = 1;
                    }
                }
                if (flag == 1) {
//                    stackAnswer.add(strtmp[i]);
                    answerArr[count] = strtmp[i];
                    count++;
                }
            }
            /* 중복 제거 */
        }
        answer = answerArr.toString();
        return answer;
    }
}
