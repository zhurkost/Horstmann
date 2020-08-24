import java.util.Scanner;

/*11. Напишите программу, вводящую текстовую строку и выводящую все символы,
        не представленные в коде ASCII, вместе с их значениями в Юникоде.*/
public class ASCIIVerificator {
    public static void main(String[] args) {
        System.out.println("Введите текстовую строку");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            String unicodeCode = Integer.toHexString(inputString.charAt(i)).toUpperCase();
            String unicodeMissingNumbers = "0000".substring(0, 4 - unicodeCode.length());
            if (inputString.charAt(i) > 127) {
                System.out.print("Символ не представлен в ASCII: ");
                System.out.print(inputString.charAt(i));
                System.out.println(" " + unicodeMissingNumbers + unicodeCode);
            }
        }
    }
}
