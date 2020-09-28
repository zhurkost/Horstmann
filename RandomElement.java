import java.util.ArrayList;

//10. Предоставьте в классе R a n d o m N u m b e rs два статических метода типа ra n d o m
//        E le m e n t, получающих произвольный элемент из обычного или списочного
//        массива целочисленных значений. (Если обычный или списочный массив пуст,
//        должен быть возвращен нуль.)
public class RandomElement {
    public static void main(String[] args) {
        int[] staff = new int[]{1, 2, 3, 4};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            list.add(i + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomNumbers.randomElement(list) + " ");
            System.out.println(RandomNumbers.randomElement(staff));
        }
    }
}

class RandomNumbers {
    static int randomElement(int[] staff) {
        int position = (int) (Math.random() * staff.length);
        return staff[position];
    }

    static int randomElement(ArrayList list) {
        if (list.size() == 0) {
            return 0;
        }
        int position = (int) (Math.random() * list.size());
        return (int) list.get(position);
    }
}

