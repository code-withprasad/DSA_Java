// Leetcode 189. Rotate Array
package funfolder;
import java.util.Scanner;
public class Rotate_Array_K_Times {
    public static int[] take_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a length of an array ");
        int len = sc.nextInt();
        int[] arr =new int[len];
        for(int i = 0;i<len;i++){
            System.out.println(" Enter a value for index " + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // [1,2,3,4,5,6,7], k = 3 => [5,6,7,1,2,3,4]
    // creating method to reverse an array 

    public static int[] reverse_Array(int[] arr,int start, int end ){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
      return  arr;
    }
  public static void print_Array(int[] arr){
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i] + " ");
      }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = take_input();
    System.out.println(" Enter a value for k (how many element you want to rotate)");
    int k = sc.nextInt();
    k = k%arr.length;
    int[] res = reverse_Array(arr, 0, arr.length-1);
          res = reverse_Array(arr, 0, k-1);
          res = reverse_Array(arr, k, arr.length-1);
          System.out.println(" Array after rotation ");
          print_Array(res);
  }
}
