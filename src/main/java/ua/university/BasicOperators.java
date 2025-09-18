package ua.university;

import java.util.Arrays;

public class BasicOperators {

    public static double[] sumAndAverage(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        return new double[]{sum, avg};
    }

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static char gradeFromScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        if (score >= 50) return 'E';
        return 'F';
    }

    public static String dayOfWeek(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Day must be between 1 and 7");
        };
    }

    public static int[] countdown(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
        return arr;
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative factorial not defined");
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int[] reverseArray(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array cannot be null");
        int[] res = Arrays.copyOf(arr, arr.length);
        for (int i = 0, j = res.length - 1; i < j; i++, j--) {
            int tmp = res[i];
            res[i] = res[j];
            res[j] = tmp;
        }
        return res;
    }

    public static int sumMatrix(int[][] matrix) {
        if (matrix == null) throw new IllegalArgumentException("Matrix cannot be null");
        int sum = 0;
        for (int[] row : matrix) {
            if (row != null) {
                for (int val : row) {
                    sum += val;
                }
            }
        }
        return sum;
    }

    public static boolean isPalindrome(String s) {
        if (s == null) throw new IllegalArgumentException("String cannot be null");
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        int i = 0, j = cleaned.length() - 1;
        while (i < j) {
            if (cleaned.charAt(i) != cleaned.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array is null or empty");
        int min = arr[0], max = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        return new int[]{min, max};
    }

    public static int[][] multiplicationTable(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        int[][] table = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }
        return table;
    }

    public static int[] evenNumbersUpToN(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        int size = n / 2;
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = 2 * (i + 1);
        }
        return res;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static int countVowels(String s) {
        if (s == null) throw new IllegalArgumentException("String cannot be null");
        int count = 0;
        String lower = s.toLowerCase();
        for (char c : lower.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) count++;
        }
        return count;
    }

    public static int[] fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n == 0) return new int[0];
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int[][] transpose(int[][] matrix) {
        if (matrix == null) throw new IllegalArgumentException("Matrix cannot be null");
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    public static int[] sortArray(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array cannot be null");
        int[] res = Arrays.copyOf(arr, arr.length);
        Arrays.sort(res);
        return res;
    }
}
