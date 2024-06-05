public class MergeSort2 {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7, 0 };

        System.out.println("Given array is");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int[] sort(int[] arr, int l, int r){
       /* int r = arr.length-1;
        int l = 0;*/

        if(l<r){
            int mid = l + (r-l)/2;

            sort(arr, l, mid);//recursion? condition to fail
            sort(arr, mid+1, r);
            merge(arr, l,mid, r);
        }
        return arr;

    }

    public static int[] merge(int[] arr, int l, int mid, int r){

        int sizeL = mid-l+1;
        int sizeR = r-mid;

        int[] arrL = new int[sizeL];
        int[] arrR = new int[sizeR];

        for(int i=0; i<sizeL; i++){
            arrL[i] = arr[l+i];
        }
        for(int i=0; i<sizeR; i++){
            arrR[i] = arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=0;

        while(i<sizeL && j<sizeR){
            if(arrL[i] <= arrR[j]){
                arr[k] = arrL[i];
                i++;
                k++;
            }else{
                arr[k] = arrR[j];
                j++;
                k++;
            }
        }
        if(i<sizeL){
            arr[k] = arrL[i];
            i++;
            k++;
        }
        if(j<sizeR){
            arr[k] = arrL[j];
            j++;
            k++;
        }
        return arr;
    }
}
