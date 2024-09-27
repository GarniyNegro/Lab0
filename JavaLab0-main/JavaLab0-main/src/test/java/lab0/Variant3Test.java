package lab0;

import org.testng.annotations.Test;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class Variant3Test {


    //    Integer
    @Test
    public void testFileSizeInKilobytes() {
        int result1 = Variant3.task1(2048);
        System.out.println("File size in kilobytes (2048 bytes): " + result1);
        assertEquals(result1, 2);

        int result2 = Variant3.task1(1023);
        System.out.println("File size in kilobytes (1023 bytes): " + result2);
        assertEquals(result2, 0);

        int result3 = Variant3.task1(3072);
        System.out.println("File size in kilobytes (3072 bytes): " + result3);
        assertEquals(result3, 3);

        int result4 = Variant3.task1(512);
        System.out.println("File size in kilobytes (512 bytes): " + result4);
        assertEquals(result4, 0);
    }




    //    Boolean
    @Test
    public void testIsEven() {
        Variant3 checker = new Variant3();

        // Перевірка, чи число є парним
        boolean result1 = checker.task2(4);
        System.out.println("Number 4 is even: " + result1);
        assertTrue(result1, "Number 4 should be even");

        boolean result2 = checker.task2(5);
        System.out.println("Number 5 is even: " + result2);
        assertFalse(result2, "Number 5 should be odd");
    }




    //    If
    @Test
    public void testModifyNumber() {
        Variant3 modifier = new Variant3();

        // Тестуємо додатні числа
        int result1 = modifier.task3(5);
        System.out.println("Result for 5: " + result1);
        assertEquals(result1, 6);

        int result2 = modifier.task3(10);
        System.out.println("Result for 10: " + result2);
        assertEquals(result2, 11);

        // Тестуємо від'ємні числа
        int result3 = modifier.task3(-3);
        System.out.println("Result for -3: " + result3);
        assertEquals(result3, -5);

        int result4 = modifier.task3(-1);
        System.out.println("Result for -1: " + result4);
        assertEquals(result4, -3);

        // Тестуємо нуль
        int result5 = modifier.task3(0);
        System.out.println("Result for 0: " + result5);
        assertEquals(result5, 10);
    }




    //    Case
    @Test
    public void testSeasonByMonth() {
        // Тестуємо зиму
        assertEquals(Variant3.task4(1), "Зима");
        assertEquals(Variant3.task4(12), "Зима");

        // Тестуємо весну
        assertEquals(Variant3.task4(3), "Весна");
        assertEquals(Variant3.task4(5), "Весна");

        // Тестуємо літо
        assertEquals(Variant3.task4(6), "Літо");
        assertEquals(Variant3.task4(8), "Літо");

        // Тестуємо осінь
        assertEquals(Variant3.task4(9), "Осінь");
        assertEquals(Variant3.task4(11), "Осінь");

        // Тестуємо некоректний місяць
        assertEquals(Variant3.task4(13), "Невірний номер місяця");
    }


    //    For
    @Test
    public void testPrintNumbersInDescendingOrder() {
        Variant3 task = new Variant3();

        // Тестуємо діапазон з числами
        String result1 = task.task5(1, 5);
        System.out.println("Result for A=1 and B=5:\n" + result1);
        assertEquals(result1, "4 3 2\nCount: 3");

        String result2 = task.task5(2, 4);
        System.out.println("Result for A=2 and B=4:\n" + result2);
        assertEquals(result2, "3\nCount: 1");

        // Тестуємо випадок без чисел між A і B
        String result3 = task.task5(3, 3);
        System.out.println("Result for A=3 and B=3:\n" + result3);
        assertEquals(result3, "No numbers between 3 and 3");
    }



    //    while
    @Test
    public void testDivisionAndRemainder() {
        Variant3 task = new Variant3();

        // Тестуємо з різними значеннями N і K
        int[] result1 = task.task6(16, 3);
        System.out.println("Result for N=16 and K=3: Quotient=" + result1[0] + ", Remainder=" + result1[1]);
        assertEquals(result1[0], 5);
        assertEquals(result1[1], 1);


        int[] result2 = task.task6(17, 4);
        System.out.println("Result for N=17 and K=4: Quotient=" + result2[0] + ", Remainder=" + result2[1]);
        assertEquals(result2[0], 4);
        assertEquals(result2[1], 1);

        int[] result3 = task.task6(25, 5);
        System.out.println("Result for N=25 and K=5: Quotient=" + result3[0] + ", Remainder=" + result3[1]);
        assertEquals(result3[0], 5);
        assertEquals(result3[1], 0);

        int[] result4 = task.task6(10, 10);
        System.out.println("Result for N=10 and K=10: Quotient=" + result4[0] + ", Remainder=" + result4[1]);
        assertEquals(result4[0], 1);
        assertEquals(result4[1], 0);

        // Тестуємо випадок, коли N менше K
        int[] result5 = task.task6(5, 10);
        System.out.println("Result for N=5 and K=10: Quotient=" + result5[0] + ", Remainder=" + result5[1]);
        assertEquals(result5[0], 0);
        assertEquals(result5[1], 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidK() {
        Variant3 task = new Variant3();
        task.task6(10, 0);  // K не може бути нульовим або від'ємним
    }



    //    array
    @Test
    public void testGenerateArithmeticProgression() {
        Variant3 task = new Variant3();

        // Тестуємо створення масиву арифметичної прогресії
        int[] result1 = task.task7(5, 1, 2);
        System.out.println("Result for N=5, A=1, D=2: " + Arrays.toString(result1));
        assertEquals(result1, new int[]{1, 3, 5, 7, 9});

        int[] result2 = task.task7(4, 0, 3);
        System.out.println("Result for N=4, A=0, D=3: " + Arrays.toString(result2));
        assertEquals(result2, new int[]{0, 3, 6, 9});

        int[] result3 = task.task7(3, -2, 1);
        System.out.println("Result for N=3, A=-2, D=1: " + Arrays.toString(result3));
        assertEquals(result3, new int[]{-2, -1, 0});

        // Тестуємо з різними значеннями
        int[] result4 = task.task7(6, 10, -1);
        System.out.println("Result for N=6, A=10, D=-1: " + Arrays.toString(result4));
        assertEquals(result4, new int[]{10, 9, 8, 7, 6, 5});
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidN() {
        Variant3 task = new Variant3();
        task.task7(1, 5, 2);  // N не може бути менше або дорівнювати 1
    }




    //  matrix
    @Test
    public void testGenerateMatrix() {
        Variant3 task = new Variant3();

        int[] numbers1 = {1, 2, 3};
        int[][] result1 = task.task8(3, 4, numbers1);
        int[][] expected1 = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3}
        };
        assertEquals(result1, expected1);

        int[] numbers2 = {5, 10};
        int[][] result2 = task.task8(4, 3, numbers2);
        int[][] expected2 = {
                {5, 5, 5},
                {10, 10, 10},
                {5, 5, 5},
                {10, 10, 10}
        };
        assertEquals(result2, expected2);

        int[] numbers3 = {7};
        int[][] result3 = task.task8(2, 5, numbers3);
        int[][] expected3 = {
                {7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7}
        };
        assertEquals(result3, expected3);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidMatrixParameters() {
        Variant3 task = new Variant3();
        task.task8(0, 3, new int[]{1, 2, 3});  // M має бути більше 0
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidNumbersArray() {
        Variant3 task = new Variant3();
        task.task8(3, 3, null);  // Масив numbers не може бути null
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEmptyNumbersArray() {
        Variant3 task = new Variant3();
        task.task8(3, 3, new int[]{});  // Масив numbers не може бути порожнім
    }
}