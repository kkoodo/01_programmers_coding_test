class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = n; 1 <= i; i--) {
            if(n % i == 0) answer++;
        }
        return answer;
    }
}