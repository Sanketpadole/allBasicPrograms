import java.util.Arrays;

public class Shubhamsir {
	public static void main(String[] args) {
        int[][] arr = {
                {1, 12, 23, 4, 53, 16},
                {3, 12, 3, 8, 53, 16},
                {4, 12, 23, 47, 63, 16},
                {15, 14, 23, 4, 53, 16},
                {61, 12, 3, 44, 57, 86}
        };
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

}
