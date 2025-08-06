//Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded,
// Input : Version1 4.0.2 Version2 4.0.0 Output: downgraded

public class VersionUpOrDowngraded {
    public static void main(String[] args) {
        String version1="4.8.2";
        String version2="4.8.2";

        int ans=check(version1,version2);

        if(ans<0)
            System.out.println("downgraded");
        else if(ans>0)
            System.out.println("upgraded");
        else
            System.out.println("equal");
    }
    public static int check(String v1,String v2){
        int v1sum=0,v2sum=0;

        for(int i=0,j=0;(i<v1.length())||(j<v2.length());){
            if(i<v1.length() && v1.charAt(i)!='.'){
                v1sum=v1sum*10 + (v1.charAt(i)-'0');
                i++;
            }
            if(j<v2.length() && v2.charAt(j)!='.'){
                v2sum=v2sum*10 + (v2.charAt(j)-'0');
                j++;
            }
            if(v1sum>v2sum)
                return -1;
            if(v1sum<v2sum)
                return 1;
            i++;
            j++;
        }
        return 0;
    }
}
