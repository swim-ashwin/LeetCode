public class billionString {
    /*
     * create a 2d array to add the zip codes in
     * check if number at location is a digit by finding ascii value
     * go from adress order and add the digits to the array in row 1
     * check the list to see if there are 8 characters
     * remove the first three and you are left with a zip code
     * when moving onto the next address create a new row in the 2d array and repreat the populating process
     * return the 2d array 
     */
    
    //VERSION 2
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
}
