package may2020;

public class JewelAndStone2 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (Character s : S.toCharArray()) {
            for (Character j : J.toCharArray()) {
                if (s == j) {
                    count++;
                }
            }
        }
        return count;
    }
}
