import java.util.Scanner;

//       1.Напишите программу, вводящую целочисленное значение и выводящую его
//       в двоичной, восьмеричной и шестнадцатеричной форме. Организуйте вывод
//       обратного значения в виде шестнадцатеричного числа с плавающей точкой.
public class NumberConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целочисленное значение");
        int inputValue = input.nextInt();
        int binaryRemainder = inputValue;
        String binary = "";
        while (binaryRemainder != 0) {
            binary = binaryRemainder % 2 + binary;
            binaryRemainder = binaryRemainder / 2;
        }
        System.out.println("В двоичном представлении: 0b" + binary);
        String octal = "";
        int octalRemainder = inputValue;
        while (octalRemainder != 0) {
            octal = octalRemainder % 8 + octal;
            octalRemainder = octalRemainder / 8;
        }
        System.out.println("В восьмеричном представлении: 0" + octal);
        System.out.printf("В шестнадцатиричном представлении: Ox%X", inputValue);
        double inverseValue = (double) 1 / inputValue;
        System.out.println();
        System.out.println("Обратное число в десятичной форме: " + inverseValue);
        System.out.printf("Обратное число в шестнадцатиричном представлении с плавающей точкой: %a", inverseValue);
    }
}
