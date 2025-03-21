import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Set length of array: ");
        int arrLength = console.nextInt();
        int[] arr = new int[arrLength];

        System.out.println("Set " + arrLength + " integers for array:");
        for(int i = 0; i < arrLength; i++){
            arr[i] = console.nextInt();
        }
        isSorted(arr);
    }

    public static void isSorted(int[] array){
        boolean isSorted = true;
        int temp = array[0];
        for(int num : array) {
            if(num < temp) isSorted = false;
            temp = num;
        }
        System.out.println("Is array sorted? Result: " + isSorted);
    }
}