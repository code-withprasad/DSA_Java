package funfolder;
import java.util.Scanner;
public class Largest_Elm {

    public static int[] take_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a length of an array ");
        int len  = sc.nextInt();
        int[] arr = new int[len];
        for(int  i = 0;i<len;i++){
            System.out.println(" Enter a value for index " + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int find_largest(int[] arr){
       int largest = arr[0];
       for(int  i =1;i<arr.length;i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
       }
       return largest;
    }
    public static void main(String[] args) {
        int[] arr = take_input();
        int res = find_largest(arr);
        System.out.println(" Largest elemnt in given array is " +  res);
    }
    
}
