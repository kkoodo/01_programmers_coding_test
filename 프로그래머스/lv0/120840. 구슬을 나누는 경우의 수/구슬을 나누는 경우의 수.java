class Solution {
    public int solution(int balls, int share) {
        double a = 1;
        double b = 1;
        for(int i = balls; balls - share < i; i--) a *= i;
        for(int i = share; 0 < i; i--) b *= i;
        return (int)(a / b);
    }
}