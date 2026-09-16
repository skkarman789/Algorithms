import java.util.*;

public class RemovingDuplicatesFromSortedArray {
    /* PROBLEM STATEMENT: Given a sorted integer array, remove the duplicates in-place so that each unique element appears only once.

                          Return the number of unique elements. */
    /* EXAMPLE 1: 
        Input:
        [1, 1, 2]

        Output:
        2

        Array should become:
        [1, 2, ...] */

     /* EXAMPLE 2: 
        Input:
        [0, 0, 1, 1, 1, 2, 2, 3]

        Output:
        4

        Array should become:
        [0, 1, 2, 3, ...] */

        /* CONSTRAINTS : 
                        Don't create another array.
                        Aim for O(n) time.
                        Use O(1) extra space. */
      
        public static void main(String[] args) {
            int[] arr={1,1,1,1,2,2,3,3,3,8,8,8,8,9,9,9};
                for(int i=0;i<arr.length;){
                    System.out.println(arr[i]);
                    int j=i+1;
                    if(j<arr.length && arr[i]!=arr[j]){
                        i++;
                        continue;

                    }
                    else if(j<arr.length && arr[i]==arr[j]){
                        while(j<arr.length && arr[i]==arr[j]){
                            j++;
                        }
                        i=j;
                    }
                    
                }
            for(int i=0;i<arr.length;i++){
                int j=i;
                if(j<arr.length && arr[i]!=arr[j]){
                    arr[i]=arr[j];
                    j++;
                }
               
            }
            System.out.println(arr.toString());


        }
    
}
