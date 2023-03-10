// import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        // String answer = "";
        // LinkedHashSet<String> set = new LinkedHashSet<String>();
        // for(String letter : my_string.split("")) set.add(letter);
        // for(String letter : set) answer += letter;
        // return answer;
        return my_string.chars().mapToObj(Character::toString).distinct().collect(Collectors.joining());
    }
}