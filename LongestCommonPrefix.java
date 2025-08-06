

public class LongestCommonPrefix {
    public static void main(String args[]){
        String word[]={"flower","flow","flood"};
        System.out.println(Checkprefix(word));
    }
    public static String Checkprefix(String word[]){
        if(word.length == 0)
            return "";
        String str="";
        for(int i=0;i<word[0].length();i++){
            char temp=word[0].charAt(i);
            for(int j=1;j< word.length;j++){
                if(i>=word[j].length() || temp!=word[j].charAt(i))
                    return str;
            }
            str += temp;
        }
        return str;
    }
}
