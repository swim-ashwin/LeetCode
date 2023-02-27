public class Method2{
    public static void main(String[] args){
        // int[] arr = new int[26]; // define array with length 26
        // String str = "balloon"; 
        // for(int i = 0; i < str.length(); i++){ // loop through char by char
        //     char holder = str.charAt(i);
        //     int result = holder - 97; // subtract value from 97 and assign to variable
        //     arr[result] += 1;
        // }
        // int sum = 0;
        // for (int c = 0; c < arr.length; c++)
        //     sum += arr[c];
        // if(sum >= 26){
        //     String is_pana = String.format("%s is panagram!", str);
        //     System.out.print(is_pana);
        // }
        // else{
        //     String not_pana = String.format("%s is not a panagram!", str);
        //     System.out.print(not_pana);
        // }
        
        
        String input = "thefiveboxingwizardsjumpquickly";
        boolean result = isPanagram(input);
        String partial_output = result == true ? "a panagram " : "not a panagram ";
        String output = String.format("%s is %s",input ,partial_output);
        System.out.print(output);
        //I added a new feature!!!
        //Demo Comment

        // if(result == false){
        //     String not_pana = String.format("%s is not panagram!",input);
        //     System.out.print(not_pana);
        // }
        // else{
        //     String is_pana = String.format("%s is panagram!",input);
        //     System.out.print(is_pana);
        // }

    }

    public static boolean isPanagram(String str){
        int[] arr = new int[26]; // define array with length 26 
        for(int i = 0; i < str.length(); i++){ // loop through char by char
            char holder = str.charAt(i);
            int result = holder - 97; // subtract value from 97 and assign to variable
            arr[result] += 1;
        }
        int sum = 0;
        for (int c = 0; c < arr.length; c++)
            sum += arr[c];
        if(sum >= 26){
            // String is_pana = String.format("%s is panagram!", str);
            // System.out.print(is_pana);
            return true;
        }
        else{
            // String not_pana = String.format("%s is not a panagram!", str);
            // System.out.print(not_pana);
            return false;
        }
    }
}