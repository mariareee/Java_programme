public class RevStr implements ReversedString {

    public String str;

    public RevStr(String str) {
        this.str = str;
    }


    @Override
    public String reverse() {

        return new StringBuilder(str).reverse().toString();

        // Using FOR
        /*char[] chars = str.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }
        return result;*/
    }
}
