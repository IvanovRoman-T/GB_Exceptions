import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random random = new Random();


    public static void main(String[] args) {
        task1();
//        task2();
    }


    //    Создание массива случайной длины со случайными элементами
    static int[] createArray() {
        int[] result = new int[random.nextInt(3, 6)];
        if (random.nextInt(10) == 0) {
            result = null;
        }
        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                result[i] = random.nextInt(-10, 11);
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }


    /*
    1) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.
     */

    static void task1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(subtractArrays(createArray(), createArray())) + "\n");
        }
    }


    static int[] subtractArrays(int[] a1, int[] a2) {
        if (a1 == null || a2 == null) {
            throw new RuntimeException("Оба массива должны существовать.");
        }
        if (a1.length != a2.length) {
            throw new RuntimeException("Длины массивов должны совпадать.");
        }
        int[] result = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i] - a2[i];
        }
        return result;
    }


    /*
     2) * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.
    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
     */

    static void task2() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(divideArrays(createArray(), createArray())) + "\n");
        }
    }


    static double[] divideArrays(int[] a1, int[] a2) {
        if (a1 == null || a2 == null) {
            throw new RuntimeException("Оба массива должны существовать.");
        }
        if (a1.length != a2.length) {
            throw new RuntimeException("Длины массивов должны совпадать.");
        }
        double[] result = new double[a1.length];
        for (int i = 0; i < a1.length; i++) {
            if (a2[i] == 0) {
                throw new RuntimeException("Деление на ноль.");
            }
            result[i] = (double) a1[i] / (double) a2[i];
        }
        return result;
    }
}