package april2020;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 */
public class GroupAnagrams6 {

    public static void main(String[] asdwad){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groups = groupAnagrams(strs);
        groups.stream().forEach(System.out::println);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        Map<String, List<String>> hashMap = new HashMap();
        for(String str : strs){
            String sortedString = sortStr(str);
            if(hashMap.containsKey(sortedString)){
                hashMap.get(sortedString).add(str);
            }
            else{
                List<String> list = new ArrayList<String>();
                list.add(str);
                hashMap.put(sortedString, list);
            }
        }
        return hashMap.values().stream().collect(Collectors.toList());
    }

    public static String sortStr(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }


}
