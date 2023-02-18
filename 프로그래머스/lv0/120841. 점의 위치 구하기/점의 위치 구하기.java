class Solution {
    public int solution(int[] dot) {
        return dot[0] > 0 ? dot[1] > 0 ? 1 : 4 : dot[1] > 0 ? 2 : 3;
        // x좌표 > 0 ? y좌표 > 0 ? "둘 다 양수" : "y좌표 음수" : y좌표 > 0 ? "x좌표 음수" : "둘 다 음수";
    }
}