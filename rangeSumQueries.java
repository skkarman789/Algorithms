import org.w3c.dom.ranges.Range;

public class rangeSumQueries {
    public static void main(String[] args) {
        /* 
        Range Sum Query
        Given an integer array, answer multiple queries asking for the sum between two indices left and right, inclusive.

        arr = [2, 4, 1, 7, 3, 5]

        Query:

        left = 1
        right = 4

        We need:

        4 + 1 + 7 + 3 = 15
        
        */

       /*
       [2, 4, 1, 7, 3, 5]
       [2,6,7,14,17,23]  //prefix sum
    


       if(i==j){
       return nums[i];
        }
       //apply prefix sum we can solve within O(N);

        */


        int[] arr={2, 4, 1, 7, 3, 5};
        int firstIndex=1;
        int lastIndex=4;

        
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }

        if(firstIndex==lastIndex){
            System.out.println(arr[firstIndex]);
        }
        
        System.out.println(arr[lastIndex]-arr[firstIndex-1]);

    }
    
}
