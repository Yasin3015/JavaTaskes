import java.util.Scanner;
public class Quick_sort{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int The_length = Integer.parseInt(obj.nextLine());
        int arr[] = new int[The_length];
        for (int i = 0 ; i < The_length ; i++){
            System.out.print("Enter the number in index " + i + " of the array : ");
            arr[i] = Integer.parseInt(obj.nextLine());
        }
        quicksort(arr, 0 , (The_length - 1));
        for(int i = 0 ; i<arr.length ; i++){
            System.err.println(arr[i]);     
        } 
    }
    // make partition to the array and check the pivot 
    public static int part(int arr[], int  start , int end) {
        int pivot = arr[end];//the value in index start 
        int Start = (start-1);//index of the right postion of the pivot

        // an object from the public class to make swap 
        Quick_sort obj = new Quick_sort();
        for (int j = start; j < end ; j++) {
            if (arr[j] <= pivot) {
                Start++;
                swap(arr,Start,j);
            }
        }
        //swap the end with the start when the start become grater than the end 
        swap(arr,Start+1,end);
        return Start+1; // return the current index of the pivot 
    }
    // swap two values 
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void quicksort(int arr[] , int st , int last) {
        if(st<last){
            int piv = part(arr, st, last);//get the index of the pivot 
            quicksort(arr, st , piv - 1);// make a quick sort for the left side of the pivot 
            quicksort(arr, (piv + 1) , last);// make a quick sort for the right side of the pivot 
        }
    }
}


    
    