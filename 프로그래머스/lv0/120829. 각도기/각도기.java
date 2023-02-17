class Solution {
    public int solution(int angle) {
        return angle == 180 ? 4 : (angle < 90 ? 1 : (angle == 90 ? 2 : 3));
        // ↓ 메모리 및 시간 단축ff
        // return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : 3;
    }
}