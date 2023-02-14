import java.util.*;

class Solution {
    public int solution(int[] array) {
        int count = 1;
        int repet = 0;
        int answer = -1;
        
        Map<Integer, Integer> map = new HashMap<>();
        
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] == array[j]) map.put(array[i], count++);
			}
			count = 1;
		}
        
        int max = Collections.max(map.values());
        
        for(int key : map.keySet()) {
			if(map.get(key) == max) {
                repet++;
                if(repet == 1) answer = key;
                else answer = -1;
            }
		}
        
        return answer;
    }
}