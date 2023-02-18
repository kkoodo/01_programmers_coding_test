class Solution {
    public int solution(int[] numbers, int k) {
        int[] loop = new int[2 * k];
        for(int i = 0; i < loop.length; i++) loop[i] = numbers[i % numbers.length];
        return loop[2 * k - 2];
        // return (k - 1) * 2 % numbers.length + 1;
    }
}