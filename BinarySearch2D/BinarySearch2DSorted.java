import java.util.Arrays;

// Binary Search in Sorted matrix
public class BinarySearch2DSorted {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int target = 76;
        System.out.println(Arrays.toString(BinarySearch2D(matrix,target)));
    }

    static int[] BinarySearch(int[][] matrix, int target, int row, int start, int end) {
        while (start<=end){
            int mid=start+(end-start)/2;
            if (matrix[row][mid]== target) {
                return new int[]{row,mid};
            }
            if (matrix[row][mid]> target) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] BinarySearch2D(int[][] matrix, int target) {
        if (matrix[0].length == 0) {
            return new int[]{-1, -1};
        }
        if (matrix.length == 1) {
            return BinarySearch(matrix, target, 0, 0, matrix.length - 1);
        }
        int mid_Col = (matrix[0].length) / 2;
        int rStart = 0;
        int rEnd = matrix.length - 1;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][mid_Col] == target) {
                return new int[]{mid, mid_Col};
            } else if (matrix[mid][mid_Col] > target) {
                rEnd = mid;
            } else {
                rStart = mid;
            }
        }
        if (matrix[rStart][mid_Col] == target) {
            return new int[]{rStart, mid_Col};
        }
        if (matrix[rStart + 1][mid_Col] == target) {
            return new int[]{rStart + 1, mid_Col};
        }
        if (matrix[rStart][mid_Col - 1] >= target) {
            return BinarySearch(matrix, target, rStart, 0, mid_Col - 1);
        }
        if (target >= matrix[rStart][mid_Col + 1] && target <= matrix[rStart][matrix.length - 1]) {
            return BinarySearch(matrix, target, rStart, mid_Col + 1, matrix.length - 1);
        }
        if (target <= matrix[rStart + 1][mid_Col - 1]) {
            return BinarySearch(matrix, target, rStart + 1, 0, mid_Col - 1);
        } else {
            return BinarySearch(matrix, target, rStart + 1, mid_Col + 1, matrix.length - 1);
        }
    }
}
