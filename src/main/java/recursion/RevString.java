package recursion;

public class RevString {

    public static void reverseString(char[] s) {
        reverse(0, s);
    }

    private static void reverse(int count, char[] s){
        if(count == s.length/2){
            return;
        }
        char c = s[s.length - count - 1];
        s[s.length - count - 1] = s[count];
        s[count++] = c;
        reverse(count, s);
    }

    public static void main(String[] sdsdf){
        char[] s = {'h','e','l','l','o','w','o','r','l','d'};
        reverseString(s);
        System.out.println(String.valueOf(s));
    }
}
