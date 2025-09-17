package ua.university;

import java.util.Arrays;

public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] = sum, [1] = average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        return new double[]{sum, avg};
    }

    /**
     * Returns the maximum of three integers.
     */
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    /**
     * Returns the corresponding grade letter for a given numeric score
     */
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

    /**
     * Returns the day of the week name for a number 1-7.
     */
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

    /**
     * Returns an array counting down from n to 1.
     */
    public static int[] countdown(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
        return arr;
    }

    /**
     * Returns factorial of n.
     */
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative factorial not defined");
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    /**
     * Returns a reversed copy of the array.
     */
    public static int[] reverseArray(int[] arr) {
        int[] res = Arrays.copyOf(arr, arr.length);
        for (int i = 0, j = res.length - 1; i < j; i++, j--) {
            int tmp = res[i];
            res[i] = res[j];
            res[j] = tmp;
        }
        return res;
    }

    /**
     * Returns sum of all elements in a 2D array (matrix).
     */
    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                sum += val;
            }
        }
        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        int i = 0, j = cleaned.length() - 1;
        while (i < j) {
            if (cleaned.charAt(i) != cleaned.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    /**
     * Returns minimum and maximum of an array.
     */
    public static int[] findMinMax(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Array empty");
        int min = arr[0], max = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        return new int[]{min, max};
    }

    /**
     * Returns multiplication table n x n.
     */
    public static int[][] multiplicationTable(int n) {
        int[][] table = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }
        return table;
    }

    /**
     * Returns all even numbers up to n.
     */
    public static int[] evenNumbersUpToN(int n) {
        int size = n / 2;
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = 2 * (i + 1);
        }
        return res;
    }

    /**
     * Checks if a number is prime.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    /**
     * Counts vowels in a string.
     */
    public static int countVowels(String s) {
        int count = 0;
        String lower = s.toLowerCase();
        for (char c : lower.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) count++;
        }
        return count;
    }

    /**
     * Returns first n Fibonacci numbers.
     */
    public static int[] fibonacci(int n) {
        if (n <= 0) return new int[0];
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     */
    public static int[][] transpose(int[][] matrix) {
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

    /**
     * Returns a sorted copy of the array in ascending order.
     */
    public static int[] sortArray(int[] arr) {
        int[] res = Arrays.copyOf(arr, arr.length);
        Arrays.sort(res);
        return res;
    }
}
