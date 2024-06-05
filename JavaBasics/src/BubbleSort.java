public class BubbleSort {
    public static int[] sort(int[] arr){
        int length = arr.length;
        for(int i=0; i<length-1;i++){
            boolean swapped = false;
            for(int j=0; j<length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] ints = {0,1,2,3,4,5,6};
        printArray(ints);
        System.out.println("");
        ints = sort(ints);
        printArray(ints);

    }
}
