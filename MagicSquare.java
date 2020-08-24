import java.util.Scanner;

/*14. Напишите программу, вводящую двумерный массив целочисленных значений
        и определяющую, содержится ли в нем магический квадрат (т.е. одинаковая
        сумма значений во всех строках, столбцах и диагоналях). Принимая строки
        вводимых данных, разбивайте их на отдельные целочисленные значения, прекратив этот процесс,
        когда пользователь введет пустую строку. Например, на
        следующие вводимые данные:
        16 3 2 13
        3 10 11 8
        9 6 7 12
        4 15 14 1
        (Пустая строка)
        программа должна ответить утвердительно.*/

public class MagicSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputRow;
        System.out.println("Введите кваднратную матрицу (построчно, через пробелы)");
        inputRow = input.nextLine();
        int matrixDimension = rowStringToInteger(inputRow).length;
        int[][] matrix = new int[matrixDimension][matrixDimension];
        int rowIndex = 0;
        matrix[rowIndex] = rowStringToInteger(inputRow);
        do {
            inputRow = input.nextLine();
            if (inputRow.length() > 0) {
                rowIndex++;
                matrix[rowIndex] = rowStringToInteger(inputRow);
            }
        }
        while (inputRow.length() > 0);
        if (isMagic(matrix)) {
            System.out.println("Данная квадратная матрица является магическим квадратом");
        } else {
            System.out.println("Данная квадратная матрица не является магическим квадратом");
        }
    }

    private static int[] rowStringToInteger(String inputRow) {
        int blankCounter = 0;
        for (int i = 0; i < inputRow.length(); i++) {
            if (inputRow.charAt(i) == ' ') {
                blankCounter++;
            }
        }
        int[] blankContainer = new int[blankCounter];
        blankCounter = 0;
        for (int i = 0; i < inputRow.length(); i++) {
            if (inputRow.charAt(i) == ' ') {
                blankContainer[blankCounter] = i;
                blankCounter++;
            }
        }
        int[] line = new int[blankCounter + 1];

        int startIndex = 0;
        for (int i = 0; i < blankCounter; i++) {
            line[i] = Integer.parseInt(inputRow.substring(startIndex, blankContainer[i]));
            startIndex = blankContainer[i] + 1;
        }
        line[blankCounter] = Integer.parseInt(inputRow.substring(blankContainer[blankCounter - 1] + 1));
        return line;
    }

    private static boolean isMagic(int[][] matrix) {
        int[] sum = new int[matrix[0].length * 2 + 2];
        boolean answer = true;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum[i] += matrix[i][j];
            }
        }
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[0].length; i++) {
                sum[j + matrix.length] += matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            sum[sum.length - 2] += matrix[i][i];
        }
        for (int j = 0; j < matrix.length; j++) {
            int i = matrix.length - j - 1;
            sum[sum.length - 1] += matrix[i][j];
        }
        for (int i = 0; i < sum.length - 1; i++) {
            if (sum[i] != sum[i + 1]) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}