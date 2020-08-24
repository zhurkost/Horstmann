import java.util.Arrays;

/*13. Напишите программу, выбирающую и выводящую лотерейную комбинацию
        из шести отдельных чисел в пределах от 1 до 49. Чтобы выбрать шесть отдельных чисел, начните со списочного
        массива, заполняемого числами от 1 до 49.
        Выберите произвольный индекс и удалите элемент массива. Повторите эти
        действия шесть раз подряд. Выведите полученный результат в отсортированном порядке.*/
public class LotteryDrawing {
    public static void main(String[] args) {
        int[] barrels = new int[49];
        for (int i = 0; i < barrels.length; i++) {
            barrels[i] = i + 1;
        }
        int[] recievedBarrels = new int[6];
        for (int i = 0; i < 6; i++) {
            int randomBarrelIndex = (int) (Math.random() * (49 - i - 1));
            recievedBarrels[i] = barrels[randomBarrelIndex];
            removeBarrel(barrels, randomBarrelIndex, 49 - i - 1);
        }
        Arrays.sort(recievedBarrels);
        for (int i = 0; i < 6; i++) {
            System.out.println(recievedBarrels[i]);
        }
    }

    private static void removeBarrel(int[] array, int recievedBarrelIndex, int lastBarrelIndex) {
        array[recievedBarrelIndex] = array[lastBarrelIndex];
        array[lastBarrelIndex] = 0;
    }
}
