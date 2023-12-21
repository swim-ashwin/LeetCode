public class last_word{

    public static void main(String[] args) {
        String str = "I like swimming.";

        System.out.println("Length of last word in \"" + str + "\": " + lengthOfLastWordA1(str));
    }

    public static int lengthOfLastWord(String s) {
        int lastSpace = -1;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                lastSpace = i;
            }
        }
        return chars.length - lastSpace - 1;
    }
    public static int lengthOfLastWordA1(String s) {
    int start = 0;
    int end = 0;
    char[] chars = s.toCharArray();

    for(int i = chars.length - 1; i >= 0; i--) {
        if(chars[i] == ' ' || chars[i] == '.') {
            start = i - 1;
            break;
        }
    }
    for(int j = start; j >= 0; j--){
        if(chars[j] == ' '){
            end = j;
            break;
        }
    }

    return start - end;

        //consider for .
        // Ashwin is a great programmer       .
        }
    
            // "Hello this is Ashwin"
            /*
                Find the total length of the string
                store in a variable, x
                find the index of the last space
                store in a variabe, y
                subtract x from y and return the result
    
                - convert the string to character array
            */
}
