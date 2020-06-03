package april2020;

public class BitwiseAnd23 {

    public static void main(String[] asds){
        System.out.println(new BitwiseAnd23().rangeBitwiseAnd(5,7));
    }
    public int rangeBitwiseAnd(int m, int n) {
        int a = m;
        for(int i=m+1; i<=n;i++){
            a = a & i;
            if(i == n){
                break;
            }
        }
        return a;
    }

}
