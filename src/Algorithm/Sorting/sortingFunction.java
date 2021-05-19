package Algorithm.Sorting;

import org.jetbrains.annotations.NotNull;

public class sortingFunction {

    //Selection Sort
    /*
    The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subareas in a given array.

1) The subarea which is already sorted.
2) Remaining subarea which is unsorted.
     */

    public void selectionSort(int[] array){
        for (int i=0;i<array.length;i++){
            int minElementIndex=i;
            int minElement=array[i];
            for (int j=i;j<array.length;j++){
                if(minElement>array[j]){
                    minElement=array[j];
                    minElementIndex=j;
                }
            }
            array[minElementIndex]=array[i];
            array[i]=minElement;
        }
    }




    //Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
    public void swapData(int[] array,int indexA,int indexB){
        int temp=array[indexA];
        array[indexA]=array[indexB];
        array[indexB]=temp;
    }
    public void bubbleSort(int[] array){
        for(int i=0;i<array.length;i++){
            boolean swapFlag=false;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]) {
                    swapFlag=true;
                    swapData(array,j,j+1);
                }
            }
            if(!swapFlag) break;
        }
    }



    /*
    Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
    */
    public void insertionSort(int @NotNull [] array){
        for(int i=1;i<array.length;i++){
            int startIndex = i-1;
            int item=array[i];
            while (startIndex>=0 && item<array[startIndex]){
                array[startIndex+1]=array[startIndex];
                startIndex--;
            }
            startIndex++;
            array[startIndex]=item;
        }
    }

}

class tested{
    public static void main(String[] arr){
       sortingFunction F=new sortingFunction();
        int[] Array ={10,20,30,23,43,23,56,54,32,53,60,1,23,6,3,54};
        F.selectionSort(Array);
        for (int value : Array) System.out.print(value + "  ");
        System.out.println();
        F.bubbleSort(Array);
        for (int k : Array) System.out.print(k + "  ");
        System.out.println();
        F.insertionSort(Array);
        for (int j : Array) System.out.print(j + "  ");
        System.out.println();
    }
}
