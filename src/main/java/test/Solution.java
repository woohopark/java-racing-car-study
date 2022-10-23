package test;

import java.util.Arrays;

public class Solution {

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0;
        for(;i< completion.length;i++)
            if(!participant[i].equals(completion[i]))
                break;
        return participant[i];
    }

    public static void main(String[] args) {
        String[] part = {"mislav","kiki","mislav"};
        String[] comp = {"mislav","kiki",};
        Solution sol = new Solution();

        System.out.println(sol.solution(part,comp));

    }

    /*

    마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    completion의 길이는 participant의 길이보다 1 작습니다.
    참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    참가자 중에는 동명이인이 있을 수 있습니다.

     */
}
