package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort sort = new Sort();

    @Test
    public void insertSort() {
        int[] arr = sort.create(50000);
        arr = sort.shuffle(arr);
        System.out.println("insertSort 1st : " + sort.getTimInsertSort(arr));
        System.out.println("insertSort 2st : " + sort.getTimInsertSort(arr));
        System.out.println();
    }

    @Test
    public void bubbleSort() {
        int[] arr = sort.create(50000);
        arr = sort.shuffle(arr);
        System.out.println("bubbleSort 1st : " + sort.getTimeBubbleSort(arr));
        System.out.println("bubbleSort 2st : " + sort.getTimeBubbleSort(arr));
        System.out.println();
    }
    @Test
    public void arraysSort() {
        int[] arr = sort.create(50000);
        arr = sort.shuffle(arr);
        System.out.println("Arrays sort 1st : " + sort.getTimeArraysSort(arr));
        System.out.println("Arrays sort 2st : " + sort.getTimeArraysSort(arr));
        System.out.println();
    }
}