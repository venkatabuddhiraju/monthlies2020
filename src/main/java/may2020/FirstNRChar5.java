package may2020;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNRChar5 {

    public static void main(String[] asdsd){
        System.out.println(new FirstNRChar5().firstUniqChar("aabbcc"));
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(Character c : s.toCharArray()){
            if(map.computeIfPresent(c, (k,v) -> ++v) == null)
                map.put(c, 1);
        }

        Optional<Character> answer = map.keySet().stream().filter(key -> map.get(key) == 1).findFirst();
        if(answer.isPresent()){
            return s.indexOf(answer.get());
        }
        else{
            return -1;
        }
    }

}
