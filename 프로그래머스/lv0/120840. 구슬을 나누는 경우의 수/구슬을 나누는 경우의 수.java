class Solution {
    public int solution(int balls, int share) {
        double a = 1;
        double b = 1;
        for(int i = balls; balls - share < i; i--) a *= i;
        for(int i = share; 0 < i; i--) b *= i;
        return (int)(a / b);
    }
}
// class Solution {
//     public long solution(int balls, int share) {
//         share = Math.min(balls - share, share);
//         if (share == 0) return 1;
//         long result = solution(balls - 1, share - 1);
//         result *= balls;
//         result /= share;
//         return result;
//     }
// }