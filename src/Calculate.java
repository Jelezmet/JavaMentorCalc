import java.util.Arrays;

public
class Calculate {
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
        if((Check.style).equals("arabic"))
            System.out.println(result);
        else if((Check.style).equals("roman"))
            System.out.println(Converter.intToRoman(result));
    }
}
