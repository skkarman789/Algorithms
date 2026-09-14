import java.util.*;
public class findMax {
    public static void main(String[] args){
        int max=Integer.MIN_VALUE;
        int[] arr={1,4,7,8,3,89,9,3,34};
        //task is to find the max without sorting 
        // method 1 using simple logic            
        // TC : O(N)
        // SC : O(1)

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        //method 2 using stream api
        // TC : O(N)
        // SC : O(1)

        int x=Arrays.stream(arr).max().getAsInt();
        System.out.println(x);

        // method 3 using bubblesort
        // we know that in bubbble sort at the end of first iteration the max value will be at end of 1st iteration 
        // TC : O(N)
        // SC : O(1)

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
        System.out.println(arr[arr.length-1]);;
    }
}
