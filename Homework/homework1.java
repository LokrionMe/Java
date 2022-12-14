package Homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class homework1 {
    public static void main(String[] args) {
        // triangle_number();
        // fact();
        // simple_numbers();
        // calc();
        /* equ(); - оказался выше моего понимания, 
        с некоторыми вариантами справляется(?7 + 6? = 83), но некоторые нет(6? + ?7 = 83),
        почему так происходит я понимаю, но как с такими случаями справиться ума не приложу
        */
        input_formul();
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
        equation = equation.replace("+", "=");
        String[] arr = equation.split("=");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        int k = 0;
        for (int i = arr.length-1; i != -1 ; i--) {
            String a = arr[i];
            if (a.indexOf('?') != -1){
                for (int j = 0; j < a.length() ; j++) {
                    int res = 0;
                    if (a.charAt(j) == '?'){
                        if (i == 0){
                            res = Character.getNumericValue(arr[2].charAt(j)) - Character.getNumericValue(arr[1].charAt(j));
                        } else if (i == 1){
                            res = Character.getNumericValue(arr[2].charAt(j)) - Character.getNumericValue(arr[0].charAt(j));
                        } else {
                            res = Character.getNumericValue(arr[0].charAt(j)) + Character.getNumericValue(arr[1].charAt(j));
                        }
                        if (k==1){
                            if (i==0 || i ==1){
                                res-=1;
                            } else {
                                res +=1;
                            }
                            k-=1;
                        }
                        if (res<0){
                            res+=10;
                            k+=1;
                        } else if (res>=10){
                            res-=10;
                            k+=1;
                        }
                        a = a.replace("?", Integer.toString(res));
                    }                    
                }
                arr[i] = a;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) == Integer.parseInt(arr[2])){
            System.out.println(arr[0]+" + "+arr[1]+" = "+arr[2]);
        }
        else{
            System.out.println("No variants");
        }
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
            if (i == arr.length - 1){
                res += InputNumber("Input number of "+ arr[i] + " =", k);
            } else {
                if (arr[i].equals(arr[i+1])){
                    k+=1;
                } else {
                    res += InputNumber("Input number of "+ arr[i] + " =", k);
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
                return numb*key;
            } else {
                 System.out.println("It must be a number");
            }
        }
    }
}