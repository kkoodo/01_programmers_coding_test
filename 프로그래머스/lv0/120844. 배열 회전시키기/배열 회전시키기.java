import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        // int[] answer = new int[numbers.length];
        // for(int i = 0; i < answer.length; i++) {
        //     if(direction.equals("right")) {
        //         if(i == 0) answer[i] = numbers[numbers.length - 1];
        //         else answer[i] = numbers[i - 1];
        //     } else {
        //         if(i == answer.length - 1) answer[i] = numbers[0];
        //         else answer[i] = numbers[i + 1];
        //     }
        // }
        // return answer;
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        if(direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}