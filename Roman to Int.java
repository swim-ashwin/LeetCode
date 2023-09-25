class roman_to_int{

    public static void main(String[] args) {
        roman_to_int converter = new roman_to_int();

        String[] romanNumerals = {"III", "IX", "XXI", "XL", "XC", "CD", "MCMXCV"};

        for (int i = 0; i < romanNumerals.length; i++) {
            String numeral = romanNumerals[i];
            int result = converter.romanToInt(numeral);
            System.out.println(numeral + " -> " + result);
        }
    }
    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = getValue(currentChar);

            if (i < s.length() - 1 && currentValue < getValue(s.charAt(i + 1))) {
                result -= currentValue;
            } 
            else {
                result += currentValue;
            }
        }

        return result;
    }
    private int getValue(char romanChar) {
        if (romanChar == 'I')
            return 1;
        else if (romanChar == 'V')
            return 5;
        else if (romanChar == 'X')
            return 10;
        else if (romanChar == 'L')
            return 50;
        else if (romanChar == 'C')
            return 100;
        else if (romanChar == 'D')
            return 500;
        else if (romanChar == 'M')
            return 1000;
        else
            return 0;
    }
