class Solution {
    public int solution(int[] numbers, int k) {
        int[] loop = new int[1998];
        for(int i = 0; i < loop.length; i++) loop[i] = numbers[i % numbers.length];
        return loop[2 * k - 2];
    }
}