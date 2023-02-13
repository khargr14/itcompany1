package com.solved;

// Java program for implementation of Insertion Sort
public class InsertionSort {

    public void sort(double arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            double key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
        //System.out.println("Double value " + d);
    }

   public void printArray2()
    {double arr[] = new double[0];
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
        //System.out.println("Double value " + d);
    }

};



