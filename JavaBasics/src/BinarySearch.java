public class BinarySearch {

    static int recursiveSearch(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) {
                left = mid + 1;
                return recursiveSearch(arr, target, left, right);
            }
            if (arr[mid] > target) {
                right = mid - 1;
                return recursiveSearch(arr, target, left, right);
            }
        }
        return -1;
    }

    static int iterativeSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) {
                left = mid + 1;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] ints = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 49};
        int target = 49;
        System.out.println("Target found at " + recursiveSearch(ints, target, 0, ints.length - 1));
        System.out.println("With Iterative Search Target found at " + iterativeSearch(ints, target));

    }
}
