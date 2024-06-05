public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] ints = {7, 8, 2, 5, 1, 0};
        selectionSort.sort(ints);
        selectionSort.printArray(ints);
    }


    public int[] sort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int min_idx = i;
            for(int j=i+1; j<=arr.length-1; j++){
                /*if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }*/

                if(arr[min_idx]> arr[j]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public void printArray(int[] arr){
        for (int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }


}
