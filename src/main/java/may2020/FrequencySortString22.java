package may2020;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Sort Characters By Frequency
 * Given a string, sort it in decreasing order based on the frequency of characters.
 *
 * Example 1:
 *
 * Input:
 * "tree"
 *
 * Output:
 * "eert"
 *
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 * Example 2:
 *
 * Input:
 * "cccaaa"
 *
 * Output:
 * "cccaaa"
 *
 * Explanation:
 * Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
 * Note that "cacaca" is incorrect, as the same characters must be together.
 * Example 3:
 *
 * Input:
 * "Aabb"
 *
 * Output:
 * "bbAa"
 *
 * Explanation:
 * "bbaA" is also a valid answer, but "Aabb" is incorrect.
 * Note that 'A' and 'a' are treated as two different characters.
 */
public class FrequencySortString22 {

    public static void main(String[] asdsds){
        System.out.println(new FrequencySortString22().frequencySort("hellooboss"));
    }

    public String frequencySort(String s) {
        if(s.trim().isEmpty()){
            return s;
        }
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c : s.toCharArray()){
            if(charCount.computeIfPresent(c, (k,v) -> ++v) == null){
                charCount.put(c, 1);
            }
        }
        Map<Character, Integer> sortedMap = charCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        StringBuilder sb = new StringBuilder();
        sortedMap.keySet().forEach(key -> {
            int frequency = sortedMap.get(key);
            for(int i=0; i<frequency; i++){
                sb.append(key);
            }
        });
        return sb.toString();
    }

}
