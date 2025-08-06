public class Anagram {
    public static void main(String[] args) {
        String one="divya";
        String two="ayvDi";
        one=one.toLowerCase();
        two=two.toLowerCase();
        System.out.println(checkAnagram(one,two));
    }
    public static boolean checkAnagram(String s1,String s2){
        int[] alp=new int[26];
        if(s1.length()!=s2.length())
            return false;

        for(int i=0;i<s2.length();i++) {
            alp[s2.charAt(i) - 'a']--;
            alp[s1.charAt(i) - 'a']++;
        }
        for(int count : alp){
            if(count!=0)
                return false;
        }
        return true;
    }
}
