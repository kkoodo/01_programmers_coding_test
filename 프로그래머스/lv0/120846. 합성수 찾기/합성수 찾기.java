class Solution {
    public int solution(int n) {
        int answer = 0;
    for(int i = 2; i <= n; i++) {
        for(int j = 2; j <= i; j++) {
        	System.out.println("i : " + i);
        	System.out.println("j : " + j);
        	System.out.println(i % j);
            if(i % j == 0 && i != j) {
            	answer++;
            	System.out.println("야호");
            	break;
            }
        }
    }
        return answer;
    }
}