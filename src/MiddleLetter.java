/**
 * 출처 : 프로그래머스 코딩테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12903
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 */
public class MiddleLetter {
    public static String solutioin(String s) {
        String answer = "";
        //answer += s.length()%2==0?s.substring((s.length()/2)-1,s.length()/2+1):s.substring(s.length()/2,s.length()/2+1);

        //보완
        int word = s.length();
        answer += word % 2 == 0 ? s.substring(word/2-1,word/2+1):s.substring(word/2,word/2+1);
        return answer;
    }
}
