package Shild;

import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Вводи скобки: ");
            String str = scan.nextLine();
            char[] result = str.toCharArray();

            int a = 0;
            int b = 0;
            int c = 0;

            for (int i = 0; i < result.length; i++) {

                switch (result[i]) {
                    case '(': a++;
                        break;
                    case '{': b++;
                        break;
                    case '[': c++;
                        break;
                    case ')': a--;
                        break;
                    case '}': b--;
                        break;
                    case ']': c--;
                        break;

                }

                if (a < 0 || b < 0 || c < 0){
                    System.out.println("Скобки не валидны");
                    break;
                }

                }
            if (a == 0 && b == 0 && c == 0){
                System.out.println("Скобки валидны");
            } else {
                System.out.println("Скобки не валидны");
            }
            }

        }