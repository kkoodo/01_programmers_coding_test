// import java.util.*;
// import java.util.stream.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answer.length;
            for(int j = answer.length - 1; 0 <= j; j--) {
                if(emergency[i] > emergency[j]) answer[i]--;
            }
        }
        return answer;
        /* emergency 배열을 map 돌릴 것임 */
        // return Arrays.stream(emergency).map(i -> Arrays
        //                                                 .stream(emergency)  // ☞ cannot convert from IntStream to int
        //                                                                     // emergency 배열 sort 하기 위한 작업
        //                                                 .boxed()            // ☞ cannot convert from IntStream to int
        //                                                                     // emergency 배열 sort 하기 위한 작업
        //                                                 .sorted(Comparator.reverseOrder())  // ☞ cannot convert from Stream<Integer> to int
        //                                                                                     // 내림차순 정렬
        //                                                                                     // [3, 76, 24] -> [76, 24, 3]
        //                                                 .collect(Collectors.toList())       // ☞ cannot convert from List<Integer> to int
        //                                                                                     // 정렬된 배열 리스트에 담기
        //                                                 .indexOf(i) + 1                     // 리스트에서 i 값을 지니는 요소의 index 값 + 1 을 i로 치환함
        //                                                                                     // i : 3 -> list에서 3 값의 index = 2 -> i : 2 + 1 = 3이 됨
        //                                    ).toArray();
    }
}