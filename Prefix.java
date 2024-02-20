// - input a string array str
// - check if array is empty or null -> return “ ”
// - iterate through each index in the first string str[0]
// - for each character at i, iterate through each string str[j]
// - check if i is equal to the length of str[j] or if charAt(i) is != to character ch
// - if true, return substring of str[0] from 0 to i

public class prefix{

    public static void main(String[] args) {
        prefix p1 = new prefix();

        String[] test1 = {"a", "abc", "ab"};
        System.out.println("Result: " + p1.A1(test1));
    }

    public String A1(String[] str){
        if(str.length == 0 || str == null){
            return "";
        }
        for(int i = 0; i < str[0].length(); i++){
            char ch = str[0]. charAt(i);
            for(int j = 1; j < str.length; j++){
                if(i == str[j].length() || str[j].charAt(i) != ch){
                    return str[0].substring(0, i);
                }
            }
        }
        return str[0];
    }
}
