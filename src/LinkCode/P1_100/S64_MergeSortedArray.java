package LinkCode.P1_100;

/**
 * Created by 18394 on 2017/2/14.
 */
public class S64_MergeSortedArray {
    /**
     * @param A: sorted integer array A which has m elements,
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int k = m + n - 1;
        m--;
        n--;

        while (k >= 0){
            if (n < 0 || (m >= 0 && A[m] >= B[n])){
                A[k--] = A[m--];
            } else {
                A[k--] = B[n--];
            }
        }
    }
}
