package sort;

import java.util.Arrays;
import java.util.Random;

public class Sort {
    Random r;

    public Sort() {
        r = new Random();
    }

    public int[] create(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public int[] shuffle(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int index = r.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
        return arr;
    }


    public long getTimInsertSort(int[] arr) {
        long start = System.currentTimeMillis();
        insertionSort(arr);
        long end = System.currentTimeMillis();
        return end - start;
    }

    public long getTimeBubbleSort(int[] arr) {
        long start = System.currentTimeMillis();
        bubbleSort(arr);
        long end = System.currentTimeMillis();
        return end - start;
    }

    public long getTimeArraysSort(int[] arr) {
        long start = System.currentTimeMillis();
        arraysSort(arr);
        long end = System.currentTimeMillis();
        return end - start;
    }


    public void insertionSort(int[] arr) {
        //insertion sort
        int temp, aux;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            aux = i - 1;

            while (aux >= 0 && arr[aux] > temp) {
                arr[aux + 1] = arr[aux];
                aux--;
            }
            arr[aux + 1] = temp;
        }
    }


    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    public void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if (start < part2 - 1) {
            quickSort(arr, start, part2 - 1);
        }

        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    public int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < end) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    public void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ",");
        }
        System.out.println();
    }

    public void mergeSort(int[] arr) {
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length - 1);
    }

    public void mergeSort(int[] arr, int[] tmp, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid + 1, end);
            merge(arr, tmp, start, mid, end);
        }
    }

    public void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        int part1 = start;
        int part2 = mid + 1;
        int index = start;

        while(part1 <= mid && part2 <= end) {
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }

        for (int i = 0; i <= mid - part1 ; i++) {
            arr[index + i] = tmp[part1 + i];
        }
    }

    public void arraysSort(int[] arr) {
        Arrays.sort(arr);
    }

    //MergeSort top-down 구현
    public void topDownMergeSort(int[] arr, int[] tmp, int n) {
       // copyArray(arr, 0, n, tmp);
        //topDownSplitMerge(tmp, 0, n, arr);
    }

























}
