package trial;

import java.util.*;

/**
 * min rooms needed to conduct meetings of the day
 */
public class MinRoomsForMeetings {
    static class Meeting{
        int start;
        int end;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public Meeting(int start, int end) {
            if(start > end){
                throw new IllegalArgumentException("Start = "+ start + " cannot be after end " + end );
            }
            this.start = start;
            this.end = end;
        }
    }

    public MinRoomsForMeetings() {
    }

    private static List<Meeting> meetings = new ArrayList<>();
    static{
        meetings.add(new Meeting(10,30));
        meetings.add(new Meeting(20,70));
        meetings.add(new Meeting(50,100));
        meetings.add(new Meeting(60,100));
        meetings.add(new Meeting(120,190));
        meetings.add(new Meeting(125,135));
    }

    public static void main(String[] shfdksfd){
        System.out.println("min rooms needed " + minRoomsNeeded(meetings));
    }

    private static int minRoomsNeeded(List<Meeting> meetings) {
        int minRooms = 0;
        if(meetings.isEmpty()){
            return minRooms;
        }
        Map<Integer, Integer> meetingMap = new TreeMap<>();
        meetings.stream().forEach(entry -> {
            putInMap(meetingMap, entry.getStart(), meetingMap.computeIfAbsent(entry.getStart(), k -> 1), 1);
            putInMap(meetingMap, entry.getEnd(), meetingMap.computeIfAbsent(entry.getEnd(), k -> -1), -1);
        });
        int maxRooms = 0;
        for(Map.Entry entry : meetingMap.entrySet()){
            maxRooms = maxRooms + (Integer)entry.getValue();
            minRooms = Math.max(maxRooms, minRooms);
        }
        return minRooms;
    }

    private static void putInMap(Map<Integer, Integer> meetingMap, int start, int i, int i2) {
        if (meetingMap.containsKey(start)) {
            meetingMap.put(start, i);
        } else {
            meetingMap.put(start, i2);
        }
    }
}

