public class BinarySearch {
    public static void main(String[] args){
        int[] sortedInts = {-221,45,63,185,2001,4200,7411,7801,8000, 9012};
        System.out.println("Found value at index " + BinSort(sortedInts, -221)); 
    }
    public static int BinSort(int[] arr, int x){
        int lCon = 0;
        int rCon = arr.length -1;
        while (true){
            int mid = (lCon + rCon) / 2;
            if(x == arr[mid]){
                return mid;
            }
            if (x > arr[mid]){
                lCon = mid;
                if(arr[mid+1] == x){
                    return mid + 1;
                }
            }
            if (x < arr[mid]){
                rCon = mid;
            }
        }
    }
}
