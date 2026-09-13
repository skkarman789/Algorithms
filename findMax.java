public class findMax {
    public static void main(String[] args){
        int max=Integer.MIN_VALUE;
        int[] arr={1,4,7,8,3,89,9,3,34};
        //task is to find the max without sorting 
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
