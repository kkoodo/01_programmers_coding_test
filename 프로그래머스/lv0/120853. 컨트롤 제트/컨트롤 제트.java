import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] array = s.split(" ");
        for(int i = 0; i < array.length; i++) {
            if(!array[i].equals("Z")) answer += Integer.valueOf(array[i]);
            else answer -= Integer.valueOf(array[i - 1]);
        }
        return answer;
    }
}