public class CountingDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 2, 3, 3, 3, 7, 8, 8, 8, 89 };
        //Method 1 : USING XOR OPERATION
        if (arr.length == 0) {
            System.out.println(0);
        } else {
            int cnt = 1;
            for (int i = 1; i < arr.length; i++) {
                if ((arr[i - 1] ^ arr[i]) != 0) {
                    cnt++;
                }

            }
            System.out.println(cnt);
        }
        
/*---------------------------------------------------------------------------------------------------------------------------------- */

        //Method 2 : USING COMPARISION OPERATOR 
        if (arr.length == 0) {
            System.out.println(0);
        } else {
            int cnt1 = 1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] != arr[i]) {
                    cnt1++;
                }
            }
            System.out.println(cnt1);
        }
    }

}
