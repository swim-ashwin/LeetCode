public class last_word{

    public static void main(String[] args) {
        String str = " I like swimming";

        System.out.println("Length of last word in \"" + str + "\": " + lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s) {

        char[] chars = s.toCharArray();

        int x = chars.length;

        int y = x - 1;
        while (y >= 0 && Character.isWhitespace(chars[y])) {
            y--;
        }

        return x - y - 1;
    }
}
