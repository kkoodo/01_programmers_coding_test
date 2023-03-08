import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String my_string) {
        String[] array = my_string.replaceAll("[a-zA-Z]", "").split("");
        Arrays.sort(array);
        return Stream.of(array).mapToInt(Integer::parseInt).toArray();
        // return Arrays.stream(array).mapToInt(e -> Integer.parseInt(e)).toArray();
        // return Arrays.stream(my_string.replaceAll("[a-zA-Z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}