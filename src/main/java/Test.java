import sort.Sort;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3,9,4,7,5,0,1,6,8,2};
        Sort s = new Sort();
        s.printArray(arr);
        s.mergeSort(arr);
        s.printArray(arr);
    }
}
