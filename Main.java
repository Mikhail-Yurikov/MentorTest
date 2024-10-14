import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws Exception {
        String[] m = input.split(" ");
        int result;
        if (m.length != 3) {
            throw new Exception();
        } else {
            int a = Integer.parseInt(m[0]);
            int b = Integer.parseInt(m[2]);
            if ((a > 10 || a < 0) || (b > 10 || b < 0)) {
                throw new Exception();
            } else {
                result = switch (m[1]) {
                    case "-" -> a - b;
                    case "+" -> a + b;
                    case "*" -> a * b;
                    case "/" -> a / b;
                    default -> throw new Exception();
                };
            }
        }
        return String.valueOf(result);
    }
}