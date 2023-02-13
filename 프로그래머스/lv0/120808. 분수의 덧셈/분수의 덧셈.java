class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        for(int num = Math.min(numer, denom); num >= 2; num--) {
            if(numer % num == 0 && denom % num == 0) {
                numer /= num;
                denom /= num;
                break;
            }
        }
        
        int[] answer = {numer, denom};
        return answer;
    }
}