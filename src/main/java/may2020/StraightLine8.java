package may2020;

public class StraightLine8 {

    public static void main(String[] args){
        int coord[][] = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(new StraightLine8().checkStraightLine(coord));
    }

    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length <= 2){
            return true;
        }
        if(coordinates[0].length < 2){
            throw new IllegalArgumentException("not the right coordinates");
        }
        int x1 = coordinates[0][0];
        int x2 = coordinates[1][0];
        int y1 = coordinates[0][1];
        int y2 = coordinates[1][1];

        for(int i = 2; i<coordinates.length; i++){
            int x3 = coordinates[i][0];
            int y3 = coordinates[i][1];
            if((y2 - y1)*(x3 - x1) != (x2 - x1)*(y3 - y1)) return false;
        }
        return true;
    }

}
