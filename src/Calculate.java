import java.util.Arrays;

public
class Calculate {
    static String[] roman = {"i","ii","iii","iv","v","vii","vi","viii","ix","x"};
    public static void calculate() throws MyException {
        int result = 0;
        switch (Check.operator){
            case ("-"):
                result = Check.nums[0] - Check.nums[1];
                break;
            case ("+"):
                result = Check.nums[0] + Check.nums[1];
                break;
            case ("*"):
                result = Check.nums[0] * Check.nums[1];
                break;
            case ("/"):
                result = (int)(Check.nums[0] / Check.nums[1]);
                break;
        }
        if(Check.style == "arabic")
            System.out.println(result);
        else if(Check.style == "roman")
            System.out.println(transformToRoman(result));
    }

    static String transformToRoman(int result) throws MyException {
        if (result < 1)
            throw new MyException("negative");
        String romNum = "";
        if(result <= 10)
            romNum = roman[result-1];
        else
            romNum = "x"+roman[result-11];
        return romNum.toUpperCase();
    }
}
