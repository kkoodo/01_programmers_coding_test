class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 1;
        while(count <= n) {
            answer++;
            count *= answer;
        }
        return answer - 1;
    }
}