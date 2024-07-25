// Leetcode 26. Remove Duplicates from Sorted Array
package funfolder;
import java.util.Scanner;
public class Remove_Duplicate_Sorted_Array {
    public static int[] take_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a length of an array ");
        int len = sc.nextInt();
        int[] arr  =  new int[len];
        for(int i = 0;i<len;i++){
            System.out.println(" Enter a value for index " + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // inputs 
    // [1,1,2] =>  [1,2,_] || [0,0,1,1,1,2,2,3,3,4] => [0,1,2,3,4,_,_,_,_,_]

    public static int[] find_duplicate(int[] arr){
         int count = 0;
        for(int i =0;i<arr.length;i++){
            if(i<arr.length-1 && arr[i] == arr[i+1]){
                continue;
            }else{
                arr[count] = arr[i];
                count++;
            }
        }
        return  arr;
    }
    public static void main(String[] args) {
        int[] arr = take_input();
        int[] res = find_duplicate(arr);
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
