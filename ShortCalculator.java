import java.util.Scanner;

/*7. Напишите программу, вводящую два числа в пределах от 0 до 65535, сохраняющую их в переменных типа short
        и вычисляющую их сумму, разность, произведение, частное и остаток без знака, не преобразуя эти
        величины в тип int.*/
public class ShortCalculator {
    public static final int offset = 32768;

    public static void main(String[] args) {
        System.out.println("Введите два числа в пределах от 0 до 65535");
        Scanner input = new Scanner(System.in);
        String firstNumber = input.nextLine();
        String secondNumber = input.nextLine();
        System.out.println("Сумма: " + (stringToShort(firstNumber) + stringToShort(secondNumber) + offset * 2));
        System.out.println("разность: " + (stringToShort(firstNumber) - stringToShort(secondNumber)));
        System.out.println("произведение: " + ((stringToShort(firstNumber) + offset) * (stringToShort(secondNumber) + offset)));
        System.out.println("частное: " + ((stringToShort(firstNumber) + offset) / (stringToShort(secondNumber) + offset)));
        System.out.println("остаток: " + ((stringToShort(firstNumber) + offset) % (stringToShort(secondNumber) + offset)));
    }

    private static short stringToShort(String value) {
        return (short) (Integer.parseInt(value) - offset);
    }

}
