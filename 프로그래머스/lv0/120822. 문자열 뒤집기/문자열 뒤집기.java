import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = my_string.toCharArray();
        for(int i = array.length - 1; 0 <= i; i--) {
            answer += array[i];
        }
        return answer;
    }
}