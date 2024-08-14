package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] bubbleArr = {4,1,3,9,7};
        bubblesort(bubbleArr);

        System.out.println("Bubble sort");
        for (int i : bubbleArr) {
            System.out.print(i+", ");
        }
        System.out.println();

    }

    public static int[] bubblesort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }


    public static String countSort(String str){
        int n = str.length();
        int[] count = new int[26];

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count[c-'a']++;
            }else {
                throw new IllegalArgumentException("invalid input string");
            }
        }

        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while(count[i] > 0){
                sortedString.append((char) (i+'a'));
                count[i]--;
            }
        }
        return sortedString.toString();

    }

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int[] quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
        return arr;
    }



}