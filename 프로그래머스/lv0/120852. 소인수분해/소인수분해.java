import java.util.*;
// import java.util.stream.*;

class Solution {
//     public int[] solution(int n) {
//         int[] div = new int[n];
//         for(int i = 2; i <= n; i++) {
//             if(n % i == 0) div[i - 1] = i;
//         }
        
//         int[] sort = Arrays.stream(div).filter(idx -> idx != 0).toArray();
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i = 0; i < sort.length; i++) {
//             if(isPrime(sort[i])) list.add(sort[i]);
//         }
        
//         int[] answer = list.stream().mapToInt(i -> i).toArray();
//         return answer;
//     }
    
//     public boolean isPrime(int n) {
//         for(int i = 2; i <= (int)Math.sqrt(n); i++) {
//             if(n % i == 0) return false;
//         }
//         return true;
//     }
    public int[] solution(int n) {
        LinkedHashSet<Integer> answer = new LinkedHashSet<>();
        int i = 2;
        while(n != 0 && i <= n) {
            if(n % i == 0) {
                answer.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}