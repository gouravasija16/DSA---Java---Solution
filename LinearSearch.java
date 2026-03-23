import java.util.Arrays;

//public class LinearSearch {
//    public static void main(String[] args) {
//        int [] arr={5,7,9,11,14,19,21,23};
//        int target=19;
//        System.out.println(LinearSearch(arr,target));
//    }
//    static int LinearSearch(int [] arr,int target){
//        if (arr.length==0) return -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==target) return i;
//        }
//        return -1;
//    }
//}
public class LinearSearch {
    public static void main(String[] args) {
        int [] [] arr={
                {6,7,9,10},
                {8,9,87,5},
                {5,2,98,23}
        };
        int target=99;
        int [] ans= LinearSearch2D(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] LinearSearch2D(int[][]arr,int target ){
        if (arr.length==0) return new int[]{-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}

