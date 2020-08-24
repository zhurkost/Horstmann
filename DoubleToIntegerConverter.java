/*5. Что произойдет, если привести числовое значение типа double к значению
        типа int, которое больше самого большого значения типа int? Попробуйте
        сделать это.*/
public class DoubleToIntegerConverter {
    public static void main(String[] args) {
        double biggerThanIntegerValue = Math.pow(10, 9) * 4;
        System.out.println(biggerThanIntegerValue);
        int convertedValue = (int) biggerThanIntegerValue;
        System.out.println(convertedValue);
    }
}
