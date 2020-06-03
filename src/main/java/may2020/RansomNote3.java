package may2020;

public class RansomNote3 {
    public static void main(String asasa[]){
        System.out.println(new RansomNote3().canConstruct("abce", "abcdhjgufjyfhvhvavvabac"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int a[] = new int[26];
        for(Character c : ransomNote.toCharArray()){
            a[c-97] =  ++a[c-97];
        }

        for(Character c : magazine.toCharArray()){
            a[c-97] = --a[c-97];
        }

        for(int i=0; i<26; i++){
            if(a[i] > 0){
                return false;
            }
        }

        return true;
    }

}
