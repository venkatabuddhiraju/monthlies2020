package may2020;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class MajorityElement6 {
    //        Optional<Character> answer = map.keySet().stream().filter(key -> map.get(key) == 1).findFirst();

    public static void main(String sdsdsds[]){
        int nums[] = {1,2,3,4,1,2,2,1,0};
        System.out.println(new MajorityElement6().majorityElement2(nums));
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int num:nums){
            if(map.computeIfPresent(num, (k,v) -> ++v) == null)
                map.put(num, 1);
        }
        Optional<Integer> answer = map.keySet().stream().filter(key -> map.get(key) >= nums.length/2).findFirst();
        if(answer.isPresent()){
            return answer.get();
        }
        else{
            throw new RuntimeException();
        }
    }

    public int majorityElement2(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }


}
