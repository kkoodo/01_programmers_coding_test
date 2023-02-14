class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 1) answer = 1;
        for(int i = n; i >= 2; i--) {
            if(6 % i == 0 && n % i == 0) {
                answer = n / i;
                break;
            } else {
                answer = n;
            }
        }
        return answer;
    }
}