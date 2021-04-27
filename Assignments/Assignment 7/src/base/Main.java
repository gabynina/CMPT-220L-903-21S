package base;

public class Main{

    public static void main(String[] args) {
        BubbleSort gn = new BubbleSort();
        int arr[] = {67, -34, 78, 12, 56, 1, 90};
        gn.bubbleSort(arr);
        System.out.println("Sorrted array");
        gn.printArray(arr);
    }
}
