// Задание

// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 2) Вывести все простые числа от 1 до 1000
// 3) Реализовать простой калькулятор
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;
import java.util.stream.IntStream;

public class wh1 {
    public static void main(String[] args) {
        task3();
    }
    
    static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N for calculate triangular number: ");
        int n = sc.nextInt();
        int tn = 0;
        for (int i = 1; i < n; i++) tn = tn + i;
        System.out.println(tn);
        sc.close();
    }

    static void task2(){
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }
    public static boolean isPrime(final int number) {
        // проверяем число на простоту :-)
        // эту проверку подсмотрел кое где, очень лениво было снова ее писать
        // к тому же лучше у меня бы и не получилось
        return IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }

    static void task3(){
        double num1, num2, ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers an double: ");
        // не понимаю почему не работает эта проверка
        //while(!reader.hasNextDouble()) num1 = reader.nextDouble();
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.println("Error! Enter correct operator");
                return;
      }
      System.out.println("The result is given as follows:");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans + "\n");

    }

    static void task4(){

    }
}
