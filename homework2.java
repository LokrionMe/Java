import java.util.Arrays;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        input_formul();
    }

    public static void input_formul() {
        System.out.println("Input equation");
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        equation = equation.replace(" ", "").replace("+", "=");
        String[] arr = equation.split("=");
        Arrays.sort(arr);
        int res = 0;
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                res += InputNumber("Input number of " + arr[i] + " =", k);
            } else {
                if (arr[i].equals(arr[i + 1])) {
                    k += 1;
                } else {
                    res += InputNumber("Input number of " + arr[i] + " =", k);
                    k = 1;
                }
            }
        }
        System.out.println(res);
    }

    private static Integer InputNumber(String line, Integer key) {
        int numb = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(line);
        while (true) {
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                numb = scanner.nextInt();
                return numb * key;
            } else {
                System.out.println("It must be a number");
            }
        }
    }
}
