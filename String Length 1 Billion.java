public class billionString {
    /*
     * create a 2d array to add the zip codes in
     * start at index 0 and incremement by 1 and add each digit/letter to row 1 until you reach a space
     * when the space is encountered add to row 1 as well
     * traverse the address until another number is encountered
     * add it to row 1
     * keep adding until a space is encountered and DO NOT ADD SPACE TO ROW 1
     * traverse the array from start until you reach the index with the space
     * return all the characters that come after it
     */
     
     public static void main(String[] args){
      String str = "slates";
      System.out.print(isZipCode(str));
     }

     public static boolean isZipCode(String str){
      int count = 0;
        for(int i = 0; i < str.length(); i ++){
         count +=1;
        }
        if(count == 5){
         return true;
        }
        else{
         return false;
        }
     }
}
