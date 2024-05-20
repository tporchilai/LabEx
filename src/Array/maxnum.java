package Array;

public class maxnum {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int max = findMaxValue(array);
        System.out.println("Maximum value in the 2D array: " + max);
    }

    public static int findMaxValue(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                max = Math.max(max, element);
            }
        }
        return max;




    }
}
