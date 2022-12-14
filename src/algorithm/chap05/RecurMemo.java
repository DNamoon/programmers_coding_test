/**
 * 22.12.31
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.177 - 재귀 함수를 메모화로 구현.
 */
package algorithm.chap05;

public class RecurMemo {
    static String[] memo;

    //메모화를 도입한 recur 메서드
    static void recur(int n) {
        if(memo[n+1] != null)
            System.out.println(memo[n+1]);
        else {
            if(n>0) {
                recur(n-1);
                System.out.println(n);
                recur(n-2);
                memo[n+1] = memo[n] + n + "\n" + memo[n-1];  //메모화
            } else {
                memo[n+1] = ""; //메모화 -> recur(0)과 recur(-1)은 빈 문자열
            }
        }
    }
}
