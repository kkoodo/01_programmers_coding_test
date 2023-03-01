class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = n; 1 < i; i--) {
            for(int j = i; 1 < j; j--) {
                if(i % j == 0 && i != j) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}