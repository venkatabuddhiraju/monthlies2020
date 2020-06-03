package trial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDifferentTypes {
    public static void main(String[] asdf){
        System.out.println("hey");
        List<Object> obj = new ArrayList<>();
        obj.add(1);
        obj.add("hi");
        obj.add(2.5);
        obj.add('\n');
        obj.add(12);
        obj.add("ohhi");
        obj.add(2.524);
        obj.add('\t');
        obj.add(142423232);
        obj.add("aashi");
        obj.add(12.5);
        obj.add('a');
        obj.stream().forEach(System.out::println);
        System.out.println("==========");
        List<String> strings = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        List<Character> chars = new ArrayList<>();
        List<Float> floats = new ArrayList<>();
        obj.stream().parallel().forEach(object -> {
            if (object instanceof String){
                strings.add((String)object);
            }
            else if (object instanceof Integer){
                ints.add((Integer) object);
            }
            else if (object instanceof Character){
                chars.add((Character) object);
            }
            else if (object instanceof Float){
                floats.add((Float) object);
            }


        });
        Collections.sort(strings);
        Collections.sort(ints);
        Collections.sort(chars);
        Collections.sort(floats);
        obj.clear();
        obj.addAll(strings);
        obj.addAll(ints);
        obj.addAll(floats);
        obj.addAll(chars);
        obj.stream().forEach(System.out::println);

    }
}
