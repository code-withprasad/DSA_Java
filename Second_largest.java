package funfolder;
import java.util.Scanner;
public class Second_largest {
    public static int[] take_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a length of an array ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0;i<len;i++){
            System.out.println(" Enter a value for index "  + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int secondlargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;
        for(int  i =0;i<arr.length;i++){
            if(arr[i]>largest){
                seclarge = largest;
                largest = arr[i];
            }
        }
       return  seclarge;
    }

    public static void main(String[] args) {
        int[] arr = take_input();
        int res = secondlargest(arr);
        System.out.println(" Second largest elemnt is "  + res);
    }
}
