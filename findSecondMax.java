import java.util.Arrays;

import java.util.Comparator;


public class findSecondMax {
    public static void main(String[] args) {
        int[] arr={1,4,7,8,3,89,9,3,34};
        // using bubble sort 
        // as we know that in 2nd iteration the 2nd max element will be at 2nd last place
        // TC : O(N)
        // SC : O(1)
        for(int i=0;i<2;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }

            }
        }
        System.out.println(arr[arr.length-2]);
/*------------------------------------------------------------------------------------------------------------------------*/
         
        int[] arr1={1,4,7,8,3,89,9,3,34};

        // using stream API
        // Collections.sort(arr);

        // TC : O(n log n)

        int x=Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(x);
        
        /* NOTE : Comparator.reverseOrder() works with objects such as Integer, not primitive int. */

        /* But the main question arises  Why did we used .boxed ->  we use it because  we are using int[] , Java creates an IntStream, not a normal Stream<Integer>.

        hence we have to works with objects such as Integer, not primitive int.

        .boxed converts Int stream to Stream<Integer> : 

                IntStream
                    ↓ .boxed()
                Stream<Integer>
                            
        
        */

/*------------------------------------------------------------------------------------------------------------------------*/

        // using 2 variables (very good apporach but it can't handle if numbers are not distinct)

        // TC: O(n)
        int[] arr2={1,4,7,8,3,89,9,3,34};
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        
        for(int i=0;i<arr2.length;i++){
            if (arr2[i] > firstMax) {
            secondMax = firstMax;
            firstMax = arr2[i];
            } else if (arr2[i] > secondMax) {
                secondMax = arr2[i];
            }
        }
        System.out.println(secondMax);

/*------------------------------------------------------------------------------------------------------------------------*/

        // using 2 variables (very good apporach can handle if numbers are not unique )
        // but there is a catch if no second max then it will return Integer.MIN_VALUE
        //example [5,5,5]  after the iteration the output will be Integer.MIN_VALUE

         // TC: O(n)

        int[] arr3={1,4,7,8,3,89,9,3,34};
        int firstMaxx=Integer.MIN_VALUE;
        int secondMaxx=Integer.MIN_VALUE;
        
        for(int i=0;i<arr3.length;i++){
            if (arr3[i] > firstMaxx) {
            secondMaxx = firstMaxx;
            firstMaxx = arr3[i];
            } else if (arr3[i] > secondMaxx && arr3[i] != firstMax ) {
                secondMaxx = arr3[i];
            }
        }
        System.out.println(secondMaxx);

       

    }
    
}
