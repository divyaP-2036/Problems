public class ValidPalindrome {

    public static void main(String args[]){
        String s="A man, a plan, a canal: Panama";
        if(validCheck(s))
            System.out.println("valid");
        else
            System.out.println("no");
    }
    public static boolean validCheck(String s){

        int left=0;
        int right=s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            while( Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
