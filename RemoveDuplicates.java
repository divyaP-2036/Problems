import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("java1234"));
        System.out.println(removeDuplicate("python1224"));
        System.out.println(removeDuplicate("aBuzZ9900"));
    }
    public static String removeDuplicate(String s){
        HashSet<Character> seen=new HashSet<>();
        StringBuilder ans=new StringBuilder();

        for(char c: s.toCharArray()) {
            char ch=c;

            while(seen.contains(ch)){
                if(Character.isUpperCase(ch))
                    ch=(char)((ch-'A'+1)%26 +'A');
                else if(Character.isLowerCase(ch))
                    ch=(char)((ch-'a'+1)%26 +'a');
                else if(Character.isDigit(ch))
                    ch=(char)((ch-'0'+1)%10 +'0');
                else break;
            }

            ans.append(ch);
            if(ch>='a'&&ch<='z') {
                seen.add(ch);
                seen.add((char)(ch-32));
            }
            if(ch>='A'&& ch<='Z'){
                seen.add(ch);
                seen.add((char)(ch+32));
            }
            seen.add(ch);
        }
        return ans.toString();
    }
}
