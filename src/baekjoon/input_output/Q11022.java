/**
 * 23.01.03
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력
 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
 * x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 * https://www.acmicpc.net/problem/11022
 */
package baekjoon.input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11022 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for(int i=0; i<testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());  //공백 기준으로 나눈대.
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            /**개행문자는 따옴표 안에다가! */
            //bw.write("Case #"+(i+1)+": "+a+" + "+b+" = " +(a+b)+"\n" );
            bw.write("Case #"+(i+1)+": "+a+" + "+b+" = " +(a+b) );
            //System.out.println();
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
