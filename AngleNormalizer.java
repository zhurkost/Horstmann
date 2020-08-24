import java.util.Scanner;
import static java.lang.Math.abs;
//2. Напишите программу, вводящую целочисленное (как положительное, так и
//отрицательное) значение угла и нормализующую его в пределах от 0 до 359
//градусов.
public class AngleNormalizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целочисленное значение угла: ");
        int inputAngle = input.nextInt();
        int normalizeAngle;
        normalizeAngle = inputAngle > 0 ? abs(inputAngle % 360) : 360 - abs(inputAngle % 360);
        System.out.println("Нормализованное значение угла: " + normalizeAngle);
    }
}

