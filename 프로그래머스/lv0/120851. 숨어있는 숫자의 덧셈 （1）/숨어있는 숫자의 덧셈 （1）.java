import java.util.stream.*;

class Solution {
    public int solution(String my_string) {
        // int answer = 0;
        // int[] array = Stream.of(my_string.replaceAll("[a-zA-Z]", "").split("")).mapToInt(Integer::parseInt).toArray();
        // for(int i = 0; i < array.length; i++) {
        //     answer += array[i];
        // }
        // return answer;
        return my_string.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
    }
}