package april2020;

public class ShiftString14 {
    public static void main(String[] asdkhsfs){
        int[][] shifts = {{1,8},{1,4},{1,3},{1,6},{0,6},{1,4},{0,2},{0,1}};
        System.out.println(new ShiftString14().stringShift("yisxjwry",shifts));
    }

    public String stringShift(String s, int[][] shift) {
        if(s.isBlank() || shift == null){
            return "";
        }
        int leftSum = 0, rightSum = 0;
        for(int[] shiftItem : shift){
            if(shiftItem[0] == 1){
                rightSum = rightSum + shiftItem[1];
            }
            else{
                leftSum = leftSum + shiftItem[1];
            }
        }
        int effectiveSum = leftSum - rightSum;
        if(Math.abs(effectiveSum) > s.length()){
            effectiveSum = effectiveSum % s.length();
        }
        if(effectiveSum == 0){
            return s;
        }
        else if(effectiveSum < 0){
            return s.substring(s.length()-Math.abs(effectiveSum)) + s.substring(0, s.length()-Math.abs(effectiveSum));
        }
        else{
            return  s.substring(Math.abs(effectiveSum)) + s.substring(0, Math.abs(effectiveSum)) ;
        }
    }

}
