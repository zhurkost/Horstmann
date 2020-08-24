import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*8. Напишите программу, вводящую символьную строку и выводящую все ее непустые подстроки.*/
public class BlankDeleter {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        int startIndex = 0;
        String reformedString = "";
        int blankIndex;
        do {
            blankIndex = inputString.indexOf(" ", startIndex);
            if (blankIndex >= 0) {
                reformedString = reformedString + inputString.substring(startIndex, blankIndex);
                startIndex = blankIndex + 1;
            } else {
                reformedString = reformedString + inputString.substring(startIndex, inputString.length());
            }
        }
        while (blankIndex >= 0);
        System.out.println("Методом indexOf: " + reformedString);
        System.out.println("наличие пробелов: " + reformedString.contains(" "));
        String replacedString = inputString.replace(" ", "");
        System.out.println("Методом replace: " + replacedString);
        System.out.println("наличие пробелов: " + replacedString.contains(" "));
        System.out.println("проверка идентичности полученных строк: " + reformedString.equals(replacedString));
    }
}
