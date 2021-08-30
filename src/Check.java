public
class Check {
    static String style = "";
    static String operator = "";
    static int[] nums = {0, 0};

    public static
    void checkLine(String line) throws Exception {
        int countOper = 0;
        String[] styles = {"", ""};
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '+' ||
                    line.charAt(i) == '-' ||
                    line.charAt(i) == '*' ||
                    line.charAt(i) == '/') {
                countOper++;
                operator = String.valueOf(line.charAt(i));
            }
        }
        if (countOper > 1)
            throw new MyException("plural_operator");
        if (countOper == 0)
            throw new MyException("operator");
        String[] stringNums = {"", ""};
        if (operator.equals("+"))
            stringNums = line.split("\\+");
        else if (operator.equals("*"))
            stringNums = line.split("\\*");
        else
            stringNums = line.split(operator);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (stringNums[i].equals(Numbers.roman[j])) {
                    styles[i] = "roman";
                    nums[i] = Numbers.arabic[j];
                    break;
                }
                if (stringNums[i].equals(String.valueOf(Numbers.arabic[j]))) {
                    styles[i] = "arabic";
                    nums[i] = Numbers.arabic[j];
                    break;
                }
            }
        }
        if (nums[0] == 0 || nums[1] == 0)
            throw new MyException("nan");
        if (styles[0].equals(styles[1]) && !"".equals(styles[0]))
            style = styles[0];
        if (style.equals(""))
            throw new MyException("mix");
    }
}

