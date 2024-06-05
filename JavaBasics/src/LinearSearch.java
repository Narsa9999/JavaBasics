public class LinearSearch {

    static void search(int arr[], int target){
        int length = arr.length;
        for(int i=0; i<length; i++){
            if(arr[i] == target) {
                System.out.println(target + " found at : " + i);
                return;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 56, 8, 9, 51, 89, 34};
        int arr2[] = new int[]{1, 2};
        int arr3[] = new int[2];
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[1] = 10;
        search(arr, 9);
    }
}
