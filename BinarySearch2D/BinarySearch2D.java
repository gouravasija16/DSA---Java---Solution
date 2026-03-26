//Elements are sorted by row and column wise
import java.util.Arrays;
public class BinarySearch2D {
    public static void main(String[] args) {
        int [] [] matrix={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target=90;
        int [] ans=BinarySearch2D(matrix,target);
        System.out.println(Arrays.toString(ans));
    }
    static int [] BinarySearch2D(int [][] matrix,int target){
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
            if (matrix[r][c] ==target) {
                return new int[]{r,c};
            }if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return new int []{-1,-1};
    }
}
