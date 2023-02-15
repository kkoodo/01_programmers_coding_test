class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) even++;
            else odd++;
        }
        return new int[] {even, odd};
        // int[] answer = new int[2];
        // for(int i = 0; i < num_list.length; i++) {
        //     answer[num_list[i] % 2]++;
        // }
        // return answer;
    }
}