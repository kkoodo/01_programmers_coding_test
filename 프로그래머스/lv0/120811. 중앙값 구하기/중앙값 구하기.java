class Solution {
    public int solution(int[] array) {
        java.util.Arrays.sort(array);
        int answer = array[array.length / 2];
        return answer;
    }
}