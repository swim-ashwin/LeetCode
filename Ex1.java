import java.util.ArrayList;

public class Ex1{
    public static void main(String[] args){
        String str = "heavyboxesperformquickwaltzesandjigs";
        boolean result = IsPanagram(str);
        System.out.println(result);
        //New Feature



        // for(int i = 0; i < 26; i++){
    //         char c = charAt(i);
    //         if(c == "a" && c == "b" && c == "c" && c == "d" && c == "e" && c == "f" && c == "g" && c == "h" && c == "i" && c == "j" && c == "k" && c == "l" && c == "m" && c == "n" && c == "o" && c == "p" && c == "q" && c == "r" && c == "s" && c == "t" && c == "u" && c == "v" && c == "w" && c == "x" && c == "y" && c == "z"){
    //             return true;
    //         }
    //         else{
    //             return false;
    //         }
    // }
        // String str = "heavyboxesperformquickwaltzesandjigs";
        // ArrayList<String> alphabet = new ArrayList<String>(26);
        // alphabet.add("a");
        // alphabet.add("b");
        // alphabet.add("c");
        // alphabet.add("d");
        // alphabet.add("e");
        // alphabet.add("f");
        // alphabet.add("g");
        // alphabet.add("h");
        // alphabet.add("i");
        // alphabet.add("j");
        // alphabet.add("k");
        // alphabet.add("l");
        // alphabet.add("m");
        // alphabet.add("n");
        // alphabet.add("o");
        // alphabet.add("p");
        // alphabet.add("q");
        // alphabet.add("r");
        // alphabet.add("s");
        // alphabet.add("t");
        // alphabet.add("u");
        // alphabet.add("v");
        // alphabet.add("w");
        // alphabet.add("x");
        // alphabet.add("y");
        // alphabet.add("z");
        // for(int i = 0; i < str.length(); i++){
        //     char j = str.charAt(i);
        //     if(alphabet.contains(j)){
        //         alphabet.remove(j);
        //     }
        // }
        // if(alphabet.size() > 0){
        //     System.out.print("false");
        // }
        // else{
        //     System.out.print("true');
        // }
    }

    public static boolean IsPanagram(String str){
        ArrayList<Object> alphabet = new ArrayList<Object>(26);
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        for(int i = 0; i < str.length(); i++){
            char j = str.charAt(i);
            if(alphabet.contains(j)){
                int pointer = alphabet.indexOf(j);
                alphabet.remove(pointer);
            }
        }
        if(alphabet.size() > 0){
            return false;
        }
        else{
            return true;
        }
    }
    
    
}