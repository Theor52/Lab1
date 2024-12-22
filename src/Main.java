import java.util.*;

public class Main {
    public static void main(String[] args) {
        // створення чисел різних типів
        int intNumber = 42;
        double doubleNumber = 42.58;
        float floatNumber = 19.95f;
        long longNumber = 123456789L;
        short shortNumber = 32000;
        byte byteNumber = 127;

        // долучення чисел до списку (універсальний список)
        List<Number> numbers = new ArrayList<>();
        numbers.add(intNumber);
        numbers.add(doubleNumber);
        numbers.add(floatNumber);
        numbers.add(longNumber);
        numbers.add(shortNumber);
        numbers.add(byteNumber);

        // виведення чисел на екран
        System.out.println("All numbers:");
        for (Number number : numbers) {
            System.out.println(number);
        }

        // виведення чисел у форматі цілих чисел
        System.out.println("\nNumbers as integers:");
        for (Number number : numbers) {
            System.out.println(number.intValue());
        }

        // виведення чисел у форматі дробних чисел з 2 знаками після коми
        System.out.println("\nNumbers as floats with 2 decimal places:");
        for (Number number : numbers) {
            System.out.printf("%.2f\n", number.doubleValue());
        }

        // розподіл чисел за типами в окремі списки
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();
        List<Long> longList = new ArrayList<>();
        List<Short> shortList = new ArrayList<>();
        List<Byte> byteList = new ArrayList<>();

        for (Number number : numbers) {
            if (number instanceof Integer) {
                integerList.add((Integer) number);
            } else if (number instanceof Double) {
                doubleList.add((Double) number);
            } else if (number instanceof Float) {
                floatList.add((Float) number);
            } else if (number instanceof Long) {
                longList.add((Long) number);
            } else if (number instanceof Short) {
                shortList.add((Short) number);
            } else if (number instanceof Byte) {
                byteList.add((Byte) number);
            }
        }

        // виведення чисел з кожного списку
        System.out.println("\nIntegers: " + integerList);
        System.out.println("Doubles: " + doubleList);
        System.out.println("Floats: " + floatList);
        System.out.println("Longs: " + longList);
        System.out.println("Shorts: " + shortList);
        System.out.println("Bytes: " + byteList);

        // обчислення суми квадратів всіх чисел
        double sumOfSquares = 0;
        for (Number number : numbers) {
            // зведення до квадрату
            sumOfSquares += Math.pow(number.doubleValue(), 2);
        }
        System.out.println("\nSum of squares of all numbers: " + sumOfSquares);
    }
}
