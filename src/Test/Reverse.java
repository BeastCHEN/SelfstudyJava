package Test;

public class Reverse {
    public static void main(String[] args) {
        int [] arr={19,28,37,45,50};
        for (int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int x=0;x<arr.length;x++){
            if (x==arr.length-1){
                System.out.print(arr[x]);
            }else {
                System.out.print(arr[x]+",");
            }
        }
        System.out.print("]");
    }
}
