package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        triangle_number();
        fact();
        simple_numbers();
        calc();
        // equ(); - не доделал
    }

    public static void triangle_number() {
        System.out.println("Input number");
        int numb = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                numb = scanner.nextInt();
                if (numb < 0) {
                    System.out.println("Number must be > 0");
                } else {
                    break;
                }
            } else {
                System.out.println("It must be a number");
            }
        }
        int treangle = numb * (numb + 1) / 2;
        System.out.println("Treangle number of " + numb + " = " + treangle);
    }

    public static void fact() {
        System.out.println("Input number");
        int numb = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                numb = scanner.nextInt();
                if (numb < 0) {
                    System.out.println("Number must be > 0");
                } else {
                    break;
                }
            } else {
                System.out.println("It must be a number");
            }
        }
        int result = 1;
        if (numb == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= numb; i++) {
                result *= i;
            }
            System.out.println(numb + "! = " + result);
        }
    }

    public static void simple_numbers() {
        int k = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        k++;
                    }
                }
                if (k == 2) {
                    System.out.print(i + " ");
                }
                k = 0;
            }
        }
    }

    public static void calc() {
        System.out.println("Input first number");
        double numb1 = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                numb1 = scanner.nextDouble();
                break;
            } else {
                System.out.println("It must be a number");
            }
        }
        System.out.println("Input second number");
        double numb2 = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                numb2 = scanner.nextDouble();
                break;
            } else {
                System.out.println("It must be a number");
            }
        }
        String[] arr = new String[] { "+", "-", "*", "/" };
        int flag = 0;
        String fun = "";
        while (true) {
            System.out.println("Input one from " + Arrays.toString(arr));
            Scanner scanner = new Scanner(System.in);
            fun = scanner.next();
            for (int i = 0; i < arr.length; i++) {
                if (fun.equals(arr[i])) {
                    flag++;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        if (fun.equals(arr[0])) {
            System.out.println(numb1 + numb2);
        } else if (fun.equals(arr[1])) {
            System.out.println(numb1 - numb2);
        } else if (fun.equals(arr[2])) {
            System.out.println(numb1 * numb2);
        } else {
            System.out.println(numb1 / numb2);
        }

    }

    public static void equ() {
        System.out.println("Input equation");
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        equation = equation.replace(" ", "");
        System.out.println(equation);
        equation = equation.replace("+", "=");
        System.out.println(equation);
        String[] arr = equation.split("=");
        System.out.println(Arrays.toString(arr));
        String q = arr[0];
        String w = arr[1];
        String e = arr[2];
        int a = 0;
        int b = 0;
        int res = 0;
        for (int i = 0; i < q.length(); i++) {
            if (q.charAt(i) == '?'){
                a = e.charAt(i);
                b = w.charAt(i);
                res = a - b;
                
            }
        }
    }
}