import java.util.*;
// import java.util.stream.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[0] + sides[1] > sides[2]) return 1;
        else return 2;
        // return Arrays.stream(sides).max().getAsInt() < Arrays.stream(sides).sum() - Arrays.stream(sides).max().getAsInt() ? 1 : 2;
    }
}