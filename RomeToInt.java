class RomeToInt {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = getValue(s.charAt(i));

            // check next value (for cases like IV, IX)
            if (i < s.length() - 1) {
                int next = getValue(s.charAt(i + 1));

                if (curr < next) {
                    total -= curr;  // subtract
                } else {
                    total += curr;  // add
                }
            } else {
                total += curr;
            }
        }
        return total;
    }

     public int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        RomeToInt obj = new RomeToInt();
        System.out.println(obj.romanToInt("IV"));
    }
}