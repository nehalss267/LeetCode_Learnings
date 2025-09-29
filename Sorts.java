//Insertion sort-> Put that index element at the correct index of LHS
//pass 1 (when index 0)-> sort till index 1 :: pass n-> sort till index n
//i<=n-2
//j>0;j=i+1  when arr[j]>arr[j-1]:break (LHS already sorted) j--
//Time complexity: best case=O(n-1) worst case=O(n**2)
//Since sorts from 1 to n-1 Sum till n-1 elements=[n-1(n-1+1)]/2~n**2

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        int temp = 0;
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0;j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        for (int elem : arr) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        int [] arr={1,4,5,2};
        insertionSort(arr);
    }

}
