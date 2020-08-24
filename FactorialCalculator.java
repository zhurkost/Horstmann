import java.math.BigInteger;
import java.util.Scanner;

/*6. Напишите программу, вычисляющую факториал п ! = 1 х 2 * . . . х п,
        используя класс Biglnteger. Вычислите факториал числа 1000.*/
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число");
        int inputNumber = input.nextInt();
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 0; i < inputNumber; i++) {
            factorial = BigInteger.valueOf(i + 1).multiply(factorial);
        }
        System.out.println("Факториал числа " + inputNumber + " равен " + factorial);
    }
}
