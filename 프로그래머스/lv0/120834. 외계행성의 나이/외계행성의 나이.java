class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        String[] arr = new String[str.length()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(str.charAt(i));
            answer += (char)(Integer.valueOf(arr[i]) + 97);
        }
        return answer;
    }
}