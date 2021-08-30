import java.util.Scanner;

public
class GetExpression {
    public static String getLine() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("введите выражение для вычисления:");
        String line = in.nextLine();
        line = line.replaceAll("\\s", "").toLowerCase();
        in.close();
        Check.checkLine(line);
      return line;
    };
}
