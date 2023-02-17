class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answer.length;
            for(int j = answer.length - 1; 0 <= j; j--) {
                if(emergency[i] > emergency[j]) answer[i]--;
            }
        }
        return answer;
    }
}