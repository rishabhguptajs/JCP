public class Palindrome {
    static boolean isPalindrome(String str){
        String cleanString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = cleanString.length();
        int left = 0;
        int right = n - 1;
    
        while(left < right){
            if(cleanString.charAt(left) != cleanString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }    
    public static void main(String[] args) {
        String str = "hll,  aibcabcb2332jr23d adeh";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
}
