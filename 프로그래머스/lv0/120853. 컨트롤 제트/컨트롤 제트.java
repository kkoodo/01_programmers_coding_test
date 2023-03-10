// import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] array = s.split(" ");
        for(int i = 0; i < array.length; i++) {
            if(!array[i].equals("Z")) answer += Integer.valueOf(array[i]);
            else answer -= Integer.valueOf(array[i - 1]);
        }
        return answer;
        // Stack<Integer> stack = new Stack<>();
        // for(String letter : s.split(" ")) {
        //     if(letter.equals("Z")) stack.pop();
        //     else stack.push(Integer.parseInt(letter));
        // }
        // for(int i : stack) answer += i;
        // return answer;
    }
}