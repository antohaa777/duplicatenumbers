import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, this program will help you to check if there is duplicate numbers in number ");
        System.out.println("Please write a number");
        String num1 = scanner.next();
        char[] num2 = num1.toCharArray();
        int numm1 = Integer.parseInt(num1);
        int rr = 0;
        boolean res = false;
        System.out.println("Your number is:" + num1);
        for (int i = 0; i < num1.length(); i++) {
            for (int j = i + 1; j < num1.length(); j++) {
                if (num2[i] == num2[j]) {
                    res = true;
                    break;
                }
            }
            }
        System.out.println(res);
            }
                }
