public class string_lecture {

    public static void main(String[] args) {
        // basic way of creating a string 
        String str = "Rishabh here";
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        System.out.println(rev);
    }
}