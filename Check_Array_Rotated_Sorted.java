// Leetcode  1752 
import java.util.Scanner;
class Check_Array_Rotated_Sorted {
      public static int[] take_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a length of an array ");
        int len  =  sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            System.out.println(" Enter a value for index " + i);
            arr[i] = sc.nextInt();
        }
        return  arr;
      }

      // creating method that check array is rotated and sorted or not 
      // [3,4,5,1,2] => True  || [2,1,3,4] => false

      public static boolean check_Array(int[] arr){
        int count= 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){
              count++;
              if(count>1){
                return  false;
              }
            }
        }
        return  true;
      }
      public static void main(String[] args) {
        int[] arr = take_input();
        boolean res = check_Array(arr);
        if(res == true){
            System.out.println(" the given array is rotated and sorted ");
        }else{
            System.out.println(" the given array is not rotated and sorted ");
        }
      }
}
