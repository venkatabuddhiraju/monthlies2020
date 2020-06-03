package april2020;

import java.util.*;
import java.util.stream.Collectors;

public class LeastWeightStone12 {

    public static void main(String[] sdfds){
        //int[] num = {316,157,73,106,771,828,46,212,926,604,600,992,71,51,477,869,425,405,859,924,45,187,283,590,303,66,508,982,464,398};
        int num[] = {3,7,2};
        System.out.println(lastStoneWeight(num));
    }
    public static int lastStoneWeight2(int[] stones) {
        List<Integer> stonesList = Arrays.stream(stones).sequential().boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int i = 0;
        while(stonesList.size() > 1){
            ArrayList<Integer> newStones = new ArrayList<>();
            for(i = 0; i<stonesList.size() - 1;i+=2){
                int diff = Math.abs(stonesList.get(i) - stonesList.get(i+1));
                if(diff == 0){
                    continue;
                }
                newStones.add(diff);
            }
            if(i == stonesList.size() - 1){
                newStones.add(stonesList.get(i));
            }
            stonesList.clear();
            newStones.sort(Comparator.reverseOrder());
            stonesList.addAll(newStones);
        }
        if(stonesList.size() != 1){
            return 0;
        }
        else
            return stonesList.get(0);
    }

    public int Internet_lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones) {
            queue.add(i);
        }
        int x;
        int y;
        while(queue.size() > 1) {
            y = queue.poll();
            x = queue.poll();
            if(y > x) {
                queue.offer(y-x);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }

    public static int lastStoneWeight(int[] stones) {
        if(stones.length == 0){
            return -1;
        }
        else if(stones.length == 1){
            return stones[0];
        }
        else if(stones.length == 2){
            return Math.abs(stones[0] - stones[1]);
        }
        List<Integer> stoneList = Arrays.stream(stones).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        while(stoneList.size() > 2){
            int first = stoneList.get(0);
            int second = stoneList.get(1);
            stoneList.subList(0, 2).clear();
            if(first - second == 0){
                continue;
            }
            stoneList.add(first - second);
            Collections.sort(stoneList, Collections.reverseOrder());
        }
        return stoneList.get(0) - stoneList.get(1);
    }


    }
