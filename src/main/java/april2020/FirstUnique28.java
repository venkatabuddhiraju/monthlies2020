package april2020;

import java.util.*;
import java.util.stream.Collectors;

public class FirstUnique28 {
    static class FirstUnique {
        int firstUnique;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        public FirstUnique(int[] nums) {
            Arrays.stream(nums).sequential().forEach(num -> {
                map.computeIfPresent(num, (k,v) -> ++v);
                map.putIfAbsent(num, 1);
            });
            firstUnique = map.keySet().stream().filter(key -> map.get(key) == 1).findFirst().get();
        }

        public int showFirstUnique() {
           return firstUnique;
        }

        public void add(int value) {
            map.computeIfPresent(value, (k,v) -> v++);
            map.putIfAbsent(value, 1);
            firstUnique = map.entrySet().stream().filter(key -> map.get(key) == 1).findFirst().get().getKey();
        }
    }


    public static void main(String[] assds){
        int nums[] = new int[]{3,2,1,0,4,2,0,4,3};
        FirstUnique fu = new FirstUnique(nums);
        System.out.println(fu.showFirstUnique());
    }

}
