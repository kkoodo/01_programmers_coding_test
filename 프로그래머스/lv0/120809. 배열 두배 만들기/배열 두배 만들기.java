class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = numbers;
        // int[] answer = Arrays.stream(numbers).map(i -> i * 2).toArray();
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}