package trial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SumOfTwoInList {

    public static void main(String[] jasdkas){
        printSumNums(40);
    }

    private static void printSumNums(int sum) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.add(35);
        numbers.add(45);
        numbers.add(55);
        numbers.add(65);
        numbers.add(75);
        numbers.add(57);
        HashSet<Integer> tempSet = new HashSet<>();
        for(int num : numbers){
            if(tempSet.contains(sum - num)){
                System.out.println("has numbers " + (sum - num) + " and " + num);
            }
            else
                tempSet.add(num);
        }
    }
}
