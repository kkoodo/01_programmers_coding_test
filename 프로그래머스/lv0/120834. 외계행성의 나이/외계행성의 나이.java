// import java.util.stream.*;

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
        // return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
        
        // StringBuilder sb = new StringBuilder();
        // while(age > 0) {
        //     sb.insert(0, (char)((age % 10) + (int)'a'));
        //     age /= 10;
        // }
        // return sb.toString();
    }
}