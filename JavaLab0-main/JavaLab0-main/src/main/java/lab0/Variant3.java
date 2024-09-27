package lab0;

public class Variant3 {
    //  integer
    public static int task1(int fileSizeInBytes) {
        return fileSizeInBytes / 1024;
    }


    //  boolean
    public boolean task2(int A) {
        return A % 2 == 0;
    }


    //  if
    public int task3(int number) {
        if (number > 0) {
            return number + 1;
        } else if (number < 0) {
            return number - 2;
        } else {
            return 10;
        }
    }


    //  case
    public static String task4(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                return "Зима";
            case 3:
            case 4:
            case 5:
                return "Весна";
            case 6:
            case 7:
            case 8:
                return "Літо";
            case 9:
            case 10:
            case 11:
                return "Осінь";
            default:
                return "Невірний номер місяця";
        }
    }


    //  for
    public String task5(int A, int B) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = B - 1; i > A; i--) {
            result.append(i).append(" ");
            count++;
        }

        // Удалити пробіл після останнього числа
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        if (count > 0) {
            result.append("\nCount: ").append(count);
        } else {
            result.append("No numbers between ").append(A).append(" and ").append(B);
        }

        return result.toString().trim();
    }




    //  while
    public int[] task6(int N, int K) {
        if (K <= 0) {
            throw new IllegalArgumentException("K must be positive");
        }

        int quotient = 0;
        int remainder = N;

        while (remainder >= K) {
            remainder -= K;
            quotient++;
        }

        return new int[]{quotient, remainder};
    }


    //  array
    public int[] task7(int N, int A, int D) {
        if (N <= 1) {
            throw new IllegalArgumentException("N must be greater than 1");
        }

        int[] progressionArray = new int[N];

        for (int i = 0; i < N; i++) {
            progressionArray[i] = A + i * D;
        }

        return progressionArray;
    }


    //  matrix
    public int[][] task8(int M, int N, int[] numbers) {
        if (M <= 0 || N <= 0 || numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        int[][] matrix = new int[M][N];

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                matrix[i][j] = numbers[i % numbers.length];
            }
        }

        return matrix;
    }
}