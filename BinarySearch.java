
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={5,7,8,11,13,15,19,20};
        int target=11;
        System.out.println(BinarySearch(arr,target));
    }
    static int BinarySearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        if (arr.length ==0) return -1;
        while (end>=start){
            int mid=start+(end-start)/2;
            if (arr[mid]>target) {
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
