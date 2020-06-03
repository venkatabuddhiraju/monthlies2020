package april2020;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatedNumber1 {
    public static int singleNumber(int[] nums) {
        Set<Integer> counts = new HashSet<>();
        Arrays.stream(nums).forEach(num -> {
            if(counts.contains(num)){
                counts.remove(num);
            }
            else{
                counts.add(num);
            }
        });
        if(counts.size() == 1){
            return counts.stream().findFirst().get();
        }
        else{
            throw new IllegalArgumentException("wrong input");
        }
    }

    public static int singleNumberXor(int[] nums) {
        int a = 0;
        for(int num : nums)
            a = a ^ num;
        return a;
    }


    public static void main(String[] asdksd){
        int nums[] = {2,2,1};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumberXor(nums));

    }
}
