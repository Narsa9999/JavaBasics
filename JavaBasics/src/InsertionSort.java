public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 2, 9, 6, 4, 123, 675, 981, 109};
        arr = sort(arr);
        printArray(arr);
    }

    public static int[] sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j = i-1;
            int valueToCompare = arr[i];
            while(j>=0 && arr[j]>valueToCompare){
                arr[j+1] = arr[j];
                j--;
            }
            /*With for loop
            for(int j=i-1; j>=0; j--){
                if(arr[j]>valueToCompare) {
                    arr[j+1] =arr[j];
                    arr[j]=valueToCompare;
                }
            }*/
            arr[j+1]=valueToCompare;
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
