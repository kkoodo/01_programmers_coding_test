import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        // Stack<String> stack = new Stack<>();
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(String letter : my_string.split("")) set.add(letter);
        for(String letter : set) answer += letter;
        return answer;
    }
}