package may2020;

public class FindComplement4 {

    public static void main(String[] sadsd){
        System.out.println(new FindComplement4().findComplement(5));
    }

    public int findComplement(int num) {
        int i = 0;
        double res = 0;
        while(num > 0){
            if(num % 2 == 0){
                res = res + Math.pow(2, i);
            }
            i++;
            num = num/2;
        }
        return (int)res;
    }

    public int findComplement22(int num) {

        int i = 0;
        int res = 0;

        while (num > 0) {

            if (num % 2 == 0)
                res += Math.pow(2, i);
            i++;
            num /= 2;
        }
        return res;
    }


}
