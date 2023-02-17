class Solution {
    public int solution(int angle) {
        int answer = 0;
        return angle == 180 ? 4 : (angle < 90 ? 1 : (angle == 90 ? 2 : 3));
    }
}