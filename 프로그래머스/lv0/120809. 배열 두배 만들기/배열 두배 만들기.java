class Solution {
    public int[] solution(int[] numbers) {
        return java.util.Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}