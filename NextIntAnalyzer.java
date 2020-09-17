import org.omg.CORBA.IntHolder;

import java.util.Scanner;

public class NextIntAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int castedDecimalVar = input.nextInt(2);
        int decimalVar = input.nextInt();
        System.out.println("castedDecimalVar = " + castedDecimalVar);
        System.out.println("DecimalVar = " + decimalVar);
        System.out.println();
        swapInt(castedDecimalVar, decimalVar);
        System.out.println("after stupid swap method:");
        System.out.println("castedDecimalVar = " + castedDecimalVar);
        System.out.println("DecimalVar = " + decimalVar);
        System.out.println();
        IntHolder holdedCastedDecimalVar = new IntHolder(castedDecimalVar);
        IntHolder holdedDecimalVar = new IntHolder(decimalVar);
        System.out.println("holdedCastedDecimalVar = " + holdedCastedDecimalVar.value);
        System.out.println("holdedDecimalVar = " + holdedDecimalVar.value);
        System.out.println();
        System.out.println("after holder swap method:");
        swapHolderContent(holdedCastedDecimalVar, holdedDecimalVar);
        System.out.println("holdedCastedDecimalVar = " + holdedCastedDecimalVar.value);
        System.out.println("holdedDecimalVar = " + holdedDecimalVar.value);
    }

    static void swapInt(int a, int b) {
        int  temp = a;
        a = b;
        b = temp;
    }

    static void swapHolderContent(IntHolder a, IntHolder b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }


}
